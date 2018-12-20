import processing.core.PApplet;
//PROGECT 0110
import javax.swing.*;
public class Main extends PApplet {
    static int n;
    float x;
    float x1;
    float y;
    float y1;
    float r;
    float mainquadro = 300;
    float Distance;
    float alfa;
    float dx = 3;
    float dy = 3;

    public void settings() {
        fullScreen();
    }
    public void setup(){
        frameRate(100);
        noStroke();
        r = (float) (mainquadro / (Math.sqrt(2.0))/n);
        Distance = mainquadro / n/2;
        x1 = width/2 -Distance * (n -1);
        y1 = height/2-Distance * (n - 1);
        x = width/2;
        y = height/2;
    }
    public void draw() {
        background(0);
        pushMatrix();
        translate(x,y);
        for (float i = 0; i<=Distance * 2 *(n-1);i += 2 * Distance){
            kvadrat(i,0);
            for (float f = 0; f<=Distance * 2 *(n-1); f += 2 * Distance){
              kvadrat(i,f); } }
        popMatrix();
        x += dx;
        y += dy;
        if (x > width + Distance - mainquadro) {
            x = width + Distance - mainquadro;
            dx = -dx;
        }
        if (x < Distance) {
            x =Distance;
            dx = -dx;
        }
        if (y > height + Distance - mainquadro){
            y = height + Distance - mainquadro;
            dy = -dy;
        }
        if (y < Distance){
            y = Distance;
            dy = -dy; } }
    private void kvadrat(float x, float y) {
        pushMatrix();
        translate(x,y);
        rotate(alfa);
        alfa += 0.001;
        fill(255,255,255);
        rectMode(CENTER);
        rect(0,0,r,r);
        popMatrix(); }
    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        PApplet.main("Main");
    }}

