/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Excepciones.sinTexto;
import ejercicio2bd4o.Ejercicio2BD4o;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw12
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar2 = new javax.swing.JToolBar();
        bAlta = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        miAcontecimientos = new javax.swing.JMenu();
        miAlta = new javax.swing.JMenuItem();
        miBaja = new javax.swing.JMenuItem();
        miModificar = new javax.swing.JMenuItem();
        miAsistir = new javax.swing.JMenu();
        miListado = new javax.swing.JMenuItem();
        miApuntarse = new javax.swing.JMenuItem();
        miBuscarEvento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        bAlta.setIcon(new javax.swing.ImageIcon("C:\\Users\\1gdaw05.ARRIAGAINFO\\Desktop\\Raul\\Program\\Programaci-n\\Tema 9\\Practica 1\\imagenes\\Ejercicio2\\nueva-ventana.png")); // NOI18N
        bAlta.setFocusable(false);
        bAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAlta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });
        jToolBar2.add(bAlta);

        bModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\1gdaw05.ARRIAGAINFO\\Desktop\\Raul\\Program\\Programaci-n\\Tema 9\\Practica 1\\imagenes\\Ejercicio2\\diseno-web.png")); // NOI18N
        bModificar.setFocusable(false);
        bModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        jToolBar2.add(bModificar);

        bBaja.setIcon(new javax.swing.ImageIcon("C:\\Users\\1gdaw05.ARRIAGAINFO\\Desktop\\Raul\\Program\\Programaci-n\\Tema 9\\Practica 1\\imagenes\\Ejercicio2\\basura.png")); // NOI18N
        bBaja.setFocusable(false);
        bBaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaActionPerformed(evt);
            }
        });
        jToolBar2.add(bBaja);

        miAcontecimientos.setText("Eventos");

        miAlta.setText("Dar de Alta Evento");
        miAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAltaActionPerformed(evt);
            }
        });
        miAcontecimientos.add(miAlta);

        miBaja.setText("Dar de Baja Evento");
        miBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBajaActionPerformed(evt);
            }
        });
        miAcontecimientos.add(miBaja);

        miModificar.setText("Modificar un Evento");
        miModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarActionPerformed(evt);
            }
        });
        miAcontecimientos.add(miModificar);

        jMenuBar1.add(miAcontecimientos);

        miAsistir.setText("Asistir a evento");

        miListado.setText("Lista de Eventos");
        miListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListadoActionPerformed(evt);
            }
        });
        miAsistir.add(miListado);

        miApuntarse.setText("Apuntarse a Evento");
        miApuntarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miApuntarseActionPerformed(evt);
            }
        });
        miAsistir.add(miApuntarse);

        miBuscarEvento.setText("Buscar un Evento");
        miBuscarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarEventoActionPerformed(evt);
            }
        });
        miAsistir.add(miBuscarEvento);

        jMenuBar1.add(miAsistir);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAltaActionPerformed
        Ejercicio2BD4o.abrirVentanaAltas();
    }//GEN-LAST:event_miAltaActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
        miAlta.doClick();
    }//GEN-LAST:event_bAltaActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        miModificar.doClick();
    }//GEN-LAST:event_bModificarActionPerformed

    private void miListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListadoActionPerformed
        
    }//GEN-LAST:event_miListadoActionPerformed

    private void bBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaActionPerformed
        miBaja.doClick();
    }//GEN-LAST:event_bBajaActionPerformed

    private void miBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBajaActionPerformed
        Ejercicio2BD4o.darBaja();
    }//GEN-LAST:event_miBajaActionPerformed

    private void miBuscarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarEventoActionPerformed
        Ejercicio2BD4o.buscarEvento();
    }//GEN-LAST:event_miBuscarEventoActionPerformed

    private void miModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarActionPerformed
        try{
            String nEvento = JOptionPane.showInputDialog("Introduce el nombre del evento que quieres modificar");
            validarNombre(nEvento);
            Ejercicio2BD4o.modificarEvento(nEvento);
        }
        catch(sinTexto e){
            JOptionPane.showMessageDialog(null, "Hay que introducir texto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Problemas al modificar " + e.getMessage());
        }
    }//GEN-LAST:event_miModificarActionPerformed

    private void miApuntarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miApuntarseActionPerformed
        Ejercicio2BD4o.abrirVentanaAltaPersonas();
    }//GEN-LAST:event_miApuntarseActionPerformed
    
    public static void validarNombre(String nombre)throws Exception{
        
        if(nombre.isEmpty())
            throw new sinTexto();
    }
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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bModificar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu miAcontecimientos;
    private javax.swing.JMenuItem miAlta;
    private javax.swing.JMenuItem miApuntarse;
    private javax.swing.JMenu miAsistir;
    private javax.swing.JMenuItem miBaja;
    private javax.swing.JMenuItem miBuscarEvento;
    private javax.swing.JMenuItem miListado;
    private javax.swing.JMenuItem miModificar;
    // End of variables declaration//GEN-END:variables
}