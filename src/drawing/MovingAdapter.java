/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;


/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class MovingAdapter extends MouseAdapter {

    private RectangleConstr rect;
    private int x;
    private int y;

    public void mousePressed(MouseEvent e) {

        x = e.getX();
        y = e.getY();
    }

    public void mouseDragged(MouseEvent e) {

        doMove(e);
    }

    private void doMove(MouseEvent e) {

        int dx = e.getX() - x;
        int dy = e.getY() - y;

        if (rect.isHit(x, y)) {

            rect.addX(dx);
            rect.addY(dy);
                
            Repaint rp = new Repaint();
            rp.repaint();
        }

        x += dx;
        y += dy;
    }

}
