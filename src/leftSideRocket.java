public class leftSideRocket extends rocket  {
    protected final static int THETA_DEC = 2;

    //@Override
    public static void update() {
        theta -= THETA_DEC;

       // xVel = (int) (xPos*Math.cos(theta));
      //  yVel = (int) (yPos*Math.sin(theta));
    }



}
