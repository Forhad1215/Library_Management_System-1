
package library_management_system;

import javax.swing.*;
import java.awt.*;

public class Re_set extends JFrame {
    
    Re_set(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel cp = new JLabel("Current Password");
        cp.setFont(new Font("Raleway",Font.BOLD,15));
        cp.setBounds(30,30, 200, 40);
        add(cp);
        
        JTextField cpTextField = new JTextField();
        cpTextField.setBounds(200, 30, 200, 40);
        add(cpTextField);
        
        JLabel np = new JLabel("New Password");
        np.setFont(new Font("Raleway",Font.BOLD,15));
        np.setBounds(30,90, 200, 40);
        add(np);
        
        JTextField npTextField = new JTextField();
        npTextField.setBounds(200, 90, 200, 40);
        add(npTextField);
        
        JLabel cpm = new JLabel("Confirm Password");
        cpm.setFont(new Font("Raleway",Font.BOLD,15));
        cpm.setBounds(30,150, 200, 40);
        add(cpm);
        
        JTextField cpmTextField = new JTextField();
        cpmTextField.setBounds(200, 150, 200, 40);
        add(cpmTextField);
        
        JButton rsub = new JButton("Submit");
        rsub.setBackground(Color.GREEN);
        rsub.setForeground(Color.BLACK);
        rsub.setBounds(200, 210, 100, 40);
        add(rsub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(500,320);
        setVisible(true);
        setLocation(300,110);
        
        
        
    }
    
    
    public static void main(String[] args) {
        new Re_set ();
    }
    
    
}
