/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

/**
 *
 * @author allan
 */
public class PilaListaCatalogo {
    
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
    
}
