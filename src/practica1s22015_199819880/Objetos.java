/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author allan
 */
public class Objetos extends JLabel {

    public Objetos(ListaCatalogoObjetos objetos) {
        
        NodoCatalogoObjetos raiz = objetos.Cabeza;
        int i=0;
        while(raiz != null){
        
        i++;
        raiz = raiz.getSiguiente();
        
        }
        this.setBounds(5,80,130,510);
        this.setOpaque(true);
        this.setLayout(null);
        this.setVisible(true);
        
         raiz = objetos.Cabeza;
        i=0;
        while(raiz!= null){
          
          URL url = this.getClass().getResource(raiz.Imagen);
            ImageIcon a = new ImageIcon(url);
        
          java.awt.Image b = a.getImage();
          ImageIcon c = new ImageIcon(b.getScaledInstance(95, 95, java.awt.Image.SCALE_DEFAULT));
          
          
          JLabel imagen = new JLabel(c);
          imagen.setBounds(15, 5+(i*100), 95, 95);
          imagen.setVisible(true);
          this.add(imagen);
          i++;
          raiz = raiz.siguiente;
        }
        
        
    }    
}
