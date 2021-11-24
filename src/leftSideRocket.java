public class leftSideRocket extends rocket  {
    protected final int THETA_DEC = 2;

    @Override
    public void update() {
        theta -= THETA_DEC;

        xPos = (int) (xPos*Math.cos(theta));
        yPos = (int) (yPos*Math.sin(theta));
    }



}
