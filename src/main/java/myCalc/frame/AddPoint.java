package myCalc.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPoint implements ActionListener {
    JTextField textField;


    AddPoint(JTextField textField){
        this.textField = textField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (textField.getText().contains(".")) {
            textField.setText(textField.getText());
        }else
            textField.setText(textField.getText() + ".");
    }
}
