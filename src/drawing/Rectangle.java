package drawing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class Rectangle extends JPanel {

    private ShapeConstr rect;

    public Rectangle() {
        initUI2();
    }

    private void initUI2() {
        MovingAdapter ma = new MovingAdapter();

        addMouseMotionListener(ma);
        addMouseListener(ma);
        addMouseWheelListener(new ScaleHandler());

        rect = new ShapeConstr(150, 150, 50, 50);//i thesi pou tha briskete 
        //to tetragwno
    }

    private void doDrawingRectangle(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Font font = new Font("Serif", Font.BOLD, 40);
        g2d.setFont(font);

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        //i dimiourgia tou tetragwnou
        g2d.setPaint(new Color(0, 0, 100));// to xrwmma pou tha exei to tetragwno
        g2d.fill(rect);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawingRectangle(g);
    }

}
