
package library_management_system;

import javax.swing.*;
import java.awt.*;
public class Registra_tion extends JFrame {
    
    Registra_tion(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel regi = new JLabel("Registration");
        regi.setFont(new Font("Osward",Font.BOLD,50));
        regi.setBounds(230, 10, 400, 60);
        add(regi);
        
        JLabel nam = new JLabel("Name");
        nam.setFont(new Font("Raleway",Font.BOLD,30));
        nam.setBounds(140, 90, 200, 40);
        add(nam);
        
        JTextField namTextField = new JTextField();
        namTextField.setBounds(270, 90, 300, 40);
        add(namTextField);
        
        JLabel userID = new JLabel("User ID");
        userID.setFont(new Font("Raleway",Font.BOLD,30));
        userID.setBounds(140, 150, 200, 40);
        add(userID);
        
        JTextField userIDTextField = new JTextField();
        userIDTextField.setBounds(270, 150, 300, 40);
        add(userIDTextField);
        
        JLabel mail = new JLabel("Email ID");
        mail.setFont(new Font("Raleway",Font.BOLD,30));
        mail.setBounds(140, 210, 200, 40);
        add(mail);
        
        JTextField mailTextField = new JTextField();
        mailTextField.setBounds(270, 210, 300, 40);
        add(mailTextField);
        
        JLabel cont = new JLabel("Contact");
        cont.setFont(new Font("Raleway",Font.BOLD,30));
        cont.setBounds(140, 270, 200, 40);
        add(cont);
        
        JTextField contTextField = new JTextField();
        contTextField.setBounds(270, 270, 300, 40);
        add(contTextField);
        
        JButton sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(330, 340, 100, 40);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,500);
        setVisible(true);
        setLocation(300,110);
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        new Registra_tion ();
    }
    
}
