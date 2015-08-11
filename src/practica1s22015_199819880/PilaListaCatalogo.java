/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author allan
 */
public class PilaListaCatalogo {
    static PilaListaCatalogo pila = new PilaListaCatalogo();
    private NodoCatalogoObjetos raiz;
    private int cantidad;

    public PilaListaCatalogo() {
        raiz = null;
        cantidad = 0;
    }

    public NodoCatalogoObjetos getRaiz() {
        return raiz;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public boolean estaVacia(){
       return raiz == null;
    }
    
    public void insertar(String imagen, String nombre){
    
    if(this.estaVacia()){
    
      raiz = new NodoCatalogoObjetos(imagen, nombre);
    }else{
      NodoCatalogoObjetos temp = raiz;
      while(temp.getSiguiente() !=null){
      
      temp = temp.getSiguiente();
      }
    temp.setSiguiente(new NodoCatalogoObjetos(imagen, nombre));
    }
    cantidad++;
    }
    
    public NodoCatalogoObjetos sacar(){
    
    NodoCatalogoObjetos temp, sacar;
    temp = this.getRaiz();
    if(temp.getSiguiente() == null){
    
       sacar = temp;
       raiz = null;
    }else{
       if(temp.getSiguiente().getSiguiente()== null){
          sacar = temp.getSiguiente();
          temp.setSiguiente(null);
       
       }else{
          while(temp.getSiguiente().getSiguiente() != null){
            temp = temp.getSiguiente();
          
          }
       sacar = temp.getSiguiente();
       temp.setSiguiente(null);
       }
    }
    cantidad --;
    return sacar;
    }
    
    public void imprimir(){
    
    NodoCatalogoObjetos temp = this.getRaiz();
    while(temp!= null){
       System.out.println(temp.getNombre());
       temp = temp.getSiguiente();
    
    }
   }
    
      public void Dibujar(){
    
    String Source="digraph G {\n rankdir=LR;node [shape = record, style=rounded];\n";
    Source = Source+this.Generar();
    FileWriter archivoDot = null;
    PrintWriter escritor = null;
    try{
    
    archivoDot=new FileWriter("Salida.dot");
    escritor = new PrintWriter(archivoDot);
    escritor.println(Source);
    }catch(IOException e){
     e.printStackTrace();
    
    }finally{
        try{
            if(archivoDot!=null){
            archivoDot.close();
            }
        }catch(Exception ex){
           ex.printStackTrace();
        }
    }
    
    }
    
    public void GenerarPNG(){
    
        try{
            String doPath="C:\\Program Files\\Graphviz2.38\\bin\\dot.exe";
            String archivoDot="C:\\Users\\allan\\Documents\\NetBeansProjects\\Practica1s22015_199819880\\Salida.dot";
            String archivoPNG="C:\\Users\\allan\\Documents\\NetBeansProjects\\Practica1s22015_199819880\\reporte.png";
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
        e.printStackTrace();
        }finally{
        }
    
    }
    
    public String Generar(){
    
        String r="";
        String enlaces="";
        int cont=0;
        if(!estaVacia()){
        NodoCatalogoObjetos temporal = raiz;
        while(temporal!=null){
           r=r+"struct"+cont+" [label=\"<f0>Imagen: "+temporal.Imagen + "|<f1>Nombre:"+temporal.nombre+"\"];\n";
           cont++;
           temporal = temporal.getSiguiente();
        }
        for(int i=0;i<cont-1;i++){
          enlaces = enlaces+"struct"+i+":f1->struct"+(i+1)+":f0;\n";
        }
        
        }
    r=r+enlaces+"}";
    return r;
    }
    
}
