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
        
        JButton stregi = new JButton("Student Registration");
        stregi.setBackground(Color.GREEN);
        stregi.setForeground(Color.BLACK);
        stregi.setBounds(240, 90, 300, 40);
        add(stregi);
        
        JButton bookavail = new JButton("Books Available");
        bookavail.setBackground(Color.GREEN);
        bookavail.setForeground(Color.BLACK);
        bookavail.setBounds(240, 150, 300, 40);
        add(bookavail);
        
        JButton addbook = new JButton("Add Books");
        addbook.setBackground(Color.GREEN);
        addbook.setForeground(Color.BLACK);
        addbook.setBounds(240, 210, 300, 40);
        add(addbook);
        
        JButton isubook = new JButton("Issu Books");
        isubook.setBackground(Color.GREEN);
        isubook.setForeground(Color.BLACK);
        isubook.setBounds(240, 270, 300, 40);
        add(isubook);
        
        JButton rtnbook = new JButton("Return Books");
        rtnbook.setBackground(Color.GREEN);
        rtnbook.setForeground(Color.BLACK);
        rtnbook.setBounds(240, 330, 300, 40);
        add(rtnbook);
        
        JButton sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(340, 390, 100, 40);
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