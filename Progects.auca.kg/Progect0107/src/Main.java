import processing.core.PApplet;
import javax.swing.*;
//PROGECT 0107
public class Main extends PApplet {
    static String N;
    static String M;
    int r = 300;
    float a = 0;
    int n;
    int m;
    float d;
    public void settings() {
        fullScreen();
    }
    public void setup() {
      n = Integer.parseInt(N);
      m = Integer.parseInt(M);
        d =0;
       strokeWeight(5);
       frameRate(30); }
    public void draw() {
        background(0);
        translate(width/2,height/2);
        rotate(a);
        for (int i = n; i > 0;i--){
            stroke(255,0,0);
 line(r * cos(d),-r*sin(d),r*cos(radians((360/n)*m)+d),
-r*sin(radians((360/n)*m)+d));
        a += radians(0.1f);
        d += radians(360/n); } }
    public static void main(String... args) {
        N = JOptionPane.showInputDialog("N: ");
        M = JOptionPane.showInputDialog("M: ");
        PApplet.main("Main");
    } }