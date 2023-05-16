package threads;

import objects.Pelota;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;
import static panel.Pantalla.*;


public class PelotaRebotando implements Runnable{
    @Override
    public void run() {
        Pelota pelota = new Pelota();
        JPanel pelota_panel = new JPanel();
        pelota_panel.setBackground(new Color(232,32,32));
        pelota_panel.setSize(pelota.getSize(),pelota.getSize());
        pelota_panel.setBounds(pelota.getX(),pelota.getY(),pelota.getSize(),pelota.getSize());

        getPanel().add(pelota_panel);

        while (true){
            pelota.mover();
            pelota_panel.setBounds(pelota.getX(),pelota.getY(),pelota.getSize(),pelota.getSize());
            getPanel().repaint();

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
