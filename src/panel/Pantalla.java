package panel;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {

    private static JPanel panel;

    static {
        new Pantalla();
    }

    private Pantalla() {
        // Configurar el JFrame
        setTitle("Aplicacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear el JPanel
        panel = new JPanel();
        panel.setBackground(Color.BLACK);

        // Agregar el JPanel al JFrame
        setContentPane(panel);

        // Abrir la pantalla
        setVisible(true);
    }

    public static JPanel getPanel() {
        return panel;
    }

}
