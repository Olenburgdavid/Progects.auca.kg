import processing.core.PApplet;
//Progect 12
import javax.swing.*;
public class Main extends PApplet {
    static String N;
    int n = Integer.parseInt(N);
    float x[]=new float[n];
    float y[]=new float[n];
    float a[]=new float[n];
    float r[]=new float[n];
    float dx[]=new float[n];
    float dy[]=new float[n];
    float h[]=new float[n];
    float dh[]=new float[n];
    float tx[]=new float[n];
    public void settings() {
        fullScreen();
    }
    public void setup() {
        strokeWeight(3);
        for(int i=0;i<n;i++) {
            dx[i] = random(-2, 2);
            dh[i] = random(radians(1), radians(2));
            a[i] = random(30, 255);
            dy[i] =a[i]/30;
            r[i] = a[i] / 7;
            x[i] = random(r[i] * sqrt(2), width - r[i] * sqrt(2));
            tx[i] = x[i];
            y[i] = random(r[i] * sqrt(2), height - r[i] * sqrt(2));

        }
    }
    public void draw() {
        background(0);
        for(int j=0;j<n;j++) {
            drawSnow(x[j], y[j], a[j], r[j], h[j]);
            x[j] += dx[j];
            h[j] += dh[j];
            y[j] += dy[j];
            if (y[j] > height + r[j] * sqrt(2)) {
                y[j] = -r[j] * sqrt(2);
                x[j]=random(r[j] * sqrt(2), width - r[j] * sqrt(2));
            }
            if (x[j] > tx[j] + r[j] / 90) dx[j] = -dx[j];
            if (x[j] < tx[j] - r[j] / 90) dx[j] = -dx[j];
        } }
        private void drawSnow(float x, float y, float a, float r, float h) {
        pushMatrix();
        translate(x, y);
        rotate(h);
        for (int i = 0; i < 2; i++) {
            rotate(PI / 2);
            stroke(255,255,255,a);
            line(-r, 0, r, 0);
        }
        rotate(PI / 4);
        for (int i = 0; i < 2; i++) {
            rotate(PI / 2);
            stroke(255,255,255,a);
            line(-r * sqrt(2), 0, r * sqrt(2), 0);
        }
        popMatrix(); }
    public static void main(String... args) {
        N = JOptionPane.showInputDialog("The number of snows? ");
        PApplet.main("Main");
    }}