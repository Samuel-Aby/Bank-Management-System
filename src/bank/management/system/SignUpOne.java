package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUpOne extends JFrame {
    SignUpOne(){

        setLayout(null);//to remove border layout

        Random ran = new Random();
        int randomNumber = ran.nextInt(900000) + 100000; // Generate a number between 100000 and 999999
        JLabel formno = new JLabel("APPLICATION FORM NO " + randomNumber );
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        //make bg for whole frame white
        getContentPane().setBackground(Color.WHITE);
        //make the whole frame
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignUpOne();
    }
}
