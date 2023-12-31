/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.SistemaDeJuego;

/**
 *
 * @author 50672
 */
public class VentanaJugadores extends javax.swing.JFrame {
    SistemaDeJuego sistema;
    /**
     * Creates new form VentanaJugadores
     */
    public VentanaJugadores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfNodos = new javax.swing.JTextField();
        ComboBoxCant = new javax.swing.JComboBox<>();
        btnListo = new javax.swing.JButton();
        lblCantidadNodos = new javax.swing.JLabel();
        lblCantidadJugadores = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Numero de Jugadores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txfNodos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNodosActionPerformed(evt);
            }
        });
        jPanel1.add(txfNodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 80, 30));

        ComboBoxCant.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboBoxCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));
        ComboBoxCant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(ComboBoxCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 60, 20));

        btnListo.setText("A JUGAR!");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        lblCantidadNodos.setBackground(new java.awt.Color(255, 255, 255));
        lblCantidadNodos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCantidadNodos.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidadNodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadNodos.setText("Cantidad de nodos:");
        jPanel1.add(lblCantidadNodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 260, 50));

        lblCantidadJugadores.setBackground(new java.awt.Color(255, 255, 255));
        lblCantidadJugadores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCantidadJugadores.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidadJugadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadJugadores.setText("Cantidad de jugadores:");
        jPanel1.add(lblCantidadJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 260, 50));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Jugadores.jpg"))); // NOI18N
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        /*if(Integer.parseInt(txfNodos.getText()) < 19){
            JOptionPane.showMessageDialog(this, "La cantidad de nodos debe ser mayor o igual a 19", "Error", 0);
        }
        else{*/
            sistema = new SistemaDeJuego(ComboBoxCant.getSelectedIndex()+2, Integer.parseInt(txfNodos.getText()));
            new VentanaCreacionGrafo(sistema).setVisible(true);
            this.dispose();
        //}
    }//GEN-LAST:event_btnListoActionPerformed

    private void txfNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNodosActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCant;
    private javax.swing.JButton btnListo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadJugadores;
    private javax.swing.JLabel lblCantidadNodos;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txfNodos;
    // End of variables declaration//GEN-END:variables
}
