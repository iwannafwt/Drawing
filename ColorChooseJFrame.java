/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchoose;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author freaksoul
 */
public class ColorChooseJFrame extends JFrame {

    private JButton changeColorJButton;
    private Color color= Color.WHITE;
    private JPanel colorJPanel;
    
    public ColorChooseJFrame(){
    super("Choosing Colors");
    
    colorJPanel= new JPanel();
    colorJPanel.setBackground(color);
    
    changeColorJButton=new JButton("Change Color");
    changeColorJButton.addActionListener(
    new ActionListener(){
    public void actionPerformed(ActionEvent e){
    color=JColorChooser.showDialog(rootPane, "Choose a color:", color);
    
    if (color==null)
        color=Color.WHITE;
    
    colorJPanel.setBackground(color);
    
    }
    }
    );
    add(colorJPanel);
    add(changeColorJButton,BorderLayout.SOUTH);
    
    setSize(400,130);
    setVisible(true);
    }
}
   
   
    
    

