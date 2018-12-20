import processing.core.PApplet;

//PROGECT 0103;
public class Main extends PApplet {
    float x=100;
    float n;
    float e;
    float d;
    float c;
    float b;
    float a;
    float f;
    float g;
    float h;
    float i;
    float dx;


    public void settings() {

        fullScreen();
    }
    public void setup() {
        n= width / 2;
        frameRate(7);
        e=n;
        d=n-x;
        c=n-2*x;
        b=n-3*x;
        a=n-4*x;
        f=n+x;
        g=n+2*x;
        h=n+3*x;
        i=n+4*x;
        dx=100;

    }


    public void draw() {
        background(0);
        stroke(255,0,0);
        fill(255,0,0,50);
        ellipse(a,height/2,x,60);

        stroke(255,0,0);
        fill(255,0,0,120);
        ellipse(b,height/2,x,100);

        stroke(255,0,0);
        fill(255,0,0,200);
        ellipse(c,height/2,x,150);

        stroke(255,0,0);
        fill(255,0,0,230);
        ellipse(d,height/2,x,200);

        stroke(255,0,0);
        fill(255,0,0);
        ellipse(e,height/2,x,250);

        stroke(255,0,0);
        fill(255,0,0,230);
        ellipse(f,height/2,x,200);

        stroke(255,0,0);
        fill(255,0,0,200);
        ellipse(g,height/2,x,150);

        stroke(255,0,0);
        fill(255,0,0,150);
        ellipse(h,height/2,x,100);

        stroke(255,0,0);
        fill(255,0,0,50);
        ellipse(i,height/2,x,60);
        a+=dx;
        b+=dx;
        c+=dx;
        d+=dx;
        e+=dx;
        f+=dx;
        g+=dx;
        h+=dx;
        i+=dx;
        if(a>width/2+4*x){
           a=width/2-4*x; }
        if(b>width/2+4*x){
            b=width/2-4*x; }
        if(c>width/2+4*x){
            c=width/2-4*x; }
        if(d>width/2+4*x){
            d=width/2-4*x; }
        if(e>width/2+4*x){
            e=width/2-4*x; }
        if(f>width/2+4*x){
            f=width/2-4*x;}
        if(g>width/2+4*x){
            g=width/2-4*x; }
        if(h>width/2+4*x){
            h=width/2-4*x; }
        if(i>width/2+4*x){
            i=width/2-4*x;
        } }
        public static void main(String... args) {
        PApplet.main("Main");

    }}