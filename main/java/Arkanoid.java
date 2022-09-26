import javax.swing.*;


public class Arkanoid {

    public static final int WIDTH = 410; //ширина
    public static final int HEIGHT = 450; //высота



    public static void main(String[] args) {
        JFrame frame = new JFrame("Arsenii game");
        Arkanoid game = new Arkanoid();
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
