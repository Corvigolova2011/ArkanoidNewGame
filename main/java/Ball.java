import java.awt.*;

public class Ball {
    public static final int DIAMETER = 10;
    public static final int DEFAULT_X = 205;
    public static final int DEFAULT_Y = 350;

    int x = DEFAULT_X;
    int y = DEFAULT_Y;

    int xa = 0;
    int ya = 0;

    int brick;

    int ballTopPosition = 0;
    int ballBottomPosition = 0;
    int ballRightPosition = 0;
    int ballLeftPosition = 0;

    int brickTopPosition = 0;
    int brickBottomPosition = 0;
    int brickLeftPosition = 0;
    int brickRightPosition = 0;

    public static boolean bigBallMode = false;
    public static int bigBallModeColor = 0;
    public static boolean fireBallMode = false;
    public static int fireBallModeColor = 5;

    private Arkanoid game;

    public Ball(Arkanoid game) {
        this.game = game;
    }

    void move() {
    }

    private boolean collisionWithBar() {
        return true;
    }

    private boolean collisionWithBricks() {
        return true;
    }

    private boolean collisionWithBounds() {
        return true;
    }

    public void paintBall(Graphics2D graphics) {
        graphics.setColor(Color.BLUE);
        if(bigBallMode) {
            if(bigBallModeColor == 0) {
                graphics.setColor(Color.RED);
                bigBallModeColor++;
            } else if (bigBallModeColor == 1) {
                graphics.setColor(Color.WHITE);
                bigBallModeColor++;
            } else if(bigBallModeColor == 2) {
                graphics.setColor(Color.GREEN);
                bigBallModeColor = 0;
            }
            graphics.fillOval(x, y, DIAMETER, DIAMETER);
        } else if(fireBallMode){}
    }

    public Rectangle getBounds() {return  new Rectangle(x, y, DIAMETER, DIAMETER);}
}
/**
 * the Ball is the class where the variants of the balls are recorded
 */
