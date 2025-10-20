package library_management_system;

import javax.swing.*;
import java.awt.*;
public class Ho_me  extends JFrame {
    
    Ho_me(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel home = new JLabel("Home");
        home.setFont(new Font("Osward",Font.BOLD,50));
        home.setBounds(330, 10, 400, 60);
        add(home);
        
        JLabel nam = new JLabel("Student Registration");
        nam.setFont(new Font("Raleway",Font.BOLD,20));
        nam.setBounds(100, 65, 200, 90);
        add(nam);
        
        JTextField namTextField = new JTextField();
        namTextField.setBounds(370, 90, 300, 40);
        add(namTextField);
        
        JLabel userID = new JLabel("Books Available");
        userID.setFont(new Font("Raleway",Font.BOLD,20));
        userID.setBounds(100, 120, 200, 90);
        add(userID);
        
        JTextField userIDTextField = new JTextField();
        userIDTextField.setBounds(370, 150, 300, 40);
        add(userIDTextField);
        
        JLabel mail = new JLabel("Add Books");
        mail.setFont(new Font("Raleway",Font.BOLD,20));
        mail.setBounds(100, 209, 200, 40);
        add(mail);
        
        JTextField mailTextField = new JTextField();
        mailTextField.setBounds(370, 210, 300, 40);
        add(mailTextField);
        
        JLabel cont = new JLabel("Issu Books");
        cont.setFont(new Font("Raleway",Font.BOLD,20));
        cont.setBounds(100, 270, 200, 40);
        add(cont);
        
        JTextField contTextField = new JTextField();
        contTextField.setBounds(370, 270, 300, 40);
        add(contTextField);
        
        JLabel retu = new JLabel("Return Books");
        retu.setFont(new Font("Raleway",Font.BOLD,20));
        retu.setBounds(100, 330, 200, 40);
        add(retu);
        
        JTextField retuTextField = new JTextField();
        retuTextField.setBounds(370, 330, 300, 40);
        add(retuTextField);
        
        JButton sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(330, 390, 100, 40);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,500);
        setVisible(true);
        setLocation(300,110);
        
        
        
    }
    
    
    
    public static void main(String[] args) {
        new Ho_me ();
    }
    
}