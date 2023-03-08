public class CupidDrawer implements Runnable{
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
        bob.penColor("black");
        bob.speed(0.1);
        bob.width(2);

        //wing
        bob.up();
        bob.setPosition(startX,startY,30);
        bob.down();
        for(int i=0 ; i<30;i++) { bob.forward(2);bob.left(2); }

        for(int i=0 ; i<45;i++) { bob.forward(i/15+1);bob.right(2); }

        bob.setDirection(285);
        for(int i=0 ; i<30;i++) { bob.forward(2);bob.right(2); }

        bob.setDirection(270);
        for(int i=0 ; i<30;i++) { bob.forward(0.8);bob.right(2); }

        bob.setDirection(270);
        for(int i=0 ; i<45;i++) { bob.forward(i/30+0.8);bob.right(2); }

        bob.setDirection(210);
        bob.forward(10);

        bob.setDirection(170);
        for(int i=0 ; i<25;i++) { bob.forward(2);bob.right(2); }

        bob.setDirection(30);
        for(int i=0 ; i<40;i++) { bob.forward(1);bob.left(i/5); }

        bob.setDirection(60);
        for(int i=0 ; i<30;i++) { bob.forward(1);bob.left(2); }

        bob.setDirection(60);
        for(int i=0 ; i<15;i++) { bob.forward(1);bob.left(2); }

        bob.setDirection(210);
        for(int i=0 ; i<30;i++) { bob.forward(0.5);bob.right(2); }

        bob.setDirection(120);
        for(int i=0 ; i<30;i++) { bob.forward(0.8 );bob.left(i/5); }

        bob.setDirection(180);
        for(int i=0 ; i<30;i++) { bob.forward(1.5 );bob.left(i/6); }

        bob.setDirection(210);
        for(int i=0 ; i<30;i++) { bob.forward(0.5);bob.right(2); }

        bob.setDirection(270);
        for(int i=0 ; i<30;i++) { bob.forward(0.5);bob.left(2); }

        bob.setDirection(180);
        for(int i=0 ; i<60;i++) { bob.forward(0.7);bob.left(2); }
//        this.facepos[0] = bob.getX();
//        this.facepos[1] = bob.getY();
//        System.out.println(this.facepos[0]+" "+this.facepos[1]);

        bob.setDirection(0);
        for(int i=0 ; i<10;i++) { bob.forward(2);bob.left(9); }

        bob.setDirection(270);
        for(int i=0 ; i<30;i++) { bob.forward(1);bob.left(4); }

        bob.setDirection(300);
        for(int i=0 ; i<30;i++) { bob.forward(1.2);bob.left(3); }

        bob.setDirection(300);
        for(int i=0 ; i<30;i++) { bob.forward(0.5);bob.left(3); }

        bob.setDirection(60);
        for(int i=0 ; i<20;i++) { bob.forward(i/10+1);bob.right(11); }

        //face
        bob.up();
        bob.setPosition(-96.6+5+startX, 46.49+startY,285);
        bob.down();
        bob.forward(20);

        bob.setDirection(235);
        for(int i=0 ; i<50;i++) { bob.forward(0.35);bob.left(i/6); }

        bob.setDirection(285);
        bob.forward(8);

        bob.setDirection(15);
        for(int i=0 ; i<18;i++) { bob.forward(0.5);bob.right(10); }

        bob.setDirection(280);
        for(int i=0 ; i<30;i++) { bob.forward(0.8);bob.left(4-i/10); }
        for(int i=0 ; i<30;i++) { bob.forward(1.2);bob.left(0.55); }
        bob.backward(8);

        //arm
        bob.setDirection(300);
        bob.forward(12);

        bob.setDirection(200);
        for(int i=0 ; i<30;i++) { bob.forward(1.2);bob.left(0.5); }

        bob.setDirection(180);
        for(int i=0 ; i<30;i++) { bob.forward(1.5);bob.left(0.5); }

        bob.setDirection(150);
        for(int i=0 ; i<50;i++) { bob.forward(0.5);bob.left(1+i/15); }
//        this.handpos[0] = bob.getX() ;
//        this.handpos[1] = bob.getY() ;
        for(int i=50 ; i>0;i--) { bob.forward(0.6);bob.left(1.5+i/15); }

        bob.setDirection(345);
        for(int i=0 ; i<40;i++) { bob.forward(2);bob.left(1); }


        //body leg1
        bob.setDirection(300);
        for(int i=0 ; i<40;i++) { bob.forward(2);bob.left(1); }

        bob.setDirection(270);
        for(int i=0 ; i<30;i++) { bob.forward(1+i/7);bob.left(4-i/12); }

        bob.setDirection(340);
        for(int i=0 ; i<30;i++) { bob.forward(1);bob.right(2); }

        bob.setDirection(200);
        for(int i=30 ; i>0;i--) { bob.forward(1.3);bob.left(i*i/35); }
        for(int i=0 ; i<30;i++) { bob.forward(1.2);bob.left(i*i/55); }

        bob.setDirection(170);
        for(int i=25 ; i>0;i--) { bob.forward(0.6+i/7);bob.right(5-i/10); }

        // leg2
        bob.setDirection(280);
        for(int i=0 ; i<25;i++) { bob.forward(1+i/7);bob.left(4-i/12); }

        bob.setDirection(340);
        for(int i=0 ; i<30;i++) { bob.forward(1);bob.right(2); }

        bob.setDirection(200);
        for(int i=30 ; i>0;i--) { bob.forward(1.3);bob.left(i*i/35); }
        for(int i=0 ; i<30;i++) { bob.forward(1.2);bob.left(i*i/55); }

        bob.setDirection(170);
        for(int i=25 ; i>0;i--) { bob.forward(0.8+i/7);bob.right(4-i/10); }

        bob.setDirection(110);
        for(int i=0 ; i<55;i++) { bob.forward(0.8);bob.left(1.2); }
        for(int i=0 ; i<40;i++) { bob.forward(0.8);bob.right(0.4); }
    }
}
