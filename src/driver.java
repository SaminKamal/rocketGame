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
        /*
        leftRocket = new leftSideRocket();
        rightRocket = new rightSideRocket();
        mainRocket = new mainRocket();

         */
        //JPanel pane = new game();
       // pane.setBackground(Color.BLACK);
        //window.add(pane);

        window.add(linus);
        window.setPreferredSize(new Dimension(1000, 1000));
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.pack();







        //testing purposes

        //git test hello

        //DOES THIS ALSO WORK
    }
}

