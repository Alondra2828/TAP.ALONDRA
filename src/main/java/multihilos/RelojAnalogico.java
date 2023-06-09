/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multihilos;

/**
 *
 * @author gonza
 */
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class RelojAnalogico extends JFrame {
    private PanelReloj panelReloj;

    public RelojAnalogico() {
        setTitle("Reloj Analógico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);

        panelReloj = new PanelReloj();
        add(panelReloj);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RelojAnalogico();
    }
}

class PanelReloj extends JPanel {
    private int horas;
    private int minutos;
    private int segundos;

    public PanelReloj() {
        Thread thread = new Thread(() -> {
            while (true) {
                Calendar calendario = Calendar.getInstance();
                horas = calendario.get(Calendar.HOUR);
                minutos = calendario.get(Calendar.MINUTE);
                segundos = calendario.get(Calendar.SECOND);
                repaint();

                try {
                    Thread.sleep(1000); // Espera 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radio = (int) (Math.min(xCenter, yCenter) * 0.8);

        // Dibujar el círculo del reloj
        g.setColor(Color.BLACK);
        g.drawOval(xCenter - radio, yCenter - radio, radio * 2, radio * 2);

        // Dibujar los números del reloj
        for (int i = 1; i <= 12; i++) {
            double angulo = Math.toRadians(30 * i);
            int x = (int) (xCenter + Math.sin(angulo) * (radio - 20));
            int y = (int) (yCenter - Math.cos(angulo) * (radio - 20));
            g.drawString(Integer.toString(i), x, y);
        }

        // Dibujar las manecillas del reloj
        int largoHoras = (int) (radio * 0.5);
        int largoMinutos = (int) (radio * 0.6);
        int largoSegundos = (int) (radio * 0.7);

        double anguloHoras = Math.toRadians((horas * 30) + (minutos / 2));
        int xHoras = (int) (xCenter + Math.sin(anguloHoras) * largoHoras);
        int yHoras = (int) (yCenter - Math.cos(anguloHoras) * largoHoras);
        g.setColor(Color.YELLOW);
        g.drawLine(xCenter, yCenter, xHoras, yHoras);

        double anguloMinutos = Math.toRadians((minutos * 6) + (segundos / 10));
        int xMinutos = (int) (xCenter + Math.sin(anguloMinutos) * largoMinutos);
        int yMinutos = (int) (yCenter - Math.cos(anguloMinutos) * largoMinutos);
        g.setColor(Color.BLACK);
        g.drawLine(xCenter, yCenter, xMinutos, yMinutos);

        double anguloSegundos = Math.toRadians(segundos * 6);
        int xSegundos = (int) (xCenter + Math.sin(anguloSegundos) * largoSegundos);
        int ySegundos = (int) (yCenter - Math.cos(anguloSegundos) * largoSegundos);
        g.setColor(Color.RED);
        g.drawLine(xCenter, yCenter, xSegundos, ySegundos);
    }
}
