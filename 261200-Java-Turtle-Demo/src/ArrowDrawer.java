public class ArrowDrawer implements Runnable{
    private double startX = 0 ;
    private double startY = 0 ;

    public void start (double X , double Y)
    {
        this.startX = X;
        this.startY = Y;
    }

    public void run()
    {
        Turtle bob = new Turtle();
        bob.penColor("palevioletred");
        bob.speed(0.1);
        bob.width(4);

        bob.up();
        bob.setPosition(startX-125.78,startY-35.78,100);
        bob.down();

        for(int i=0 ; i<50;i++) { bob.forward(1.5);bob.right(1); }
        bob.backward(5);

        bob.setDirection(295);
        bob.forward(64);

        bob.up();
        bob.setPosition(startX-125.78,startY-35.78,280);
        bob.down();

        for(int i=0 ; i<50;i++) { bob.forward(1.5);bob.left(1); }
        bob.backward(5);
        //bob.penWidth = 2;
        //bob.penColor("slategray");
        bob.setDirection(85);
        bob.forward(46);
    }

}
