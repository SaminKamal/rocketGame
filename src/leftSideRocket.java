public class leftSideRocket extends rocket implements myInterface {
    @Override
    public void updateTHETA() {
        theta += THETA_INC;
    }

    @Override
    public void update() {
        updateTHETA();
       // xVel = (int) (xPos*Math.cos(theta));
      //  yVel = (int) (yPos*Math.sin(theta));
    }



}
