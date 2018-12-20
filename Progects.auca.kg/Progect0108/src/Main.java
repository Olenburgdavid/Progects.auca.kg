import processing.core.PApplet;//PROGECT 0108
public class Main extends PApplet {
    int a;
    int b;
    float x,z;
    float y;
    public void settings() {
        fullScreen();
    }
    public void setup() {
a = 0; b = 0; x = 0; z = 0; y = 0;
        noStroke(); }
    public void draw() {
        background(0);
        fill(255,0,0);
        ellipse(width/2,height/2,100,100);
        pushMatrix();
        fill(0,0,255);
        translate(width/2,height/2);
        rotate(y);
        ellipse(200,200,40,40);
        popMatrix();
        pushMatrix();
        fill(255,0,0);
        translate(width/2,height/2);
        rotate(y);
        fill(255,0,0);
        translate(200,200);
        rotate(z);
        ellipse(50,50,15,15);
        popMatrix();
        z += radians(3);
        x += radians(2);
        y += radians(1); }
    public static void main(String... args) {
        PApplet.main("Main");
    }
}