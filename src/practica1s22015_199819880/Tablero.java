/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author allan
 */
public class Tablero extends JLabel {
    
    public Tablero(int x, int y, String imagen){
    
    ImageIcon a = new ImageIcon(imagen);
    java.awt.Image b = a.getImage();
    ImageIcon c = new ImageIcon(b.getScaledInstance(895, 590, java.awt.Image.SCALE_DEFAULT));
    
    this.setIcon(c);
    this.setBounds(140, 10, 875, 590);
    this.setVisible(true);
    this.setLayout(null);
    
    }
    
}
