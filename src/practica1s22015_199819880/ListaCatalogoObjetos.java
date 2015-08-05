/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

/**
 *
 * @author allan
 */
public class ListaCatalogoObjetos {
    
    NodoCatalogoObjetos Cabeza;
    NodoCatalogoObjetos Fin;
    static ListaCatalogoObjetos ListaObjetos = new ListaCatalogoObjetos();
    
    public ListaCatalogoObjetos(){
    
    Cabeza = null;
    Fin = null;
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
    //metodo para mostrar la lista
    
    public void mostrar(){
    
    NodoCatalogoObjetos iterador = Cabeza;
    while(iterador != null){
    System.out.print(iterador.Imagen + "->"+ iterador.nombre);
    iterador = iterador.siguiente;
    }
    System.out.print("null");
    
    
    }
}


