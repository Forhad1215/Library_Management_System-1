package library_management_system;

import javax.swing.*;
import java.awt.*;

public class Student_Registration extends JFrame {
    
    Student_Registration(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel home = new JLabel("Student Details");
        home.setFont(new Font("Osward",Font.BOLD,50));
        home.setBounds(230, 10, 400, 60);
        add(home);
        
        JLabel nam = new JLabel("Student ID");
        nam.setFont(new Font("Raleway",Font.BOLD,20));
        nam.setBounds(100, 65, 200, 90);
        add(nam);
        
        JTextField namTextField = new JTextField();
        namTextField.setBounds(370, 90, 300, 40);
        add(namTextField);
        
        JLabel userID = new JLabel("Student Name");
        userID.setFont(new Font("Raleway",Font.BOLD,20));
        userID.setBounds(100, 120, 200, 90);
        add(userID);
        
        JTextField userIDTextField = new JTextField();
        userIDTextField.setBounds(370, 150, 300, 40);
        add(userIDTextField);
        
        JLabel mail = new JLabel("Department");
        mail.setFont(new Font("Raleway",Font.BOLD,20));
        mail.setBounds(100, 209, 200, 40);
        add(mail);
        
        String allDept[] = {"CSE","EEE","BBA","English","Farmacy","Text-Tile"};
        JComboBox dept = new JComboBox(allDept);
        dept.setBackground(Color.WHITE);
        dept.setBounds(370, 210, 300, 40);
        add(dept);
        
        JLabel gen = new JLabel("Gender");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(100, 270, 200, 40);
        add(gen);
        
        
        JRadioButton male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(370, 270, 100, 40);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(470, 270, 100, 40);
        add(female);
        
        JRadioButton other = new JRadioButton("Others");
        other.setBackground(Color.WHITE);
        other.setBounds(570, 270, 100, 40);
        add(other);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);
        
        JLabel retu = new JLabel("Semester");
        retu.setFont(new Font("Raleway",Font.BOLD,20));
        retu.setBounds(100, 330, 200, 40);
        add(retu);
        
        String sem[] = {"1st","2nd","3rd","4th","5th","6th","7th","8th"};
        JComboBox lng = new JComboBox(sem);
        lng.setBackground(Color.WHITE);
        lng.setBounds(370, 330, 300, 40);
        add(lng);
        
        JLabel contt = new JLabel("Contact");
        contt.setFont(new Font("Raleway",Font.BOLD,20));
        contt.setBounds(100, 390, 200, 40);
        add(contt);
        
        JTextField conttTextField = new JTextField();
        conttTextField.setBounds(370, 390, 300, 40);
        add(conttTextField);
        
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
        new Student_Registration ();
    }
}