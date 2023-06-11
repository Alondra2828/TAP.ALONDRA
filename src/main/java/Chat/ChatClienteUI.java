/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;

/**
 *
 * @author gonza
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatClienteUI extends JFrame {

    private BufferedReader in;
    private PrintWriter out;
    private Socket cnx;
    private JTextArea chatArea;
    private JTextField mensajeField;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClienteUI().setVisible(true);
            }
        });
    }

    public ChatClienteUI() {
        initComponents();
        conectarAlServidor();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cliente de Chat");

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        add(scrollPane, BorderLayout.CENTER);

        mensajeField = new JTextField();
        mensajeField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarMensaje();
            }
        });
        add(mensajeField, BorderLayout.SOUTH);

        pack();
    }

    private void conectarAlServidor() {
        try {
            this.cnx = new Socket("127.0.0.1", 4444);

            in = new BufferedReader(new InputStreamReader(cnx.getInputStream()));
            out = new PrintWriter(cnx.getOutputStream(), true);

            new Thread(new Conexion(in)).start();
        } catch (IOException ex) {
            Logger.getLogger(ChatClienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void enviarMensaje() {
        String mensaje = mensajeField.getText();
        out.println(mensaje);
        mensajeField.setText("");
    }

    class Conexion implements Runnable {
        private BufferedReader in;

        public Conexion(BufferedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            try {
                String respuesta;
                while ((respuesta = in.readLine()) != null) {
                    mostrarMensaje(respuesta);
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatClienteUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void mostrarMensaje(String mensaje) {
        chatArea.append(mensaje + "\n");
    }
}

