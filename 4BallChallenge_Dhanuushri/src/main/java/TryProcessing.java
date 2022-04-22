import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
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
        drawCircle(1);
        drawCircle(2);
        drawCircle(3);
        drawCircle(4);
    }

    private void drawCircle(int getValue) {
        ellipse(x[getValue-1],(HEIGHT*getValue)/5.0f, DIAMETER,DIAMETER);
        x[getValue-1]+= getValue;
    }

}
