package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class DrawFigures {
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 400;

    public static void main(String[] args) {
        JFrame newWindow = buildWindow();
        newWindow.add(new MyComponent());
        //getSystemFonts();
    }

    private static class MyComponent extends JComponent {
        

        @Override
        public void paint(Graphics g) {
            Font font = new Font("Ariel", Font.BOLD, 25);
            Graphics2D g2 = (Graphics2D) g;
            String str = "Hallo GameDev!";
            g2.setFont(font);
            g2.drawString(str, 20, 30);

            Line2D newLine1 = new Line2D.Double(70, 70, 90, 90);
            Line2D newLine2 = new Line2D.Double(90, 90, 110, 70);
            Line2D newLine3 = new Line2D.Double(110, 70, 130, 90);
            Line2D newLine4 = new Line2D.Double(130, 90, 150, 70);
            Line2D newLine5 = new Line2D.Double(150, 70, 170, 90);
            g2.draw(newLine1);
            g2.draw(newLine2);
            g2.draw(newLine3);
            g2.draw(newLine4);
            g2.setColor(Color.RED);
            g2.draw(newLine5);
            g2.setColor(Color.BLACK);

            Ellipse2D ellipse2D = new Ellipse2D.Double(100, 100, 150, 70);
            g2.draw(ellipse2D);
            
            Ellipse2D ellipse2D1 = new Ellipse2D.Double(200, 200, 150, 150);
            g2.draw(ellipse2D1);
            g2.fill(ellipse2D1);

            double x1, x2, y1, y2;
            Line2D newLine;
        }
    }

    private static JFrame buildWindow(){
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Рисуем фигуры в окне");
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - WINDOW_WIDTH / 2,
                dimension.height / 2 - WINDOW_HEIGHT / 2,
                WINDOW_WIDTH, WINDOW_HEIGHT);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    private static void getSystemFonts() {
        String[] arrayOfFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String element: arrayOfFonts) {
            System.out.println(element);
        }
    }

}
