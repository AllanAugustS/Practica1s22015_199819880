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
    final private String direccion = "C:/Users/allan/Desktop.reporte.png";

    public String getDireccion() {
        return direccion;
    }
    
    public void dibujar(String archivoDot, String archivoPNG){
    
        try{
            String doPath="C:\\Users\\allan\\Desktop\\release\\bin\\dot.exe";
            archivoDot="Salida.dot";
            archivoPNG="reporte.png";
            String tParam="-Tpng";
            String oParam="-o";
            
            String[] command= new String[5];
            command[0]=doPath;
            command[1]=tParam;
            command[2]=archivoDot;
            command[3]=oParam;
            command[4]=archivoPNG;
            
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(command);
            
        }catch(Exception e){
        }
    }
    
//        try{
//        ProcessBuilder pbuilder;
//        pbuilder = new ProcessBuilder("dot","-Tpng","-o", png,dot);
//        pbuilder.redirectErrorStream(true);
//        pbuilder.start();
//        }catch(Exception e){}
//    }
//    
    public void CatObjetos(NodoCatalogoObjetos raiz){
    
    FileWriter fichero = null;
    try{
      fichero = new FileWriter("Salida.dot");
      PrintWriter pw = new PrintWriter(fichero);
      pw.println(toObjetos(raiz));
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
    
    private String toObjetos(NodoCatalogoObjetos objetos){
    
    StringBuilder b = new StringBuilder();
    b.append("digraph G { \n");
    b.append(ToObjeto(objetos, 0));
    b.append(toCatObjeto(objetos, 0));
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
    
    public void dibujarMatriz(Cabecera filas, Cabecera columnas){
    FileWriter fichero = null;
    try{
      fichero = new FileWriter("Salida.dot");
      PrintWriter pw = new PrintWriter(fichero);
      pw.println(toMatriz(filas, columnas));
      Desktop.getDesktop().open(new File("Salida.dot"));
    }catch(Exception e){
    
    }finally{
       try{
         if(null !=fichero)
             fichero.close();
       }catch(Exception e2){
       
       }
    }
    this.dibujar("Salida.dot", direccion);
    }
    
    private String toMatriz(Cabecera filas, Cabecera columnas){
      StringBuilder b = new StringBuilder();
      b.append("digraph G { \n");
      b.append(moverNodos(columnas));
      Cabecera aux1 =columnas;
      while(aux1!=null){
      b.append(porColumnas(aux1.getPrimero()));
      aux1 = aux1.getSig();
      
      }
    Cabecera aux2 = filas;
    while(aux2!=null){
      b.append(porFilas(aux2.getPrimero()));
      aux2 = aux2.getSig();
    }
    b.append("}\n");
    return b.toString();
    }
    
    private static String moverNodos(Cabecera columna){
    
        StringBuilder b = new StringBuilder();
        if(columna!=null){
           b.append(toNodosMatriz(columna.getPrimero()));
           b.append(moverNodos(columna.getSig()));
        
        }
    return b.toString();
    }
    
    private static String toNodosMatriz(NodoMatriz raiz){
    
    StringBuilder b = new StringBuilder();
    if(raiz!=null){
       b.append(String.format("%s [label = \"%s\"]; %s", "nodo"+String.valueOf(raiz.getFila())+ String.valueOf(raiz.getColumna()),String.valueOf(raiz.getFila())+","+ String.valueOf(raiz.getColumna()),"\n"));
       b.append(toNodosMatriz(raiz.getAbj()));
    
    }
    return b.toString();
    }
    
    private static String porFilas(NodoMatriz raiz){
    
        StringBuilder b = new StringBuilder();
        if(raiz.getIzq()!=null){
           b.append(String.format("%s -> %s; %s", "nodo"+String.valueOf(raiz.getFila())+String.valueOf(raiz.getColumna()), "nodo"+String.valueOf(raiz.getIzq().getFila())+String.valueOf(raiz.getIzq().getColumna()),"\n"));
           
        
        }
        if(raiz.getDer()!=null){
        b.append(String.format("%s -> %s; %s", "nodo"+String.valueOf(raiz.getFila())+String.valueOf(raiz.getColumna()), "nodo"+String.valueOf(raiz.getDer().getFila())+String.valueOf(raiz.getDer().getColumna()),"\n"));
        b.append(porFilas(raiz.getDer()));
                
           
        }
        return b.toString();
    }
    
    private static String porColumnas(NodoMatriz raiz){
    
        StringBuilder b = new StringBuilder();
        if(raiz.getArr()!=null){
           b.append(String.format("%s -> %s; %s", "nodo"+String.valueOf(raiz.getFila())+String.valueOf(raiz.getColumna()), "nodo"+String.valueOf(raiz.getArr().getFila())+String.valueOf(raiz.getArr().getColumna()),"\n"));
           
        
        }
        if(raiz.getAbj()!=null){
        b.append(String.format("%s -> %s; %s", "nodo"+String.valueOf(raiz.getFila())+String.valueOf(raiz.getColumna()), "nodo"+String.valueOf(raiz.getAbj().getFila())+String.valueOf(raiz.getAbj().getColumna()),"\n"));
        b.append(porColumnas(raiz.getAbj()));
                
           
        }
        return b.toString();
    }
    
}
