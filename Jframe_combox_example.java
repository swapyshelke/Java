package ass4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a4a2 extends JFrame {
    private JComboBox<String> languageCombo;
    private JLabel selectionLabel;
    private JButton showButton;
    
    public a4a2() {
        setTitle("ComboBox Example");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        // Create components
        String[] languages = {"Java", "C", "C++", "C#", "PHP"};
        languageCombo = new JComboBox<>(languages);
        showButton = new JButton("Show");
        selectionLabel = new JLabel("Programming Language Selected: Java");
        
        // Add components to frame
        add(languageCombo);
        add(showButton);
        add(selectionLabel);
        
        // Add action listener for show button
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLanguage = (String) languageCombo.getSelectedItem();
                selectionLabel.setText("Programming Language Selected: " + selectedLanguage);
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
                new a4a2().setVisible(true);
            }
        });
    }
}