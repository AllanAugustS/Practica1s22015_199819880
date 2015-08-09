/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author allan
 */
public class LabelsObjetos extends JLabel {
    
    public  LabelsObjetos(ListaCatalogoObjetos lista){
    
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
            
         final   JLabel Imagen = new JLabel(c);
            Imagen.setBounds(5, 5+(i*100), 80, 80);
            Imagen.setVisible(true);
            this.add(Imagen);
        //label nombre
            
           final JLabel nombre = new JLabel(raiz.nombre);
            nombre.setBounds(100, 5+(i*100), 200, 25);
            nombre.setVisible(true);
            this.add(nombre);
       
          //boton eliminar
            JButton eliminar = new JButton("Eliminar");
            eliminar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
//                   
                     ListaCatalogoObjetos.ListaObjetos.eliminar(nombre.getText());                                          
                     ListaCatalogoObjetos.ListaObjetos.mostrar();
                     
                }
            });
            
            eliminar.setBounds(250, 5+(i*100), 200, 25);
            eliminar.setVisible(true);
            this.add(eliminar);
            
            //boton modificar
            JButton modificar = new JButton("Modificar");
           final  JTextField parametro = new JTextField("");
           JLabel lblnombre = new JLabel("Nombre:");
            modificar.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

               ListaCatalogoObjetos.ListaObjetos.modificar(nombre.getText(), parametro.getText());
               
               ListaCatalogoObjetos.ListaObjetos.mostrar();
               parametro.setText("");
               
               
                }
            });
            
            modificar.setBounds(450, 5+(i*100), 200, 25);
            modificar.setVisible(true);
            this.add(modificar);
            parametro.setBounds(550, 35+(i*100), 100, 15);
            parametro.setVisible(true);
            this.add(parametro);
            lblnombre.setBounds(450, 35+(i*100),50,15);
            lblnombre.setVisible(true);
            this.add(lblnombre);
            
            
            i++;
            raiz = raiz.siguiente;
        }
       
    }
    
}
