package myCalc.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastValueAndActionSaver implements ActionListener {
    JTextField textField;
    String action;
    Frame frame;

    LastValueAndActionSaver(JTextField textField, Frame frame, String action){
        this.textField = textField;
        this.frame = frame;
        this.action = action;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        frame.first = Float.parseFloat(textField.getText());
        frame.action = action;
        textField.setText("");

        //System.out.println(myCalc.frame.first);
        //System.out.println(myCalc.frame.action);
    }
}
