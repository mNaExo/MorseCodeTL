package translator_gui;

import javax.swing.*;

import morse_tl.*;

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
        resetForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField2.setText(translator.decode(morseText.getText()));
            }
        });

        translateBttn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField4.setText(translator.encodeViaRelations(plainText.getText()));
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
