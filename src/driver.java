import javax.swing.*;
import java.awt.*;

public class driver extends JFrame {

    public static void main(String args[]) {

        JFrame window = new JFrame("Rocket Game");
        game linus = new game();
        //JPanel pane = new game();
       // pane.setBackground(Color.BLACK);
        //window.add(pane);

        window.add(linus);
        window.setPreferredSize(new Dimension(1000, 1000));
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);






        //testing purposes

        //git test hello

        //DOES THIS ALSO WORK
    }
}

