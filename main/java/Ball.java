import java.awt.*;

public class Ball {     //3-67 это класс,где есть размеры,переменные,методы и цвета.
    public static final int DIAMETER = 10;     //4-9 это размеры игровово поля.
    public static final int DEFAULT_X = 205;
    public static final int DEFAULT_Y = 350;
    
    int x = DEFAULT_X;
    int y = DEFAULT_Y;
    
    int xa = 0;   //11-14 это переменные.
    int ya = 0;
    
    int brick;
    
    int ballTopPosition = 0;
    int ballBottomPosition = 0;
    int ballLightPosition = 0;
    int ballLeftPosition = 0;
    
    int brickTopPosition = 0;
    int brickBottomPosition = 0;
    int brickRightPosition = 0;
    int brickLeftPosition = 0;
    
    public static boolean bigBallMode = false;
    public static int bigBallModeColor= 0;
    public static boolean firBallMode = false;

    private Arkanoid game;

    public Ball(Arkanoid game) {
        this.game = game;
    }

    void move() {
    }
    
    private boolean collisionWithBar() {     //35-45 это методы.
        return true;
    }

    private boolean collisionWithBricks() {
        return true;
    }

    private boolean collisionWithBounds() {
        return true;
    }
    
    public void paintBar(Graphics2D graphics) {    //47-63 тут мы создаем цвета.
        graphics.setColor(Color.BLUE);
        if(bigBallMode) {
            if(bigBallModeColor == 0) {
                graphics.setColor(Color.RED);
                bigBallModeColor++;
            } else if (bigBallModeColor == 1) {
                graphics.setColor(Color.WHITE);
                bigBallModeColor++;
                
            } else if (bigBallModeColor == 2) {
                graphics.setColor(Color.GREEN);
                bigBallModeColor++;
                
            }
            graphics.fillOval(x, y ,DIAMETER,DIAMETER);
        } else if (firBallMode) {}
    }
    public Rectangle getBounds() {return new Rectangle(x ,y, DIAMETER,DIAMETER);}
}
/**
 * the Ball is the class where the variants of the balls are recorded
 */
