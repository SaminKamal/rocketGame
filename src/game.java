import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class game extends JPanel implements KeyListener {
    public final static int  THETA_INC = 2;
    public final static int THETA_DEC = 2;


    public static int xPos = 100;
    public static int yPos = 400;

    public static int xVel = 1;
    public static int yVel = 1;

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
                updateXVEL();
                updateYVEL();
                updateXPOS();
                updateYPOS();
                break;
                //decrease theta
            case UNI_RIGHT:
                theta -= THETA_DEC;
                break;
            //down--fire main engine in negative direction
            case UNI_DOWN:
                break;
                //left--increase theft
            case UNI_LEFT:
                theta += THETA_INC;
                break;
        }

    }
    //public rocket rocketMain;
    public game() {
        addKeyListener(this);
        setFocusable(true);
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
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Rectangle rectangle = new Rectangle(xPos, yPos, 10, 30);
        g2d.rotate(Math.toRadians(theta-160), rectangle.getX() + rectangle.width/2,
                rectangle.getY() + rectangle.height/2);
        g2d.fillRect(xPos, yPos, 10, 30);
        g2d.setColor(Color.BLACK);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        k = e.getKeyCode();
        keySorter(k);
    }

    @Override
    public void keyReleased(KeyEvent e) {
       k = e.getKeyCode();
       keySorter(k);
    }
}
