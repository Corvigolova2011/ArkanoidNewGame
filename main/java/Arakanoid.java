import javax.swing.*;


public class Arakanoid {

    public static final int WIDTH = 410;
    public static final int HEIGHT = 450;



    public static void main(String[] args) {
        JFrame frame = new JFrame("Arsenii game");
        Arakanoid game = new Arakanoid();
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

    }
}
