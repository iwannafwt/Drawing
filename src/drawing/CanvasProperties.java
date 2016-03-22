package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class CanvasProperties extends JPanel {

    public void doDroawing(Graphics g) {    // edw bazw oti allages
                                            //kai oti properties thelw na exei o 
                                            //camvas mou.p.x to xrwmma tou
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public void paintComponent(Graphics g){ //gia na efarmostoun ola ta parapanw 
                                            //prepei na na kalesw ti super....
                                            //kai na kalesw tn sunartisi pou exei 
                                            //ta properties.
        super.paintComponent(g);
        doDroawing(g);
    }
}
