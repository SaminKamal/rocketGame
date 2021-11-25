import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class game extends JPanel implements ActionListener, KeyListener {
    protected static int xPos = 100;
    protected static int yPos = 400;

    protected static int xVel = 2;
    //wait no
    protected static int yVel = 2;
    protected static int theta;


    protected int score;

    private int k;
    private final int UNI_UP = 38;
    private final int UNI_DOWN = 40;
    private final int UNI_LEFT = 37;
    private final int UNI_RIGHT = 39;



    public void keySorter(int k) {
        switch(k) {
            //up--fire main engine in positive direction
            case 38:
                mainRocket.update();
                repaint();
                break;
                //decrease theta
            case 39:
                rightSideRocket.update();
                repaint();
                break;
            //down--fire main engine in negative direction
            case 40:
                break;
                //left--increase theft
            case 37:
                //leftSideRocket.update();
                leftSideRocket.update();
                repaint();
                break;
        }

    }
    public game() {
        //constructor for game -- what should it contain?
        //model rocket as object
        // rocket Rocket = new rocket();
        addKeyListener(this);
        setFocusable(true);
        //JPanel panel = new JPanel();
       // this.setOpaque(true);
       // this.setBackground(Color.PINK);
        // add(panel);
    }

    @Override
    public void paintComponent (Graphics g) {
       // g.setColor(Color.BLACK);
        this.setBackground(Color.BLACK);
        g.fillRect(xPos, yPos, 10, 10);
        g.setColor(Color.PINK);
    }
    //
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);

        // System.out.println(k);

        repaint();

    }

    @Override
    public void keyPressed(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //k = e.getKeyCode();
       // System.out.println(k);
        repaint();
    }
}
