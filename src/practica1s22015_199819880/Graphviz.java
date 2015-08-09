/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author allan
 */
public class Graphviz {
    //arreglar el path
    final private String direccion = "/c:/allan/Java.reporte.png";

    public String getDireccion() {
        return direccion;
    }
    
    public void dibujar(String dot, String png){
    
        try{
        ProcessBuilder pbuilder;
        pbuilder = new ProcessBuilder("dot","-Tpng","-o", png,dot);
        pbuilder.redirectErrorStream(true);
        pbuilder.start();
        }catch(Exception e){}
    }
    
    public void CatObjetos(NodoCatalogoObjetos raiz){
    
    FileWriter fichero = null;
    try{
      fichero = new FileWriter("Salida.dot");
      PrintWriter pw = new PrintWriter(fichero);
      pw.println(ToObjetos(raiz));
      Desktop.getDesktop().open(new File("Salida.dot"));
    
    }catch(Exception e){
    }finally{
       try{
        if(null != fichero)
            fichero.close();
       }catch(Exception e2){
       
      }
     }
    this.dibujar("Salida.dot", direccion);
    }
    
    private String ToObjetos(NodoCatalogoObjetos objetos){
    
    StringBuilder b = new StringBuilder();
    b.append("digraph G { \n");
    b.append(ToObjeto(objetos, 0));
    b.append("}\n");
    return b.toString();
    }
    
    private static String ToObjeto(NodoCatalogoObjetos raiz, int i){
    
    StringBuilder b = new StringBuilder();
    if(raiz!=null){
    b.append(String.format("%s [label = \"%s\"]; %s","objeto"+1,raiz.getNombre() + "\\1" + raiz.getImagen(), "\n"));
    i++;
    b.append(ToObjeto(raiz.getSiguiente(), i));
    }
    return b.toString();
    }
    
    private static String toCatObjeto(NodoCatalogoObjetos raiz, int i){
    
        StringBuilder b = new StringBuilder();
        if(raiz.getSiguiente()!=null){
        
        b.append(String.format("%s -> %s %s","Objeto"+1, "Objeto"+(i+1), "\n"));
        i++;
        b.append(toCatObjeto(raiz.getSiguiente(), i));
        }
    return b.toString();
    }
    
    
}
