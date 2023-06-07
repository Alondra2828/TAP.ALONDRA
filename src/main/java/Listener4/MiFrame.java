/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listener4;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
            
        boton.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //
                        System.out.println("X="+e.getX()+" / Y="+e.getY());
                    }
                }
        );
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame frame = new MiFrame();  
        
        frame.setVisible(true);
    }
    
}

