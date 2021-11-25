public class mainRocket extends rocket {

    //@Override
    public static void update() {
        /*
        xPos += xVel;
        yPos += yVel;

         */
        xVel = (int) (xPos*Math.cos(theta));
        yVel = (int) (yPos*Math.sin(theta));
        xPos += xVel;
        yPos += yVel;
    }
}
