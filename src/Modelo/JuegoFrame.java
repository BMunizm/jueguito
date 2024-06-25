package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JFrame;
import jueguito.JuegoPanel;
import javax.swing.*;
import java.awt.*;

public class JuegoFrame extends JFrame {
    private JTextField nombreField;
    private JTextField edadField;

    public JuegoFrame() {
        setTitle("Datos del Jugador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        panel.add(nombreField);
        
        panel.add(new JLabel("Edad:"));
        edadField = new JTextField();
        panel.add(edadField);
        
        JButton btnEmpezar = new JButton("Empezar Juego");
        btnEmpezar.addActionListener(e -> {
            String nombre = nombreField.getText();
            String edad = edadField.getText();
            // Puedes hacer algo con los datos del jugador aquí
            
            JuegoFrame.this.dispose(); // Cerrar esta ventana

            // Abrir la ventana del juego real
            JFrame juegoRealFrame = new JFrame("Juego Básico");
            juegoRealFrame.setSize(800, 600);
            juegoRealFrame.setResizable(false);
            juegoRealFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            juegoRealFrame.add(new JuegoPanel());
            juegoRealFrame.setVisible(true);
        });
        panel.add(btnEmpezar);
        
        add(panel);
    }
}