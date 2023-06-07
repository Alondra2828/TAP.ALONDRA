/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listener3;


import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author gonza
 */
public class MiFrame extends JFrame {
    
    JButton boton;
    
    MiFrame(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        // Expresiones Lambda
            
        boton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame frame = new MiFrame();  
        
        frame.setVisible(true);
    }
    
}

