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
public class ListaCatalogoObjetos {
    
    NodoCatalogoObjetos Cabeza;
    NodoCatalogoObjetos Fin;
    static ListaCatalogoObjetos ListaObjetos = new ListaCatalogoObjetos();
    static int cantidad;
    public ListaCatalogoObjetos(){
    cantidad=0;
    Cabeza = null;
    Fin = null;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    // metodo para indicar que la lista esta vacia
    
    private boolean EstaVacia(){
    
    boolean vacia = false;
    if(Cabeza == null){
    
    vacia = true;
    }
    return vacia;
         
    }
    //fin de metodo estavacia
    
    // metodo enlaza los dos nodos mediante enlace doble
    
    private void enlazar(NodoCatalogoObjetos nodoA, NodoCatalogoObjetos nodoB){
    
        nodoA.siguiente = nodoB;
        nodoB.anterior= nodoA;
    
    }
    //fin de metodo enlazar   
    
    //metodo insertar al final de la lista
    
    public void insertarFinal(String img, String nom){
    NodoCatalogoObjetos nuevo = new NodoCatalogoObjetos((img), nom);
    if(EstaVacia()){
    Cabeza = nuevo;
    Fin = nuevo;
    }else{
    
    enlazar(Fin, nuevo);
    Fin = nuevo;
    }
    cantidad++;
    }
    //fin de metodo insertar al final de la lista
    // metodo para eliminar al frente o al inicio de la lista
    
    public void EliminarInicio(){
    
        if(!EstaVacia()){
        
        NodoCatalogoObjetos primero = Cabeza.siguiente;
        if(primero == null){
        Cabeza=null;
        Fin = null;
        }else{
        
        primero.anterior= null;
        Cabeza = primero;
        }
        }
    
    }
    //fin de metodo eliminar al inicio de la lista
    //metodo eliminar al final de la lista
    public void EliminarFinal(){
    if(!EstaVacia()){
    NodoCatalogoObjetos ultimo = Fin.anterior;
    if(ultimo == null){
    Cabeza= null;
    Fin = null;
    }else{
    ultimo.siguiente= null;
    Fin = ultimo;
    }
    }
    }
    //fin de metodo elimianr al final de la lista
    //metodo buscar, devuelve una referencia al nodo buscado sino se encuentra devuelve null
    public NodoCatalogoObjetos Buscar(String nom){
    
        NodoCatalogoObjetos buscado = null;
        NodoCatalogoObjetos iterador = Cabeza;
        while (buscado == null & iterador != null){
        if(iterador.nombre == nom){
        buscado= iterador;
        }
        iterador = iterador.siguiente;
        }
    return buscado;
    }
    //fin de metodo buscar
    // metodo buscar por ruta de imagen
      public NodoCatalogoObjetos Buscarruta(String ruta){
    
        NodoCatalogoObjetos buscado = null;
        NodoCatalogoObjetos iterador = Cabeza;
        while (buscado == null & iterador != null){
        if(iterador.Imagen == ruta){
        buscado= iterador;
        }
        iterador = iterador.siguiente;
        }
    return buscado;
    }
      //fin de metodo buscar ruta
    //metodo para mostrar la lista
    
    public void mostrar(){
    
    NodoCatalogoObjetos iterador = Cabeza;
    while(iterador != null){
    System.out.print(iterador.Imagen + "->"+ iterador.nombre);
    iterador = iterador.siguiente;
    }
    System.out.print("null");
    
    
    }
    //fin metodo mostrar lista
    //metodo eliminar nodo
    public void eliminar(String nom){
    
    if(this.Cabeza.getNombre().equals(nom)){
        
        Cabeza= Cabeza.getSiguiente();
    }else{
    NodoCatalogoObjetos aux = this.Cabeza;
    while(aux!=null && !aux.getSiguiente().getNombre().equals(nom)){
    aux = aux.getSiguiente();
    }
    if (aux.getSiguiente().getNombre().equals(nom)){
    aux.setSiguiente(aux.getSiguiente().getSiguiente());
    
    }
    }
    }
    //fin de metodo eliminarnodo
    //metodo modificar lista
    
    public void modificar(String parametro,String nom){
        
        if(this.Cabeza.getNombre().equals(parametro)){       
            String nombre1 = this.Cabeza.getNombre();           
            if(!nom.equals("")){
            nombre1 =nom;
            }
            Cabeza.setNombre(nombre1);
        }else{
        NodoCatalogoObjetos aux = this.Cabeza;
        while(aux !=null && !aux.getNombre().equals(parametro)){
        aux = aux.getSiguiente();
        }
         if(aux.getNombre().equals(parametro)){
         String nombre1= aux.getNombre();
           if(!nom.equals("")){
           nombre1= nom;
           }
           aux.setNombre(nombre1);
         }  
        }
    }
    //fin de metodo modificar
    
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
        if(!EstaVacia()){
        NodoCatalogoObjetos temporal = Cabeza;
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


