import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class game extends JPanel implements KeyListener {
    protected rocket leftRocket;
    protected rocket rightRocket;
    protected rocket mainRocket;

    protected final static int  THETA_INC = 2;
    protected final static int THETA_DEC = 2;


    protected static int xPos = 100;
    protected static int yPos = 400;

    protected static int xVel = 2;
    //wait no
    protected static int yVel = 2;
    protected static int theta = 90;

    public static void updateXPOS() {
        xPos += xVel;

    }
    public static void updateYPOS() {
        yPos += yVel;

    }
    public static void updateXVEL() {
        xVel = (int) (xPos*Math.cos(theta));

    }
    public static void updateYVEL() {
        yVel = (int) (yPos*Math.sin(theta));

    }

    /*
    public static void updateTHETA() {
        theta += THETA_INC;
    }

     */

    protected int score;

    private int k;
    protected static final int UNI_UP = 38;
    protected static final int UNI_DOWN = 40;
    protected static final int UNI_LEFT = 37;
    protected static final int UNI_RIGHT = 39;



    public  void keySorter(int k) {
        switch(k) {
            //up--fire main engine in positive direction
            case UNI_UP:
                mainRocket.update();
                repaint();
                break;
                //decrease theta
            case UNI_RIGHT:
                rightRocket.update();
                repaint();
                break;
            //down--fire main engine in negative direction
            case UNI_DOWN:
                //override update in main rocket to decrement
                //leftRocket.update();
                repaint();
                break;
                //left--increase theft
            case UNI_LEFT:
                //leftSideRocket.update();
                leftRocket.update();
                repaint();
                break;
        }

    }
    public rocket rocketMain;
    public game() {
        //constructor for game -- what should it contain?
        //model rocket as object
        // rocket Rocket = new rocket();
        addKeyListener(this);
        this.addKeyListener(this);
        setFocusable(true);
        //JPanel panel = new JPanel();
       // this.setOpaque(true);
       // this.setBackground(Color.PINK);
        // add(panel);
       // leftRocket = new leftSideRocket();
       // rightRocket = new rightSideRocket();
       // mainRocket = new mainRocket();
        //rocketMain = new rocket();
    }

    @Override
    public void paintComponent (Graphics g) {
       // g.setColor(Color.BLACK);
        this.setBackground(Color.BLACK);
        g.fillRect(xPos, yPos, 10, 10);
        g.setColor(Color.PINK);
    }
    //

    /*
    @Override
    public void actionPerformed(ActionEvent e) {

    }

     */

    @Override
    public void keyTyped(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);
        repaint();

        // System.out.println(k);

        //repaint();

    }

    @Override
    public void keyPressed(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);
        //repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);
       // System.out.println(k);
        //repaint();
    }
}
