public class ArrowHeadDrawer implements Runnable{

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
        bob.penColor("crimson");
        bob.speed(0.1);
        bob.width(4);

        bob.up();
        bob.setPosition(startX-125.78,startY-35.78,190);
        bob.down();

//        System.out.println(handpos[0]+" "+handpos[1]);

        bob.penColor("crimson");
        bob.forward(20);

        bob.setDirection(10);
        for(int i=0 ; i<40;i++) { bob.forward(0.8);bob.left(4.5); }

        bob.setDirection(235);
        bob.forward(30);
        bob.setDirection(325);
        bob.forward(30);

        bob.setDirection(10);
        for(int i=0 ; i<40;i++) { bob.forward(0.8);bob.left(4.5); }

        bob.up();
        bob.forward(60);
    }
}
