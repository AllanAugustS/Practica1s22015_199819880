/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s22015_199819880;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author allan
 */
public class CargarObjeto extends javax.swing.JFrame {

  
    
   
  
    
    public CargarObjeto() {
        initComponents();
      
       
       String path = "Mario.png";
       URL url = this.getClass().getResource(path);
       ImageIcon ico = new ImageIcon(url);
       labelimagen1.setIcon(ico);
       labelruta1.setText(path);
       labelruta1.setVisible(false);
        
       
       String path3 = "Goomba.png";
       URL url3 = this.getClass().getResource(path3);
       ImageIcon ico3 = new ImageIcon(url3);
       labelimagen3.setIcon(ico3);
       labelruta2.setText(path3);
       labelruta2.setVisible(false); 
       
       String path9 = "Blooper.png";
       URL url9 = this.getClass().getResource(path9);
       ImageIcon ico9 = new ImageIcon(url9);
       labelimagen9.setIcon(ico9);
       labelruta3.setText(path9);
       labelruta3.setVisible(false); 
       
       String path4 = "Mushroom1up.png";
       URL url4 = this.getClass().getResource(path4);
       ImageIcon ico4 = new ImageIcon(url4);
       labelimagen4.setIcon(ico4);
       labelruta4.setText(path4);
       labelruta4.setVisible(false);
//       
       String path5 = "Pared.png";
       URL url5 = this.getClass().getResource(path5);
       ImageIcon ico5 = new ImageIcon(url5);
       labelimagen5.setIcon(ico5);
       labelruta5.setText(path5);
       labelruta5.setVisible(false);
//       
       String path10 = "suelo.png";
       URL url10 = this.getClass().getResource(path10);
       ImageIcon ico10 = new ImageIcon(url10);
       labelimagen10.setIcon(ico10);
       labelruta7.setText(path10);
       labelruta7.setVisible(false);
//       
       String path7 = "Coin .png";
       URL url7 = this.getClass().getResource(path7);
       ImageIcon ico7 = new ImageIcon(url7);
       labelimagen7.setIcon(ico7);
       labelruta6.setText(path7);
       labelruta6.setVisible(false);
//       
       String path8 = "castillo.png";
       URL url8 = this.getClass().getResource(path8);
       ImageIcon ico8 = new ImageIcon(url8);
       labelimagen8.setIcon(ico8);
       labelruta8.setText(path8);
       labelruta8.setVisible(false);
      
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        labelimagen1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        txtnombre2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        labelimagen3 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        txtnombre3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        labelimagen4 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        txtnombre4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        txtnombre5 = new javax.swing.JTextField();
        labelimagen5 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        txtnombre7 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        txtnombre6 = new javax.swing.JTextField();
        labelimagen7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        txtnombre8 = new javax.swing.JTextField();
        labelimagen8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        labelimagen9 = new javax.swing.JLabel();
        labelimagen10 = new javax.swing.JLabel();
        labelruta1 = new javax.swing.JLabel();
        labelruta2 = new javax.swing.JLabel();
        labelruta3 = new javax.swing.JLabel();
        labelruta4 = new javax.swing.JLabel();
        labelruta5 = new javax.swing.JLabel();
        labelruta6 = new javax.swing.JLabel();
        labelruta7 = new javax.swing.JLabel();
        labelruta8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 500));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ravie", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CARGAR OBJETOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 11, 277, 25);

        jButton9.setText("ver objetos agregados");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(10, 390, 150, 23);

        jButton10.setText("Salir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(10, 430, 70, 23);

        labelimagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen1);
        labelimagen1.setBounds(310, 30, 125, 125);

        jLabel19.setText("Nombre");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(297, 190, 50, 14);

        txtnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre1);
        txtnombre1.setBounds(350, 190, 79, 20);

        jButton11.setText("Agregar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(351, 220, 80, 23);

        jButton12.setText("Agregar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(521, 220, 80, 23);

        txtnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre2);
        txtnombre2.setBounds(520, 190, 79, 20);

        jLabel20.setText("Nombre");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(467, 190, 50, 14);

        labelimagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen3);
        labelimagen3.setBounds(480, 30, 125, 125);

        jButton13.setText("Agregar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(691, 220, 80, 23);

        txtnombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre3);
        txtnombre3.setBounds(690, 190, 79, 20);

        jLabel21.setText("Nombre");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(637, 190, 50, 14);

        labelimagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen4);
        labelimagen4.setBounds(810, 30, 125, 125);

        jButton14.setText("Agregar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(851, 220, 80, 23);

        txtnombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre4);
        txtnombre4.setBounds(850, 190, 79, 20);

        jLabel22.setText("Nombre");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(797, 190, 50, 14);

        jButton15.setText("Agregar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(351, 440, 80, 23);

        txtnombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre5);
        txtnombre5.setBounds(350, 410, 79, 20);

        labelimagen5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen5);
        labelimagen5.setBounds(310, 260, 125, 125);

        jLabel23.setText("Nombre");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(297, 410, 50, 14);

        jButton16.setText("Agregar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(851, 440, 80, 23);

        txtnombre7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre7);
        txtnombre7.setBounds(690, 410, 79, 20);

        jLabel24.setText("Nombre");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(637, 410, 50, 14);

        jButton17.setText("Agregar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(531, 440, 80, 23);

        txtnombre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre6);
        txtnombre6.setBounds(530, 410, 79, 20);

        labelimagen7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen7);
        labelimagen7.setBounds(640, 260, 123, 125);

        jLabel25.setText("Nombre");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(467, 410, 60, 14);

        jButton18.setText("Agregar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(691, 440, 80, 23);

        txtnombre8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre8ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre8);
        txtnombre8.setBounds(850, 410, 79, 20);

        labelimagen8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen8);
        labelimagen8.setBounds(810, 260, 124, 125);

        jLabel26.setText("Nombre");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(797, 410, 50, 14);

        labelimagen9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen9);
        labelimagen9.setBounds(640, 30, 125, 125);

        labelimagen10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelimagen10);
        labelimagen10.setBounds(480, 260, 126, 125);
        getContentPane().add(labelruta1);
        labelruta1.setBounds(320, 170, 108, 17);
        getContentPane().add(labelruta2);
        labelruta2.setBounds(490, 170, 108, 17);
        getContentPane().add(labelruta3);
        labelruta3.setBounds(660, 170, 108, 17);
        getContentPane().add(labelruta4);
        labelruta4.setBounds(820, 170, 108, 17);
        getContentPane().add(labelruta5);
        labelruta5.setBounds(340, 380, 94, 17);
        getContentPane().add(labelruta6);
        labelruta6.setBounds(680, 390, 89, 17);
        getContentPane().add(labelruta7);
        labelruta7.setBounds(520, 390, 89, 17);
        getContentPane().add(labelruta8);
        labelruta8.setBounds(820, 390, 108, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1s22015_199819880/fondocargar1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre1ActionPerformed

    private void txtnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre2ActionPerformed

    private void txtnombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre3ActionPerformed

    private void txtnombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre4ActionPerformed

    private void txtnombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre5ActionPerformed

    private void txtnombre7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre7ActionPerformed

    private void txtnombre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre6ActionPerformed

    private void txtnombre8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta1.getText(), txtnombre1.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre1.setText("");
       
        
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta2.getText(), txtnombre2.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre2.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta3.getText(), txtnombre3.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre3.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta4.getText(), txtnombre4.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre4.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta5.getText(), txtnombre5.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre5.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta7.getText(), txtnombre6.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre6.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta6.getText(), txtnombre7.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre7.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       
        ListaCatalogoObjetos.ListaObjetos.insertarFinal(labelruta8.getText(), txtnombre8.getText());
        ListaCatalogoObjetos.ListaObjetos.mostrar();
        txtnombre8.setText("");
        
//        CatalogoObjetos lista = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
//        lista.setVisible(true);
//        lista.setResizable(false);
//        lista.setLocationRelativeTo(null);
//        this.dispose();
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      CatalogoObjetos catalogo = new CatalogoObjetos(ListaCatalogoObjetos.ListaObjetos);
       catalogo.setVisible(true);
       catalogo.setResizable(false);
       catalogo.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CargarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarObjeto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelimagen1;
    private javax.swing.JLabel labelimagen10;
    private javax.swing.JLabel labelimagen3;
    private javax.swing.JLabel labelimagen4;
    private javax.swing.JLabel labelimagen5;
    private javax.swing.JLabel labelimagen7;
    private javax.swing.JLabel labelimagen8;
    private javax.swing.JLabel labelimagen9;
    private javax.swing.JLabel labelruta1;
    private javax.swing.JLabel labelruta2;
    private javax.swing.JLabel labelruta3;
    private javax.swing.JLabel labelruta4;
    private javax.swing.JLabel labelruta5;
    private javax.swing.JLabel labelruta6;
    private javax.swing.JLabel labelruta7;
    private javax.swing.JLabel labelruta8;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtnombre2;
    private javax.swing.JTextField txtnombre3;
    private javax.swing.JTextField txtnombre4;
    private javax.swing.JTextField txtnombre5;
    private javax.swing.JTextField txtnombre6;
    private javax.swing.JTextField txtnombre7;
    private javax.swing.JTextField txtnombre8;
    // End of variables declaration//GEN-END:variables
}
