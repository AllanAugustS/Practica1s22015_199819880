/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;

/**
 *
 * @author allan
 */
public class CrearPantalla extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form CrearPantalla
     * @param ancho
     * @param alto
     * @param imagen
     */
    
     private final Tablero tablero;
     private final ListaCatalogoObjetos cobjetos;
     private final PilaListaCatalogo pila;
     private final ColaListaCatalogo cola;
     private int totalObjetos,cantObjetos;
     private Objetos lblobjetos;
     private Matriz matriz;
     private Thread hilo1;
    
    public CrearPantalla(int ancho, int alto, String imagen, ListaCatalogoObjetos cobjetos ) {
        initComponents();
        
        
        
        tablero = new Tablero(alto, alto, imagen);
        this.add(tablero);
        this.cobjetos = cobjetos;
        this.pila = new PilaListaCatalogo();
        this.cola = new ColaListaCatalogo();
        this.totalObjetos = cobjetos.getCantidad();
        this.cantObjetos = 0;
        this.matriz = new Matriz();
        matriz.insertarColumnas(ancho, alto);
        matriz.cabeceras();
        this.insertarPrimeros();
        this.agregarObjetos();
        hilo1 = new Thread(this);
        hilo1.start();
        
         Objetos panel = new Objetos(cobjetos);
        JScrollPane scroolPane = new JScrollPane(panel);
        scroolPane.setBounds(5, 80, 130, 500);
        scroolPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroolPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        this.add(scroolPane);
        this.repaint();
    }

    public void hilo(){
    
        int objetos = cobjetos.getCantidad();
        
        int num1 =(int)Math.floor(Math.random()*(objetos-0+1)+0);
        if(cantObjetos<totalObjetos){
        NodoCatalogoObjetos nodo = cobjetos.Cabeza;
        for(int j=1; j<num1;j++){
        nodo = nodo.getSiguiente();
        
        }
        cantObjetos++;
        pila.insertar(nodo.getImagen(), nodo.getNombre());
        }
    this.remove(lblobjetos);
    this.agregarObjetos();
    this.repaint();
    }
    
    public void insertarPrimeros(){
    
    int Objetos = cobjetos.getCantidad();
    
    for(int i=0; i<5; i++){
       int num1 = (int) Math.floor(Math.random()*(Objetos-0+1)+0);
       if(cantObjetos<totalObjetos){
       NodoCatalogoObjetos nodo = cobjetos.Cabeza;
       for(int j=1; j<num1; j++){
          nodo = nodo.getSiguiente();
       }
       cantObjetos++;
       pila.insertar(nodo.getImagen(), nodo.getNombre());
       }
    
    }
    
    }
    
    public void agregarObjetos(){
    
    lblobjetos = new Objetos(cobjetos);
    this.add(lblobjetos);
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Objetos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("MARIO MAKER GUATEMALTECO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(480, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if(KeyEvent.VK_ENTER == evt.getKeyCode()){
    
       new PausarJuego( cobjetos,pila,cola, matriz).setVisible(true);
    }
    }//GEN-LAST:event_formKeyPressed
 
   
   
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while(true){
        this.hilo();
        try{
          Thread.sleep(5000);
        }catch (InterruptedException ex){
            Logger.getLogger(CrearPantalla.class.getName()).log(Level.SEVERE,null,ex);
        }
        }
    }
}
