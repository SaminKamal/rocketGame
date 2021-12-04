import javax.swing.*;
import java.awt.*;

public class driver extends JFrame {
    /*
    public static rocket leftRocket;
    public static rocket rightRocket;
    public static rocket mainRocket;

     */

    public static void main(String args[]) {
        JFrame window = new JFrame("Rocket Game");
        game linus = new game();

        window.add(linus);
        window.setPreferredSize(new Dimension(1000, 1000));
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.pack();
    }
}

