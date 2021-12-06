public class rightSideRocket extends rocket implements myInterface {
    //protected final static int  THETA_INC = 2;

    @Override
    public void updateTHETA() {
       theta -= THETA_DEC;
    }

    @Override
    public void update() {

            //theta += THETA_INC;
        updateTHETA();

           // xVel = (int) (xPos*Math.cos(theta));
           // yVel = (int) (yPos*Math.sin(theta));
        }

}
