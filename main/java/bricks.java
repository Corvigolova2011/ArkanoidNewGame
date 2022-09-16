import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class bricks {
    //int[] array = new int[10];
    public ArrayList<ArrayList<Brick>> brickRow = new ArrayList<>();

    public List<Brick> bricks = new ArrayList<>();

    private Arakanoid game;

    public bricks(Arakanoid game) {
        this.game = game;
    }

    public static class Brick {
        private static final int WIDTH = 15;
        public static final int HEIGHT = 10;
        int x = 15;
        int y = 10;

        Color color = Color.BLUE;
    }

    public void paint(Graphics2D graphics) {
        for (int i = 0; i < 0; i++)
            for (int j = 0; j < 0; j++) {
            }
    }
}
/**
 *Bricks is a class where Brick variants are created for the game Arkanoid
 */
