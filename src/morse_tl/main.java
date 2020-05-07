package morse_tl;

import binary_tree.*;

/**
 * Erstellt von maxim
 * 05.05.2020 - 15:09
 * Projekt: MorseCodeTL
 */

public class main {
    public static void main(String[] args) {
        Node wurzel = new Node("", null, Relation.RIGHT);
        Tree morseTree = new Tree(wurzel);
        tl_engine translator = new tl_engine(morseTree);

        morseTree.insertMorse(".", "E");

        System.out.println("E: " + translator.encodeViaRelations("E"));
    }
}
