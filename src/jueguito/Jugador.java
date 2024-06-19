package jueguito;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Jugador {
    private int x, y, dx, dy;
    private final int DIAMETRO = 30;

    public Jugador() {
        x = 100;
        y = 100;
    }

    public void mover(int ancho, int alto) {
        x += dx;
        y += dy;

        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        if (x > ancho - DIAMETRO) {
            x = ancho - DIAMETRO;
        }
        if (y > alto - DIAMETRO) {
            y = alto - DIAMETRO;
        }
    }

    public void dibujar(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, DIAMETRO, DIAMETRO);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
