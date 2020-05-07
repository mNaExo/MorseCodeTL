package morse_tl;

import binary_tree.*;

import javax.swing.*;

import translator_gui.*;
/**
 * Erstellt von maxim
 * 05.05.2020 - 15:09
 * Projekt: MorseCodeTL
 */

public class main {
    public static void main(String[] args) {
        Node wurzel = new Node("", null, Relation.ROOT);
        Tree morseTree = new Tree(wurzel);
        tl_engine translator = new tl_engine(morseTree);

        morseTree.insertMorse(morse_key.A);
        morseTree.insertMorse(morse_key.B);
        morseTree.insertMorse(morse_key.C);
        morseTree.insertMorse(morse_key.D);
        morseTree.insertMorse(morse_key.E);
        morseTree.insertMorse(morse_key.F);
        morseTree.insertMorse(morse_key.G);
        morseTree.insertMorse(morse_key.H);
        morseTree.insertMorse(morse_key.I);
        morseTree.insertMorse(morse_key.J);
        morseTree.insertMorse(morse_key.K);
        morseTree.insertMorse(morse_key.L);
        morseTree.insertMorse(morse_key.M);
        morseTree.insertMorse(morse_key.N);
        morseTree.insertMorse(morse_key.O);
        morseTree.insertMorse(morse_key.P);
        morseTree.insertMorse(morse_key.Q);
        morseTree.insertMorse(morse_key.R);
        morseTree.insertMorse(morse_key.S);
        morseTree.insertMorse(morse_key.T);
        morseTree.insertMorse(morse_key.U);
        morseTree.insertMorse(morse_key.V);
        morseTree.insertMorse(morse_key.W);
        morseTree.insertMorse(morse_key.X);
        morseTree.insertMorse(morse_key.Y);
        morseTree.insertMorse(morse_key.Z);

        JFrame frame = new JFrame("MorseCode Übersetzer");
        frame.setContentPane(new translator_gui(translator).main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
