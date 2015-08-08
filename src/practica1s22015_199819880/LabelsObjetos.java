/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author allan
 */
public class LabelsObjetos extends JLabel {
    
    public LabelsObjetos(ListaCatalogoObjetos lista){
    
    // ciclo para saber cuantos nodos existen
        NodoCatalogoObjetos raiz = lista.Cabeza;
        int i=0;
        while(raiz != null){
        
        i++;
        raiz = raiz.getSiguiente();
        }
        //propiedades
        this.setVisible(true);
        this.setBounds(0, 0, 300, (i*300)+30);
        this.setPreferredSize(new Dimension(500, (i*300)+30));
        this.setLayout(null);
    
    //ciclo que inserta los labels en el panel
        raiz = lista.Cabeza;
        i=0;
        while(raiz!= null){
        
        //label imagen
           
            URL url = this.getClass().getResource(raiz.Imagen);
            ImageIcon a = new ImageIcon(url);
            java.awt.Image b= a.getImage();
            ImageIcon c = new ImageIcon(b.getScaledInstance(80, 80, java.awt.Image.SCALE_DEFAULT));
            
            JLabel Imagen = new JLabel(c);
            Imagen.setBounds(5, 5+(i*100), 80, 80);
            Imagen.setVisible(true);
            this.add(Imagen);
        //label nombre
            
            JLabel nombre = new JLabel("Nombre Objeto:" + raiz.nombre);
            nombre.setBounds(100, 5+(i*100), 200, 25);
            nombre.setVisible(true);
            this.add(nombre);
        //boton eliminar
            
            JButton eliminar = new JButton("Eliminar");
            eliminar.setBounds(250, 5+(i*100), 200, 25);
            eliminar.setVisible(true);
            this.add(eliminar);
        //boton modificar
            
            JButton modificar = new JButton("Modificar");
            modificar.setBounds(470, 5+(i*100), 200, 25);
            modificar.setVisible(true);
            this.add(modificar);
            
            i++;
            raiz = raiz.siguiente;
        }
        
    }
    
}
