import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int NumberOfBalls=4;
    int x[]={0,0,0,0};

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        for(int i=1;i<=NumberOfBalls;i++){
            drawCircle(i);
        }
    }

    private int drawCircle(int getValue) {
        ellipse(x[getValue - 1], getHeight(getValue), DIAMETER, DIAMETER);
        x[getValue - 1] += getValue;
        return getValue;
    }
    private float getHeight(int getValue){
        return (float) (HEIGHT*getValue)/5.0f;
    }
}
