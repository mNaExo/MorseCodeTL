package morse_tl;

import binary_tree.*;

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
     * Methode zum Übersetzen eines Buchstaben von Morsecode zu Text
     * Nutzt das gleiche Prinzip wie addMorseToTree(String morseCode, String letter):
     * Durchläuft jedes einzelne Zeichen von morseCode und bewegt sich je
     * nachdem ob der jetzige Buchstabe . oder - ist nach links oder rechts.
     * Sollte ein Knoten, der durchlaufen wird, ungültig sein, so wird boolean valid
     * auf false gesetzt und es wird nichts ausgegeben.
     * Falls erfolgreich jedes Zeichen durchlaufen wird, so wird der Wert des jetzigen Knotens zurückgegeben
     * <p>
     * Wichtig: übersetzt nur ein Zeichen!!!
     *
     * @param morseCode der zu übersetzende Code
     * @return das übersetzte Zeichen
     */
    private String encode(String morseCode) {
        Node current = tree.getRoot();
        boolean valid = true;
        for (int i = 0; i < morseCode.length(); i++) {
            String direction = morseCode.substring(i, i + 1);

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
            return current.getVal();

        return "";
    }

    /**
     * @param morse der in Morsecode geschriebene
     * @return der übersetzte Text
     * Erweiterung der Methode encode(String morseCode) um kompletten Text zu Übersetzen
     * der Parameter morse wird in ein Array geteilt und jedes Zeichen einzeln übersetzt
     */
    public String morseToText(String morse) {
        /* Der String in dem sich später alle Zeichen befinden sollen */
        String uebersetzung = "";

        /*
         * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String), der String wird am Slash in mehrere einzelne Strings geteilt
         * und in ein Array gegeben
         */
        String[] zeichenArray = morse.split("/");

        /*
         * Eine sogenannte for each-Schleife, hier wird nicht wie bei einer normalen for-Schleife mithilfe einer Variable iteriert, sondern es wird durch
         * alle Objekte eines Arrays iteriert, viel einfacher als eine for-Schleife dafür zu benutzen.
         */
        for (String a : zeichenArray) {
            /* Addiere einfach den übersetzten Buchstaben auf die bisher übersetzten Buchstaben, es sollte am Ende jeder Buchstabe übersetzt sein */
            uebersetzung += encode(a);
        }

        return uebersetzung;
    }

}
