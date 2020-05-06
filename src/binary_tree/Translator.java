package binary_tree;

/**
 * Erstellt von Manhhao
 * 06.05.2020 - 15:48
 * Projekt: MorseCodeTL
 */
public class Translator {

    /**
     * Stellt die Baumstruktur des Morsebaums dar
     *                    root
     *                    /  \
     *                 . /    \ -
     *                  /      \
     *                node   node
     * bewegt man sich nach links, ist val = val + "."
     * bewegt man sich nach rechts, ist val = val + "-"
     */
    private Tree tree;

    /**
     * Der Konstruktor Translator()
     * Erstellt den Baum und platziert anhand des Morsecodes die Buchstaben an die richtige Stelle
     */
    public Translator() {
        tree = new Tree(new Node(""));

        addMorseToTree(".", "E");
    }

    /**
     * @param letter der zu hinzufügende Buchstabe
     * @param morseCode der entsprechende Morsecode des Buchstaben
     * Durchläuft jedes einzelne Zeichen von morseCode und bewegt sich je
     * nachdem ob der jetzige Buchstabe . oder - ist nach links oder rechts.
     * Sind alle Zeichen durchlaufen, wird letter als Wert des jetzigen
     * Knotens gesetzt.
     */
    private void addMorseToTree(String morseCode, String letter) {
        Node position = tree.getRoot();

        for (int i = 0; i < morseCode.length(); i++) {
            String direction = morseCode.substring(i, i + 1);

            if (direction.equals(".")) {
                if (position.getLeftSubNode() == null)
                    position.setLeftSubNode(new Node(null));

                position = position.getLeftSubNode();
            }
            else if (direction.equals("-")) {
                if (position.getRightSubNode() == null)
                    position.setRightSubNode(new Node(null));

                position = position.getRightSubNode();
            }
        }
        position.setVal(letter);
    }

    /**
     * @param morseCode der zu übersetzende Code
     * @return das übersetzte Zeichen
     * Methode zum Übersetzen eines Buchstaben von Morsecode zu Text
     * Nutzt das gleiche Prinzip wie addMorseToTree(String morseCode, String letter):
     * Durchläuft jedes einzelne Zeichen von morseCode und bewegt sich je
     * nachdem ob der jetzige Buchstabe . oder - ist nach links oder rechts.
     * Sollte ein Knoten, der durchlaufen wird, ungültig sein, so wird boolean valid
     * auf false gesetzt und es wird nichts ausgegeben.
     * Falls erfolgreich jedes Zeichen durchlaufen wird, so wird der Wert des jetzigen Knotens zurückgegeben
     *
     * Wichtig: übersetzt nur ein Zeichen!!!
     */
    private String translate(String morseCode) {
        Node position = tree.getRoot();
        boolean valid = true;
        for (int i = 0; i < morseCode.length(); i++) {
            String direction = morseCode.substring(i, i + 1);

            if (direction.equals(".")) {
                if (position.getLeftSubNode() == null) {
                    valid = false;
                    break;
                }
                else {
                    position = position.getLeftSubNode();
                }
            }
            else if (direction.equals("-")) {
                if (position.getRightSubNode() == null) {
                    valid = false;
                    break;
                }
                else {
                    position = position.getRightSubNode();
                }
            }
        }

        if (valid)
            return position.getVal();

        return "";
    }

    /**
     * @param morse der in Morsecode geschriebene
     * @return der übersetzte Text
     * Erweiterung der Methode translate(String morseCode) um kompletten Text zu Übersetzen
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
            uebersetzung += translate(a);
        }

        return uebersetzung;
    }
}
