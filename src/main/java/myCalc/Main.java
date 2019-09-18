package myCalc;

import myCalc.frame.Frame;

import javax.swing.*;

public class Main implements Runnable{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());


    }

    @Override
    public void run() {
        Frame frame = new Frame();
        frame.setSize(600,900);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
