package drawing;

import javax.swing.JFrame;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class CanvasTable extends JFrame{

    private RectangleConstr rect;
    
    public CanvasTable(){
          initUI();
    }
    
    private void initUI(){
        add(new CanvasProperties());
        add(new Rectangle());
        
        setTitle("Basic Canvas to Draw");// o titlos tou progrmmatos
        setSize(800 , 800);//to megethos tou plaisiou
        setLocationRelativeTo(null);//pou tha emfanizete to plaisio o kambas dld
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//pws tha kleinei o kambas

    }
}
