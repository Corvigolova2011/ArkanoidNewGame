package SWING;

import javax.swing.*;
import java.awt.*;

public class Sample2 {
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("новый заголовок нашего окна");
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - WINDOW_WIDTH / 2, dimension.height / 2 - WINDOW_HEIGHT / 2,
                WINDOW_WIDTH, WINDOW_HEIGHT);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
