public abstract class rocket extends game {
    //left key will update sr1, increase theta
    protected int sideRocketOne;
    //right key controlled, decrease theta
    protected int sideRocketTwo;
    //changes acceleration--> x and y velocity , model in function?
    protected int mainRocket;
    protected int theta;

    /*
    public rocket() {
        xPos = 100;
        yPos = 400;



    }

     */
    public abstract void update();
}


