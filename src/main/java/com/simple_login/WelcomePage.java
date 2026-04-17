package com.simple_login;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");

    WelcomePage(String userID) {
        
        // Label settings
        welcomeLabel.setBounds(0, 0, 420, 50);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 25));
        welcomeLabel.setText("Hello " + userID + "! Welcome back.");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        // Adding label to the frame
        frame.add(welcomeLabel);

        // Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Dashboard");
    }
}