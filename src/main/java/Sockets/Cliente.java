/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Cliente {
    Socket cliente;
    InputStream in;
    OutputStream out;
    DataInputStream dis;
    DataOutputStream dos;
    Scanner consola;
        
    public void run(){
        
        consola = new Scanner(System.in);
        
        try {
            
            
            System.out.println("Iniciando conexion con Server");
            cliente = new Socket("127.0.0.1",3000);
            
            System.out.println("Conexion exitosa");

            this.in =  cliente.getInputStream();
            this.out = cliente.getOutputStream();
            
            this.dis = new DataInputStream(this.in);
            this.dos = new DataOutputStream(this.out);
                                  
            String respuesta = this.dis.readUTF();           
            System.out.println(respuesta);
            
            String nombre = consola.nextLine();
            
            this.dos.writeUTF(nombre);
            
            respuesta = this.dis.readUTF();
            
            System.out.println(respuesta);

            cliente.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void main(String args[]){
        Cliente srv = new Cliente();
        srv.run();
    }
    
}

