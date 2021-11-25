import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class game extends JPanel implements ActionListener, KeyListener {
    protected int xPos;
    protected int yPos;

    protected int xVel;
    //wait no
    protected int yVel;

    protected int score;


    public game() {
        //constructor for game -- what should it contain?
        //model rocket as object
        //rocket Rocket = new rocket();
        addKeyListener(this);
    }


    //
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
