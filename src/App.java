import java.awt.Rectangle;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ventana v = new ventana();
        v.setVisible(true);
    }
}

class ventana extends JFrame{
    public ventana(){
        setBounds(new Rectangle(150,150,150,150));
    }
}




