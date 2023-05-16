package objects;



import java.util.Random;

import static panel.Pantalla.*;


public class Pelota {
    private final int speed = 10;
    private final int size;
    private int x;
    private int y;
    private int dx;
    private int dy;

    public Pelota() {
        Random random = new Random();
        this.size = random.nextInt(10,50);
        this.x = random.nextInt(getPanel().getSize().width);
        this.y = random.nextInt(getPanel().getSize().height);
        this.dx = random.nextInt(speed * 2) - speed;
        this.dy = random.nextInt(speed * 2) - speed;
    }

    public void mover(){
        // Actualizar la posición de la pelota
        x += dx;
        y += dy;

        // Rebotar en los bordes de la ventana
        if (x < 0 || x + size > getPanel().getSize().width) {
            dx *= -1;
        }
        if (y < 0 || y + size > getPanel().getSize().height) {
            dy *= -1;
        }
    }

    public int getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
