import java.awt.*;

public class Bar {
    public static  final int WIDTH = 30; //константа 2-3
    public static final int HEIGHT = 10;
    public static Color bar_main_color = Color.RED;
    public static Color bar_side_color = Color.BLACK;

    public int lives = 3; //биты

    public int default_x;
    public int move_speed = 10;

    private Arakanoid game;


    public Bar(Arakanoid game) {
        this.game = game;
    }

    Bar bar = new Bar(new Arakanoid());

    void move(int direction){


    }

    public static void looseLive(Arakanoid game) {

    }

    public void paintBar(Graphics2D graphics){
        graphics.setColor(bar_side_color);
        graphics.fillRoundRect(0,0,0,0,0,0);
        graphics.setColor(bar_main_color);
        graphics.fillRoundRect(0,0,0,0,0,0);
        graphics.setColor(bar_side_color);
        graphics.fillRoundRect(0,0,0,0,0,0);
    }

}
/**
 * Bar is a class where the type of hurl used in the game
 * Arakanoid is created
 */
