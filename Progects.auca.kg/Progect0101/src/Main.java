import processing.core.PApplet;
public class Main extends PApplet {
    float x;
    float x1;
    float y;
    float dbr = 0.05f;
    float dsr = 0.01f;
    float br = 25;
    float sr = 10;
    float stopbr = 150;
    float stopsr = 44;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(100);
        strokeWeight(4);
    }
    public void draw() {
        background(0);

        bigStar(width/2,height/2);
        smallStar(width/4,height/4);
        smallStar(width/4,height*3/4);
        smallStar(width*3/4,height/4);
        smallStar(width*3/4,height*3/4);
        stroke(0,255,0);
        strokeWeight(2);
    }
    void smallStar(float x, float y){
        pushMatrix();
        translate(x,y);
        stroke(0,255,0);
        strokeWeight(4);
        line(0,0,br,0); // line +
        line(0,0,sr,sr);
        line(br,0,sr,sr);
        line(0,br,sr,sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        }
        rotate(PI/2);
        line(0,0,br,0); // line +
        line(0,0,sr,sr);
        line(br,0,sr,sr);
        line(0,br,sr,sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        } rotate(PI/2);
        line(0,0,br,0); // line +
        line(0,0,sr,sr);
        line(br,0,sr,sr);
        line(0,br,sr,sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        } rotate(PI/2);
        line(0,0,br,0); // line +
        line(0,0,sr,sr);
        line(br,0,sr,sr);
        line(0,br,sr,sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;

            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        }
        popMatrix();
    }
    void bigStar(float x , float y){
        pushMatrix();
        translate(x,y);
        stroke(255,255,0);
        strokeWeight(4);
        line(0,0,(stopbr + stopbr/6) - br,0); // line +
        line(0,0,stopsr - sr,stopsr - sr);
        line((stopbr + stopbr/6) - br,0,stopsr - sr,stopsr - sr);
        line(0,(stopbr + stopbr/6) - br,stopsr - sr,stopsr - sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        }

        rotate(PI/2);
        line(0,0,(stopbr + stopbr/6) - br,0); // line +
        line(0,0,stopsr - sr,stopsr - sr);
        line((stopbr + stopbr/6) - br,0,stopsr - sr,stopsr - sr);
        line(0,(stopbr + stopbr/6) - br,stopsr - sr,stopsr - sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;

        } rotate(PI/2);
        line(0,0,(stopbr + stopbr/6) - br,0); // line +
        line(0,0,stopsr - sr,stopsr - sr);
        line((stopbr + stopbr/6) - br,0,stopsr - sr,stopsr - sr);
        line(0,(stopbr + stopbr/6) - br,stopsr - sr,stopsr - sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        } rotate(PI/2);
        line(0,0,(stopbr + stopbr/6) - br,0); // line +
        line(0,0,stopsr - sr,stopsr - sr);
        line((stopbr + stopbr/6) - br,0,stopsr - sr,stopsr - sr);
        line(0,(stopbr + stopbr/6) - br,stopsr - sr,stopsr - sr);
        br += dbr;
        sr += dsr;
        if (br > stopbr){
            br = stopbr;
            dbr = - dbr;
            dsr = - dsr;
        }
        if (br < stopbr/5){
            br = stopbr/5;
            dbr = - dbr;
            dsr = - dsr;
        }
        popMatrix();
    }
    public static void main(String... args) {
        PApplet.main("Main");
    }
}