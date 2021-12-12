import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        ventana v = new ventana();
        v.setVisible(true);
    }
}

class ventana extends JFrame{
    public ventana(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension pantalla = tk.getScreenSize();
        setBounds(new Rectangle(pantalla.width/4,pantalla.height/4,pantalla.width/2,pantalla.height/2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}




