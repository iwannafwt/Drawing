package drawing;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class Drawing extends JFrame {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                CanvasTable canvasTable = new CanvasTable();

                canvasTable.setVisible(true);
            }
        });

    }

}
