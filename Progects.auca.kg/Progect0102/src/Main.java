import processing.core.PApplet;

    //PROGECT 0102
public class Main extends PApplet {

    float y=250;
    float x=400;
    float dx=5;
    float dy=5;
    float y1=y+100;
    float x1=x+100;
    float dx1=5;
    float dy1=5;
    float y2=y+200;
    float x2=x+200;
    float dx2=5;
    float dy2=5;
    float d=50;

    public void settings() {

        fullScreen();

    }public void draw() {
        background(0);
        fill(255,0,0);
        ellipse(x,y,d,d);
        x+=dx;
        y+=dy;
        if(x>width-d/2){ x=width-d/2;dx=-dx;}
        if(x<d/2){x=d/2;dx=-dx;}
        if(y>height-d/2){y=height-d/2;dy=-dy;}
        if(y<d/2){y=d/2;dy=-dy;}

        fill(0,255,0);
        ellipse(x1,y1,d,d);
        x1+=dx1;
        y1+=dy1;
        if(x1>width-d/2){x1=width-d/2;dx1=-dx1;}
        if(x1<d/2){x1=d/2;dx1=-dx1;}
        if(y1>height-d/2){y1=height-d/2;dy1=-dy1;}
        if(y1<d/2){y1=d/2;dy1=-dy1;}


        fill(0,0,255);
        ellipse(x2,y2,d,d);
        x2+=dx2;
        y2+=dy2;
        if(x2>width-d/2){x2=width-d/2;dx2=-dx2;}
        if(x2<d/2){x2=d/2;dx2=-dx2;}
        if(y2>height-d/2){y2=height-d/2;dy2=-dy2;}
        if(y2<d/2){y2=d/2;dy2=-dy2;}

    }
    public static void main(String... args) {

        PApplet.main("Main");

    }

}

