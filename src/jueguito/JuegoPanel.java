/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jueguito;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Usuario
 */
public class JuegoPanel extends JPanel implements ActionListener {
    private Timer timer;
    private Jugador jugador;

    public JuegoPanel() {
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        jugador = new Jugador();
        addKeyListener(new TAdapter());
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        jugador.dibujar(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jugador.mover(getWidth(), getHeight());
        repaint();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            jugador.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            jugador.keyReleased(e);
        }
    }
}