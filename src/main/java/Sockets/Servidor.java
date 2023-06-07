/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonza
 */

public class Servidor {
    ServerSocket server;
    Conexion cnx;
    public void run(){
        try {
            
            System.out.println("Iniciando server");
            server = new ServerSocket(3000);
            int i = 1;
            System.out.println("Esperando conexion");
            while((cnx = new Conexion(server.accept()))!=null){
                System.out.println("# conexiones "+i++);
                cnx.start();
            };                        
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void main(String args[]){
        Servidor srv = new Servidor();
        srv.run();
    }
    
    class Conexion extends Thread {
        InputStream in;
        OutputStream out;
        DataInputStream dis;
        DataOutputStream dos;
        
        Socket cliente;
        
        Conexion(Socket _socket){
            this.cliente = _socket;
        }
        
        @Override
        public void run() {
           System.out.println("Conexion recibida desde "+cliente.getInetAddress());

            try {
                this.in =  cliente.getInputStream();            
                this.out = cliente.getOutputStream();

                this.dis = new DataInputStream(this.in);
                this.dos = new DataOutputStream(this.out);            

                this.dos.writeUTF("Buen día, ¿cual es tu nombre?");

                String respuesta = this.dis.readUTF();

                System.out.println(respuesta);

                this.dos.writeUTF("Mucho gusto "+respuesta+", Adios!");

                cliente.close();
            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                      
    }        
}


