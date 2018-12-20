import processing.core.PApplet;


import javax.swing.*;


//PROGECT 0104
public class Main extends PApplet {

    static String first;
    static String second;
    float x;
    float y; 
    float x1;
    float y1;
    float dx1;
    float dx;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        x = width / 2;
        y = height / 2 - 50;
        x1 = width / 2;
        y1 = height / 2 + 100;
        dx = 5;



    }


    public void draw() {
        background(0);
        textSize(150);
        textAlign(CENTER, CENTER);
        fill(255, 0, 0);
        text(first, x, y);
        textSize(150);
        textAlign(CENTER, CENTER);
        fill(0, 0, 255);
        text(second, x1, y1);
        dx1 = ((width-textWidth(second))/(width-textWidth(first))) * dx;
        x += dx;
        x1 -= dx1;
        if (x > width - (textWidth(first)) / 2) {
            x = width - (textWidth(first)) / 2;
            dx = -dx;
        }
        if (x1 > width - (textWidth(second)) / 2) {
            x1 = width - (textWidth(second)) / 2;
            dx1 = -dx1;
        }
        if (x < (textWidth(first)) / 2) {
            x = (textWidth(first)) / 2;
            dx = -dx;
        }
        if (x1 < (textWidth(second)) / 2) {
            x1 = (textWidth(second)) / 2;
            dx1 = -dx1; } }
    public static void main(String... args) {
        first = JOptionPane.showInputDialog("First word: ");
        second = JOptionPane.showInputDialog("Second word: ");
        PApplet.main("Main");

    }

}