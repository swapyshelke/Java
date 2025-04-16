package ass4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a4a1 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, resetButton;
    
    public a4a1() {
        setTitle("Login");
        setLayout(new GridLayout(3, 2, 10, 10));
        
        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");
        
        // Add components to frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(resetButton);
        
        // Add action listeners
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
        
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Login button clicked!");
            }
        });
        
        // Set frame properties
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new a4a1().setVisible(true);
            }
        });
    }
}