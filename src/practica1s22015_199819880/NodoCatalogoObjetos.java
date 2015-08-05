/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

/**
 *
 * @author allan
 */
public class NodoCatalogoObjetos {
    
    String Imagen;
    String nombre;
    NodoCatalogoObjetos anterior;
    NodoCatalogoObjetos siguiente;

    public NodoCatalogoObjetos(String Imagen, String nombre) {
        this.Imagen = Imagen;
        this.nombre = nombre;
        this.anterior = null;
        this.siguiente = null;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoCatalogoObjetos getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCatalogoObjetos anterior) {
        this.anterior = anterior;
    }

    public NodoCatalogoObjetos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCatalogoObjetos siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
