import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class game extends JPanel implements KeyListener {
    /*
    public rocket leftRocket;
    public rocket rightRocket;
    public rocket mainRocket;


     */



    public final static int  THETA_INC = 2;
    public final static int THETA_DEC = 2;


    public static int xPos = 100;
    public static int yPos = 400;

    public static int xVel = 0;
    //wait no
    public static int yVel = 0;
    public static int theta = 160;

    public static void updateXPOS() {
        xPos += xVel;

    }
    public static void updateYPOS() {
        yPos += yVel;

    }
    public static void updateXVEL() {
        xVel = (int) Math.abs((2*Math.cos(theta)));

    }
    public static void updateYVEL() {
        yVel = (int) Math.abs((2*Math.sin(theta)));

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



    public void keySorter(int k) {
        switch(k) {
            //up--fire main engine in positive direction
            case UNI_UP:
                //mainRocket.update();
                updateXVEL();
                updateYVEL();
                updateXPOS();
                updateYPOS();
                //repaint();
                break;
                //decrease theta
            case UNI_RIGHT:
                //rightRocket.update();
                theta -= THETA_DEC;
               // repaint();
                break;
            //down--fire main engine in negative direction
            case UNI_DOWN:
                //override update in main rocket to decrement
                //leftRocket.update();
              //  repaint();
                break;
                //left--increase theft
            case UNI_LEFT:
                //leftSideRocket.update();
                theta += THETA_INC;
                //leftRocket.update();
               // repaint();
                break;
        }

    }
    //public rocket rocketMain;
    public game() {
        //constructor for game -- what should it contain?
        //model rocket as object
        // rocket Rocket = new rocket();
        //addKeyListener(this);
        addKeyListener(this);
        setFocusable(true);
        //JPanel panel = new JPanel();
       // this.setOpaque(true);
       // this.setBackground(Color.PINK);
        //add(this);
     // leftRocket = new leftSideRocket();
      //rightRocket = new rightSideRocket();
     // mainRocket = new mainRocket();
        //rocketMain = new rocket();
        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paintComponent (Graphics g) {
        //g.clearRect(xPos, yPos, 10, 20);
        //JPanel pane = new JPanel();
        //pane.setBackground(Color.WHITE);
        //this.add(pane);
        super.paintComponent(g);
        //g.setBackground(Color.BLACK);
        g.fillRect(xPos, yPos, 10, 20);
        g.setColor(Color.BLACK);

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
        //repaint();

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
       // repaint();
    }
}
