/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

/**
 *
 * @author allan
 */
public class Cabecera {
    
    private NodoMatriz primero;
    private Cabecera sig;
    private int cabecera;

    public Cabecera(int cabecera) {
        this.sig = null;
        this.primero = null;
        this.cabecera = cabecera;
    }

    public NodoMatriz getPrimero() {
        return primero;
    }

    public void setPrimero(NodoMatriz primero) {
        this.primero = primero;
    }

    public Cabecera getSig() {
        return sig;
    }

    public void setSig(Cabecera sig) {
        this.sig = sig;
    }

    public int getCabecera() {
        return cabecera;
    }

    public void setCabecera(int cabecera) {
        this.cabecera = cabecera;
    }
    
    
    
}
