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
    private String decode(String pPlainText) {

        // Hier soll später das Ergebnis rein
        String decodedText = "";

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

        return decodedText;
    }

    /**
     * Methode zum Übersetzen eines Buchstaben von Morsecode zu Text
     * Nutzt das gleiche Prinzip wie addMorseToTree(String morseCode, String letter):
     * Der String morseCode wird zunächst an den / in mehrere Strings geteilt und jedes der
     * Strings mithilfe einer Schleife durchlaufen.
     * Durchläuft jedes einzelne Zeichen von singleMorse und bewegt sich je
     * nachdem ob der jetzige Buchstabe . oder - ist nach links oder rechts.
     * Sollte ein Knoten, der durchlaufen wird, ungültig sein, so wird boolean valid
     * auf false gesetzt und es wird nichts auf uebersetzung addiert.
     * Falls erfolgreich jedes Zeichen durchlaufen wird, so wird der Wert des jetzigen Knotens addiert.
     * <p>
     * @param morseCode der in Morsecode geschriebene Text
     * @return der übersetzte Text
     */
    public String encode(String morseCode) {
        /* Der String in dem sich später alle Zeichen befinden sollen */
        String uebersetzung = "";

        /*
         * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String), der String wird am Slash in mehrere einzelne Strings geteilt
         * und in ein Array gegeben
         */
        String[] morseArray = morseCode.split("/");

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
                uebersetzung += current.getVal();
        }
        return uebersetzung;
    }
}
