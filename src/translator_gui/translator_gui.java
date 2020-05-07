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
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    public JPanel main;
    private JTextField textField3;
    private JButton button2;
    private JTextField textField4;

    public translator_gui(tl_engine translator) {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField2.setText(translator.decode(textField1.getText()));
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField4.setText(translator.encodeViaRelations(textField3.getText()));
            }
        });
    }
}
