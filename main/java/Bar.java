import java.awt.*;

public class Bar {
    public static  final int WIDTH = 30; //константа 2-3
    public static final int HEIGHT = 10;
    public static final int SIDE_WITH = 20;

    public static Color bar_main_color = Color.RED;
    public static Color bar_side_color = Color.BLACK;

    public int x; //кордината платформы

    public int lives = 3; //биты

    public int default_x;
    public int move_speed = 10;

    private Arkanoid game;


    public Bar(Arkanoid game) {
        this.game = game;
    }

    Bar bar = new Bar(new Arkanoid());

    void move(int direction){


    }

    public static void looseLive(Arkanoid game) {

    }

    public void paintBar(Graphics2D graphics){
        graphics.setColor(bar_side_color);
        graphics.fillRoundRect(0,0,0,0,0,0);

        graphics.setColor(bar_main_color);
        graphics.fillRoundRect(0,0,0,0,0,0);

        graphics.setColor(bar_side_color);
        graphics.fillRoundRect(0,0,0,0,0,0);
    }

    public int getTopY() {return 0;}

    public Rectangle getBoundsRite() {return new Rectangle(0,0,0,0);}

    public Rectangle getBoundsLeft() {return new Rectangle(0,0,0,0);}

    public Rectangle getBounds() {return new Rectangle(0,0,0,0);}


}
/**
 * Bar is a class where the type of hurl used in the game
 * Arkanoid is created
 */
