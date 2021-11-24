public class rightSideRocket extends rocket{
    protected final int THETA_INC = 2;

    @Override
    public void update() {
            theta += THETA_INC;

            xPos = (int) (xPos*Math.cos(theta));
            yPos = (int) (yPos*Math.sin(theta));
        }

}
