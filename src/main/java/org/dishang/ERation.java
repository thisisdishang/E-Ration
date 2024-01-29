package org.dishang;

import org.dishang.UI.LoginFrame;
import org.dishang.UI.RegistrationFrame;

import javax.swing.*;
import java.awt.*;

public class ERation extends JFrame {
    public ERation() {
        initializeUI();
    }

    private void initializeUI() {
        JLabel nameLabel = new JLabel("                  E-Ration                   ");

        Font f = new Font("Arial",Font.BOLD , 30);
        nameLabel.setFont(f);

        JButton registerButton = new JButton("Register");
        JButton loginButton = new JButton("Login");

        JPanel panel = new JPanel(new BorderLayout());

        JPanel namesPanel = new JPanel(new GridLayout(3, 1));
        namesPanel.add(nameLabel);

        panel.add(namesPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(registerButton);
        buttonPanel.add(loginButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        registerButton.addActionListener(e -> openRegisterFrame());
        loginButton.addActionListener(e -> openLoginFrame());

        this.add(panel);
        this.setTitle("Home Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void openRegisterFrame() {
        SwingUtilities.invokeLater(RegistrationFrame::new);
    }

    private void openLoginFrame() {
        SwingUtilities.invokeLater(LoginFrame::new);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ERation::new);
    }
}