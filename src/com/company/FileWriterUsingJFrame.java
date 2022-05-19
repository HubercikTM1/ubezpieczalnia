package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class FileWriterUsingJFrame implements ActionListener {

    JFrame window = new JFrame("Sign Up form");
    //fields
    JTextField userNameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JTextField phoneField = new JTextField();
    JTextField addressField = new JTextField();
    //labels
    JLabel userNameLabel = new JLabel("User Name");
    JLabel passwordLabel = new JLabel("Password");
    JLabel phoneLabel = new JLabel("Phone");
    JLabel addressLabel = new JLabel("Address");
    JLabel blank = new JLabel();

    JButton signUpButton = new JButton("Sign Up");
    FileWriter fileWriter;

    FileWriterUsingJFrame()
    {

        GridLayout gl = new GridLayout();
        gl.setColumns(2);
        gl.setRows(3);

        window.setLayout(gl);

        signUpButton.addActionListener(this);

        window.add(userNameLabel);
        window.add(userNameTextField);
        window.add(passwordLabel);
        window.add(passwordTextField);
        window.add(phoneLabel);
        window.add(phoneField);
        window.add(addressLabel);
        window.add(addressField);
        window.add(blank);
        window.add(signUpButton);

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand() == signUpButton.getActionCommand())
        {

            try
            {
                fileWriter = new FileWriter("E:/ubezpieczalnia/Sign Up Sheet.txt");
                fileWriter.write(userNameLabel.getText() + " : " + userNameTextField.getText());
                fileWriter.write(" ");
                fileWriter.write(passwordLabel.getText() + " : " + passwordTextField.getText());
                fileWriter.write(" ");
                fileWriter.write(phoneLabel.getText() + " : " + phoneField.getText());
                fileWriter.write(" ");
                fileWriter.write(addressLabel.getText() + " : " + addressField.getText());
                fileWriter.close();

                JOptionPane.showMessageDialog(null, "Successfully registered!");

            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e+"");
            }

        }

    }
}
