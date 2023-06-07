/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gonza
 */
public class Practica1 {
    
    public static void main(String args[]){
       Practica1 practica1 = new Practica1();
       practica1.run(); 
    }
    
    public void run(){
        JFrame frame = new JFrame("Saludador");
        frame.setSize(600, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout border = new BorderLayout();
        
        JLabel lbl = new JLabel("Escribe un nombre para saludar");
        JTextField txtField = new JTextField();
        JButton btnSaludar = new JButton("Saludar!");
        
        btnSaludar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(
                        frame, 
                        "Hola "+txtField.getText()+"!!",
                        "Saludo", 
                        JOptionPane.INFORMATION_MESSAGE  
                 );
            }
        });
        
        frame.add(lbl,BorderLayout.PAGE_START);
        frame.add(txtField,BorderLayout.CENTER);
        frame.add(btnSaludar,BorderLayout.PAGE_END);
        
        //frame.pack();
        frame.setVisible(true);
    }
    
}

