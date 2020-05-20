package translator_gui;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import morse_tl.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Erstellt von maxim
 * 05.05.2020 - 15:11
 * Projekt: MorseCodeTL
 */

public class translator_gui {
    private JTextField morseText;
    private JButton resetForm;
    private JTextField textField2;
    public JPanel main;
    private JTextField plainText;
    private JRadioButton txtToMorse;
    private JRadioButton morseToTxt;
    private JButton translateBttn;
    private JTextField textField4;

    public translator_gui(tl_engine translator) {
        // radios.add(txtToMorse);
        // radios.add(morseToTxt);
        resetForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                plainText.setText("");
                morseText.setText("");
            }
        });

        translateBttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtToMorse.isSelected() && !morseToTxt.isSelected()) {
                    String t = plainText.getText().toUpperCase();
                    String m = translator.encodeViaRelations(t);
                    morseText.setText(m);
                } else if (morseToTxt.isSelected() && !txtToMorse.isSelected()) {
                    String m = morseText.getText();
                    String t = translator.decode(m);
                    plainText.setText(t);
                }
            }
        });
    }

}
