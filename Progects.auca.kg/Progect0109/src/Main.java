import processing.core.PApplet;
//PROGECT 0109
import javax.swing.*;
public class Main extends PApplet {
    static String number;
    int n = Integer.parseInt(number);
    float a, b, c, x, y;
    int m, k, l,p;
    public void settings() {
        fullScreen();
    }
    public void setup() { c = (height - 400)/n; }
    public void draw() {
        background(0);
        k = n;
        translate(width/2-n*c/2,(height/2-(n*c)/2));
        y = 0;
        l = 0;
        p = 255;
        while (k > 0) {
            x = 0;
            m = n;
        while (m > 0) {
            if (m % 2 != 0) {
                a = p;
                b = l;
            }else {
                a = l;
                b = p;
            }
            fill(a,0,b);
            rect(x,y,c,c);
            x += c;
            if (x > n * c)break;
            m--;
        }
            y += c;
        if (y > n * c)break;
        l = l + p;
        p = l - p;
        l = l - p;
        k--;
        } }
    public static void main(String... args) {
        number = JOptionPane.showInputDialog("Number: ");
        PApplet.main("Main");
    }
}