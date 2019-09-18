package myCalc.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PutValue implements ActionListener {
    int num;
    JTextField textField;
    boolean editable_flag;





    PutValue(int num, JTextField textField, boolean editable_flag){
        this.num = num;
        this.textField = textField;
        this.editable_flag = editable_flag;


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (textField.getText().equals("0") && !editable_flag)
            {
            textField.setText("0");
        }else
            if(textField.getText().equals("0"))
                {
                    textField.setText(String.valueOf(num));
                }else {
                    textField.setText(textField.getText() + String.valueOf(num));
            }
    }
}
