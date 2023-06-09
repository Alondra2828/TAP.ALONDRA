/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chat;

/**
 *
 * @author gonza
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteUI extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private BufferedReader in;
    private PrintWriter out;
    private Socket cnx;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClienteUI().setVisible(true);
            }
        });
    }

    public ClienteUI() {
        setTitle("Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane);

        inputField = new JTextField();
        sendButton = new JButton("Enviar");
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        add(inputPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarMensaje();
            }

            private void enviarMensaje() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarMensaje();
            }

            private void enviarMensaje() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    public void iniciar() {
        String respuesta = "", comando = "";
        Conexion hilo;
        try {
            this.cnx = new Socket("127.0.0.1", 4444);

            in = new BufferedReader(new InputStreamReader(cnx.getInputStream()));
            out = new PrintWriter(cnx.getOutputStream(), true);

            hilo = new Conexion(in);
            hilo.start(); // Hilo encargado de lecturas del servidor

            while (!comando.toLowerCase().contains("salir")) {
                comando = inputField.getText();
                out.println(comando);
                inputField.setText("");
            }

            hilo.ejecutar = false;
            Thread.sleep(2000);

            this.cnx.close();

        } catch (IOException ex) {
            Logger.getLogger(ClienteUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClienteUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    class Conexion extends Thread {
        public boolean ejecutar = true;
        BufferedReader in;

        public Conexion(BufferedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            String respuesta = "";
            while (ejecutar) {
                try {
                    respuesta = in.readLine();
                    if (respuesta != null) {
                        chatArea.append(respuesta + "\n");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ClienteUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}

