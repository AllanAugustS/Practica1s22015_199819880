/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

/**
 *
 * @author allan
 */
public class NodoMatriz {
    
    private NodoMatriz izq, der, arr, abj;
    private Cabecera ccolumna, cfila;
    private int fila,columna;
    private final ListaCatalogoObjetos lista;
    
    public NodoMatriz(int fila, int columna){
    this.izq = this.der = this.abj = this.arr = null;
    this.ccolumna = this.cfila = null;
    this.lista = new ListaCatalogoObjetos();
    this.fila = fila;
    this.columna = columna;
   }

    public NodoMatriz getIzq() {
        return izq;
    }

    public void setIzq(NodoMatriz izq) {
        this.izq = izq;
    }

    public NodoMatriz getDer() {
        return der;
    }

    public void setDer(NodoMatriz der) {
        this.der = der;
    }

    public NodoMatriz getArr() {
        return arr;
    }

    public void setArr(NodoMatriz arr) {
        this.arr = arr;
    }

    public NodoMatriz getAbj() {
        return abj;
    }

    public void setAbj(NodoMatriz abj) {
        this.abj = abj;
    }

    public Cabecera getCcolumna() {
        return ccolumna;
    }

    public void setCcolumna(Cabecera ccolumna) {
        this.ccolumna = ccolumna;
    }

    public Cabecera getCfila() {
        return cfila;
    }

    public void setCfila(Cabecera cfila) {
        this.cfila = cfila;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
}
