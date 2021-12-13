import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        ventana v = new ventana();
        v.setVisible(true);
    }
}

class ventana extends JFrame{
    public ventana(){
        setBounds(new Rectangle(anchoPantalla/4,altoPantalla/4,anchoPantalla/2,altoPantalla/2));
        setTitle("Configurador de dispositivos dis+ capacidad");
        Image icono = tk.getImage("iconodismas.jpeg");
        setIconImage(icono);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        add(new panel());   
    }
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension pantalla = tk.getScreenSize();
    int anchoPantalla = pantalla.width;
    int altoPantalla = pantalla.height;
}

class panel extends JPanel{
    public panel(){
        setBackground(new Color(28,103,143));
        setLayout(new BorderLayout());
        JPanel panelConexion = new JPanel();
        panelConexion.setBackground(null);
        conectar.addActionListener(new oyenteConexion());
        desconectar.addActionListener(new oyenteConexion());
        panelConexion.add(conectar);
        panelConexion.add(desconectar);
        add(panelConexion,BorderLayout.NORTH);
    }
    private class oyenteConexion implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Apretaste el boton", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    JButton conectar = new JButton("Conectar");
    JButton desconectar = new JButton("Desconectar");
}




