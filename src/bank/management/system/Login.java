package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardtextfield;
    JPasswordField pintextfield;
    Login() {
        setTitle("ATM machine");//sets title for frame
        setLayout(null);//remove default layout
        getContentPane().setBackground(Color.WHITE);//set BG color as white


        //now we add an image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);

        JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 20));
        cardno.setBounds(120, 150, 400, 40); // changed bounds and font size
        add(cardno);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(120, 220, 400, 40); // changed bounds and font size
        add(pin);

        Font ctf = new Font("Arial", Font.BOLD, 14);
        cardtextfield = new JTextField();
        cardtextfield.setBounds(300, 150, 250, 30); // positioned next to the label
        cardtextfield.setFont(ctf);
        add(cardtextfield);

        pintextfield = new JPasswordField();
        pintextfield.setBounds(300, 220, 250, 30); // positioned next to the label
        add(pintextfield);

        login = new JButton("SIGN UP");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 250, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);


        label.setBounds(70, 10, 100, 100);
        add(label);
        setSize(800, 500);

        setLocation(350, 200);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear){
            cardtextfield.setText("");
            pintextfield.setText("");
        }
        else if (ae.getSource() == login) {

        }
        else if (ae.getSource() == signup) {

        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
