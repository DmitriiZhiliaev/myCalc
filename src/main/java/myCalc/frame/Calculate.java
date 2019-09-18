package myCalc.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate implements ActionListener {
    float first, second, res;
    JTextField textField;
    //String action;
    Frame frame;


    Calculate(JTextField textField, Frame frame){

        this.textField = textField;
        //this.action = action;
        this.frame = frame;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(frame.action);
        if (frame.action.equals("+")) {
            res = frame.first + Float.parseFloat(textField.getText());
            System.out.println(res);
            textField.setText(String.valueOf(res));
        }else
        if (frame.action.equals("-")) {
            res = frame.first - Float.parseFloat(textField.getText());
            System.out.println(res);
            textField.setText(String.valueOf(res));
        }else
        if (frame.action.equals("*")) {
            res = frame.first * Float.parseFloat(textField.getText());
            System.out.println(res);
            textField.setText(String.valueOf(res));
        }else
        if (frame.action.equals("/")) {
            res = frame.first / Float.parseFloat(textField.getText());
            System.out.println(res);
            textField.setText(String.valueOf(res));
        }

    }
}
