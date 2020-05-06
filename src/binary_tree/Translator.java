package binary_tree;

import java.util.ArrayList;

/**
 * Erstellt von Manhhao
 * 06.05.2020 - 15:48
 * Projekt: MorseCodeTL
 */
public class Translator {

    /**
     * Stellt die Baumstruktur des Morsebaums dar
     * root
     * /  \
     * . /    \ -
     * /      \
     * node   node
     * bewegt man sich nach links, ist val = val + "."
     * bewegt man sich nach rechts, ist val = val + "-"
     */
    private final Tree tree;

    /**
     * Der Konstruktor Translator()
     * Erstellt den Baum und platziert anhand des Morsecodes die Buchstaben an die richtige Stelle
     */
    public Translator() {
        tree = new Tree(new Node(""));

        // addMorseToTree(".", "E");
    }

    /**
     * Methode zum Übersetzen von Text zu Morsecode;
     * Beschreibung folgt...
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
}
