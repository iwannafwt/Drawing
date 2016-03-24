/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class ScaleHandler extends JFrame implements MouseWheelListener {

    private ShapeConstr rect;

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

        doScale(e);
    }

    private void doScale(MouseWheelEvent e) {

        int x = e.getX();
        int y = e.getY();

        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {

            if (rect.isHit(x, y)) {

                float amount = e.getWheelRotation() * 5f;
                rect.addWidth(amount);
                rect.addHeight(amount);

                Repaint rp = new Repaint();
                rp.repaint();
            }
        }
    }

}
