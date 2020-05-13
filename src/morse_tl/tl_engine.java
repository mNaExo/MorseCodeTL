package morse_tl;

import binary_tree.*;

import java.util.ArrayList;

/**
 * Erstellt von maxim
 * 06.05.2020 - 21:04
 * Projekt: MorseCodeTL
 */
public class tl_engine {

    Tree tree;

    public tl_engine(Tree pTree) {
        this.tree = pTree;
    }

    /**
     * Methode zum Übersetzen von Text zu Morsecode;
     * Beschreibung folgt...
     *
     * @param pPlainText der zu übersetzende Text
     * @return übersetztes Zeichen
     */
    private String encode(String pPlainText) {

        // Hier soll später das Ergebnis rein
        String encodedText = "";

        // Mehrstufige Aufteilung des Eingabestrings
        // Zuerst: in Sätze / Lines aufteilen
        String[] plainTextLines = pPlainText.split(". ");

        // Dann: in Wörter aufteilen
        String[] plainTextWords = pPlainText.split(" ");

        //Zueletzt: in Buchstaben aufteilen
        String[] plainTextLetters = pPlainText.split("\\p{Alpha}+");

        String currentLine;

        ArrayList<String> decodedLines = new ArrayList<>();

        // while ()

        return encodedText;
    }

    /**
     * Methode zum Übersetzen eines Buchstaben von Morsecode zu Text
     * Nutzt das gleiche Prinzip wie addMorseToTree(String morseCode, String letter):
     * Der String morseCode wird zunächst an den Leerzeichen in mehrere Strings geteilt und jedes der
     * Strings mithilfe einer Schleife durchlaufen.
     * Durchläuft jedes einzelne Zeichen von singleMorse und bewegt sich je
     * nachdem ob der jetzige Buchstabe . oder - ist nach links oder rechts.
     * Sollte ein Knoten, der durchlaufen wird, ungültig sein, so wird boolean valid
     * auf false gesetzt und es wird nichts auf uebersetzung addiert.
     * Falls erfolgreich jedes Zeichen durchlaufen wird, so wird der Wert des jetzigen Knotens addiert.
     * <p>
     * @param pMorseCode der in Morsecode geschriebene Text
     * @return der übersetzte Text
     */
    public String decode(String pMorseCode) {
        /* Der String in dem sich später alle Zeichen befinden sollen */
        String decodedText = "";

        /*
         * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String), der String wird am Slash in mehrere einzelne Strings geteilt
         * und in ein Array gegeben
         */
        String[] morseArray = pMorseCode.split(" ");

        /*
         * Eine sogenannte for each-Schleife, hier wird nicht wie bei einer normalen for-Schleife mithilfe einer Variable iteriert, sondern es wird durch
         * alle Objekte eines Arrays iteriert, viel einfacher als eine for-Schleife dafür zu benutzen.
         */
        for (String singleMorse : morseArray) {
            Node current = tree.getRoot();
            boolean valid = true;
            for (int i = 0; i < singleMorse.length(); i++) {
                String direction = singleMorse.substring(i, i + 1);

                if (direction.equals(".")) {
                    if (current.getLeftSubNode() == null) {
                        valid = false;
                        break;
                    } else {
                        current = current.getLeftSubNode();
                    }
                } else if (direction.equals("-")) {
                    if (current.getRightSubNode() == null) {
                        valid = false;
                        break;
                    } else {
                        current = current.getRightSubNode();
                    }
                }
            }
            if (valid)
                decodedText += current.getVal();
        }
        return decodedText;
    }

    public String encodeViaRelations(String pText) {
        String encodedText = "";

        String upperCase = pText.toUpperCase();
        for (int i = 0; i < pText.length(); i++) {
            String morseKey = "";
            ArrayList<Relation> relations = new ArrayList<>();
            String currentLetter = upperCase.substring(i, i + 1);
            Node node = tree.preOrderSearch(tree.getRoot(), currentLetter);

            while (node != null) {
                if (node.getRelToSupNode() == Relation.LEFT) {
                   relations.add(Relation.LEFT);
                   node = node.getSupNode();
                }
                else if (node.getRelToSupNode() == Relation.RIGHT) {
                    relations.add(Relation.RIGHT);
                    node = node.getSupNode();
                }
                else if (node.getRelToSupNode() == Relation.ROOT){
                    break;
                }
            }

            for (int j = relations.size() - 1; j >= 0; j--) {
                if (relations.get(j) == Relation.LEFT)
                    morseKey += ".";
                else if (relations.get(j) == Relation.RIGHT)
                    morseKey += "-";
            }

            encodedText += morseKey += " ";
        }
        return encodedText;
    }
}
