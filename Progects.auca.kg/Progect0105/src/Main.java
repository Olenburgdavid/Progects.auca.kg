import processing.core.PApplet;
//PROGECT 0105;
public class Main extends PApplet {
    int circle = 5;
    int circleCount = 100;
    int circleLenght;
    int xPlace;
    int yPlace;
    int maxLenght = 200;
    int randomNumber;
    int step;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
    }


    public void draw() {
        background(0);
        noStroke();
    for (int a = 1; a <= circle; a++) {
            xPlace = (int) random(width);
            yPlace = (int) random(height);
            circleLenght = (int) random(maxLenght, maxLenght);
            randomNumber = (int) random(1, 4);
            step = circleLenght / circleCount;
            int red = 0;
            int green = 0;
            int blue = 0;
            int colorStep = 255 / circleCount;
    if (randomNumber == 1) {
          for (int i = 1; i <= circleCount; i++) {
              fill(red, 0, 0);
               ellipse(xPlace, yPlace, circleLenght, circleLenght);
                circleLenght -= step;
                red += colorStep; }
            } else if (randomNumber == 2) {
     for (int i = 1; i <= circleCount; i++) {
               fill(0, green, 0);
              ellipse(xPlace, yPlace, circleLenght, circleLenght);
                circleLenght -= step;
                green += colorStep; }
            } else if (randomNumber == 3) {
   for (int i = 1; i <= circleCount; i++) {
           fill(0, 0, blue);
    ellipse(xPlace, yPlace, circleLenght, circleLenght);
            circleLenght -= step;
         blue += colorStep; } } } }
        public static void main (String...args){
            PApplet.main("Main");
        } }
