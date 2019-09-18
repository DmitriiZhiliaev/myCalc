package myCalc.frame;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public float first;
    public String action;

    public Frame(){
        this.setTitle("Calculator");
        Container container_result = this.getContentPane();
       //container_result.setLayout(new GridLayout(1,3));

        JPanel panel_1 = new JPanel();
        container_result.add(panel_1);

        JPanel panel_2 = new JPanel();
        container_result.add(panel_2);

        JPanel panel_3 = new JPanel();
        container_result.add(panel_3);


        JTextField textField = new JTextField("0", SwingConstants.CENTER);
        textField.setEditable(false);
        textField.setName("display");
        container_result.add(textField);




        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7,1));

        JButton button_percent = new JButton("%");
        container.add(button_percent);

        JButton button_root = new JButton("root");
        container.add(button_root);

        JButton button_pow = new JButton("x2");
        container.add(button_pow);

        JButton button_1_x = new JButton("1/x");
        container.add(button_1_x);

        JButton button_ce = new JButton("CE");
        container.add(button_ce);

        JButton button_c = new JButton("C");
        container.add(button_c);

        JButton button_back = new JButton("<-");
        container.add(button_back);

        JButton button_div = new JButton("/");
        button_div.addActionListener(new LastValueAndActionSaver(textField, this, "/"));
        container.add(button_div);

        JButton button_7 = new JButton("7");
        button_7.addActionListener(new PutValue(7, textField, true));
        container.add(button_7);

        JButton button_8 = new JButton("8");
        button_8.addActionListener(new PutValue(8, textField, true));
        container.add(button_8);

        JButton button_9 = new JButton("9");
        button_9.addActionListener(new PutValue(9, textField, true));
        container.add(button_9);

        JButton button_x = new JButton("X");
        button_x.addActionListener(new LastValueAndActionSaver(textField, this, "*"));
        container.add(button_x);

        JButton button_4 = new JButton("4");
        button_4.addActionListener(new PutValue(4, textField, true));
        container.add(button_4);

        JButton button_5 = new JButton("5");
        button_5.addActionListener(new PutValue(5, textField, true));
        container.add(button_5);

        JButton button_6 = new JButton("6");
        button_6.addActionListener(new PutValue(6, textField, true));
        container.add(button_6);

        JButton button_minus = new JButton("-");
        button_minus.addActionListener(new LastValueAndActionSaver(textField, this, "-"));
        container.add(button_minus);

        JButton button_1 = new JButton("1");
        button_1.addActionListener(new PutValue(1, textField,true));
        container.add(button_1);

        JButton button_2 = new JButton("2");
        button_2.addActionListener(new PutValue(2, textField, true));
        container.add(button_2);

        JButton button_3 = new JButton("3");
        button_3.addActionListener(new PutValue(3, textField,true));
        container.add(button_3);

        JButton button_plus = new JButton("+");
        button_plus.addActionListener(new LastValueAndActionSaver(textField, this, "+"));
        container.add(button_plus);



        JButton button_plus_minus = new JButton("+-");
        container.add(button_plus_minus);

        JButton button_0 = new JButton("0");
        button_0.addActionListener(new PutValue(0, textField, false));
        button_0.setName("0");
        container.add(button_0);

        JButton button_point = new JButton(",");
        button_point.addActionListener(new AddPoint(textField));
        container.add(button_point);

        JButton button_result = new JButton("=");
        button_result.addActionListener(new Calculate(textField, this));
        container.add(button_result);







    }
}
