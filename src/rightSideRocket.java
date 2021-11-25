public class rightSideRocket extends rocket{
    protected final static int  THETA_INC = 2;

    //@Override
    public static void update() {
            theta += THETA_INC;

           // xVel = (int) (xPos*Math.cos(theta));
           // yVel = (int) (yPos*Math.sin(theta));
        }

}
