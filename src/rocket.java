//public class rocket extends game {
public abstract class rocket extends game {


    /*
    public rocket() {
        xPos = 100;
        yPos = 400;

    }

     */

    public rocket() {
        rocket leftRocket = new leftSideRocket();
        rocket rightRocket = new rightSideRocket();
        rocket mainRocket = new mainRocket();
    }
    public abstract void update();
    //public abstract void update(char d);
}


