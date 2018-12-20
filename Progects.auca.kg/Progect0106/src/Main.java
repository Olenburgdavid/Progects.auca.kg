import processing.core.PApplet;
import javax.swing.*;
//PROGECT 0106
public class Main extends PApplet {
    static String name;
    int n = Integer.parseInt(name);
    float x = 0;
    int m = n;
    public void settings() {
        fullScreen(); }
        public void setup() { }
    public void draw() {
        background(0);
        noStroke();
        while (n > 0) {
            pushMatrix();
            translate(width/2,height/2);
            rotate(x);
            fill(255,0,0,50);
            ellipse(0,0,500,80);
            popMatrix();
            n--;
            x += (PI/m); }
        n = m;
        x += radians(1); }
        public static void main(String... args) {
        name = JOptionPane.showInputDialog("Number: ");
        PApplet.main("Main");
    }}