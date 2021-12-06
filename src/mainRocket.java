public class mainRocket extends rocket {

    @Override
    public void update() {
        /*
        xPos += xVel;
        yPos += yVel;

         */
        updateXVEL();
        updateYVEL();
        updateXPOS();
        updateYPOS();
        /*
        xVel = (int) (xPos*Math.cos(theta));
        yVel = (int) (yPos*Math.sin(theta));
        xPos += xVel;
        yPos += yVel;

         */
    }
}
