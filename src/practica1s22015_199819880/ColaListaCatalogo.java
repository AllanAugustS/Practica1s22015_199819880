/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

/**
 *
 * @author allan
 */
public class ColaListaCatalogo {
    
    private NodoCatalogoObjetos raiz;

    public ColaListaCatalogo() {
        raiz = null;
    }

    public NodoCatalogoObjetos getRaiz() {
        return raiz;
    }
    
   public boolean estaVacia(){
   
   return raiz==null;
   
   }
   
   public void inserta(String imagen, String nombre){
     if(this.estaVacia()){
     
     raiz = new NodoCatalogoObjetos(imagen, nombre);
         
     }else{
     
     NodoCatalogoObjetos temp = raiz;
     while(temp.getSiguiente()!= null){
         temp = temp.getSiguiente();
     }
     temp.setSiguiente(new NodoCatalogoObjetos(imagen, nombre));
     }
   
   }
    
    public NodoCatalogoObjetos sacar(){
    
    NodoCatalogoObjetos sacar;
    sacar = this.getRaiz();
    raiz = raiz.getSiguiente();
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
