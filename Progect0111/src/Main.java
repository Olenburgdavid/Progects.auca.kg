import processing.core.PApplet;
//PROGECT11
import javax.swing.*;
public class Main extends PApplet {
    static String N;
    int n = Integer.parseInt(N);
    int c[] = new int[n];
    float x[] = new float[n];
    float y[] = new float[n];
    float da[] = new float[n];
    float a[] = new float[n];
    float R[] = new float[n];
    float dx[] = new float[n];
    float dy[] = new float[n];

    public void settings() {
        fullScreen();
    }
    public void setup() {
        for (int j = 0; j < n; j++) {
            x[j] = random(R[j], width - R[j]);
            y[j] = random(R[j], height - R[j]);
            c[j] = 0xff000000 + (int) random(0x00ffffff);
            R[j] = random(30, 40);
            a[j] = 0;
            da[j] = random(radians(5), radians(8));
            dx[j] = random(-7, 7);
            dy[j] = random(-7, 7);
        }
        strokeWeight(6);
    }


    public void draw() {
        background(0);
        for (int k = 0; k < n; k++) {
            drawStar(x[k], y[k], c[k], a[k], R[k]);
            a[k] += da[k];
            x[k] += dx[k];
            y[k] += dy[k];
            if (x[k] + R[k] > width) {
                x[k] = 2 * width - x[k] - R[k] * 2;
                dx[k] = -dx[k];
                da[k] = -da[k];
            }
            if (x[k] - R[k] < 0) {
                x[k] = 2 * R[k] - x[k];
                dx[k] = -dx[k];
                da[k] = -da[k];
            }
            if (y[k] + R[k] > height) {
                y[k] = 2 * height - y[k] - 2 * R[k];
                dy[k] = -dy[k];
                da[k] = -da[k];
            }
            if (y[k] - R[k] < 0) {
                y[k] = 2 * R[k] - y[k];
                dy[k] = -dy[k];
                da[k] = -da[k];
            } } }

private void drawStar(float x, float y, int c, float a, float R) {
        pushMatrix();
        translate(x, y);
        rotate(a);
        for (int i = 0; i < 5; i++) {
            rotate(PI / 5);
            stroke(c);
            line(-R, 0, R, 0);
        }
        popMatrix();
    }

    public static void main(String... args) {
        N = JOptionPane.showInputDialog("Number of stars? ");
        PApplet.main("Main");
    }
}