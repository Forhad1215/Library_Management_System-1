package library_management_system;

import javax.swing.*;
import java.awt.*;

public class Add_Book extends JFrame {
    
    Add_Book(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel addbook = new JLabel("Add Book");
        addbook.setFont(new Font("Osward",Font.BOLD,50));
        addbook.setBounds(230, 10, 400, 60);
        add(addbook);
        
        JLabel bookid = new JLabel("Book ID");
        bookid.setFont(new Font("Raleway",Font.BOLD,20));
        bookid.setBounds(100, 65, 200, 90);
        add(bookid);
        
        JTextField bookidTextField = new JTextField();
        bookidTextField.setBounds(370, 90, 300, 40);
        add(bookidTextField);
        
        JLabel bookname = new JLabel("Book Name");
        bookname.setFont(new Font("Raleway",Font.BOLD,20));
        bookname.setBounds(100, 120, 200, 90);
        add(bookname);
        
        JTextField booknameTextField = new JTextField();
        booknameTextField.setBounds(370, 150, 300, 40);
        add(booknameTextField);
        
        JLabel pub = new JLabel("Publisher");
        pub.setFont(new Font("Raleway",Font.BOLD,20));
        pub.setBounds(100, 209, 200, 40);
        add(pub);
        
        JTextField pubTextField = new JTextField();
        pubTextField.setBounds(370, 210, 300, 40);
        add(pubTextField);
        
        JLabel edi = new JLabel("Edition");
        edi.setFont(new Font("Raleway",Font.BOLD,20));
        edi.setBounds(100, 270, 200, 40);
        add(edi);
        
        JTextField ediTextField = new JTextField();
        ediTextField.setBounds(370, 270, 300, 40);
        add(ediTextField);
        
        JLabel count = new JLabel("Count");
        count.setFont(new Font("Raleway",Font.BOLD,20));
        count.setBounds(100, 330, 200, 40);
        add(count);
        
        JTextField countTextField = new JTextField();
        countTextField.setBounds(370, 330, 300, 40);
        add(countTextField);
        
        JLabel cate = new JLabel("Category");
        cate.setFont(new Font("Raleway",Font.BOLD,20));
        cate.setBounds(100, 390, 200, 40);
        add(cate);
        
        JTextField cateTextField = new JTextField();
        cateTextField.setBounds(370, 390, 300, 40);
        add(cateTextField);
        
        JButton sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(330, 450, 100, 40);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,550);
        setVisible(true);
        setLocation(300,110);
        
        
        }
    
    
    public static void main(String[] args) {
        new Add_Book ();
    }
    
    
    
}
