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
public class Objetos extends JLabel {

    public Objetos(ColaListaCatalogo objetos) {
        this.setBounds(5,80,130,510);
        this.setOpaque(true);
        this.setLayout(null);
        this.setVisible(true);
        
        NodoCatalogoObjetos cabeza = objetos.getRaiz();
        for(int i=0; i<5 && cabeza!= null; i++){
        
          ImageIcon a = new ImageIcon(cabeza.getImagen());
          java.awt.Image b = a.getImage();
          ImageIcon c = new ImageIcon(b.getScaledInstance(95, 95, java.awt.Image.SCALE_DEFAULT));
          
          
          JLabel imagen = new JLabel(c);
          imagen.setBounds(15, 5+(i*100), 95, 95);
          imagen.setVisible(true);
          this.add(imagen);
          
          
          cabeza = cabeza.getSiguiente();
        }
        
        
    }
    
    
    
}
