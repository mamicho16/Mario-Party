/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;

import model.Jugador;
import model.SistemaDeJuego;

/**
 *
 * @author 50672
 */
public class VentanaEscogerPersonajes extends javax.swing.JFrame {
    private SistemaDeJuego sistema;
    private ArrayList<String> restantes;
    private int jugadorActual = 0;
    
    /**
     * Creates new form VentanaEscogerPersonajes
     */
    public VentanaEscogerPersonajes(SistemaDeJuego sistema) {
        this.sistema = sistema;
        restantes = new ArrayList<>();
	restantes.add("mario");
	restantes.add("luigi");
	restantes.add("peach");
	restantes.add("toad");
	restantes.add("yoshi");
	restantes.add("wario");
	restantes.add("waluigi");
	restantes.add("birdo");
	restantes.add("bowser");
	restantes.add("donkey_kong");
        sistema.getTablero().getGrafo().imprimir();
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
        lblPersonaje1 = new javax.swing.JLabel();
        lblPersonaje2 = new javax.swing.JLabel();
        lblPersonaje3 = new javax.swing.JLabel();
        lblPersonaje4 = new javax.swing.JLabel();
        lblPersonaje5 = new javax.swing.JLabel();
        lblPersonaje6 = new javax.swing.JLabel();
        lblPersonaje7 = new javax.swing.JLabel();
        lblPersonaje8 = new javax.swing.JLabel();
        lblPersonaje9 = new javax.swing.JLabel();
        lblPersonaje10 = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        lblEscogerPersonajes = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPersonaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mario.png"))); // NOI18N
        lblPersonaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje1MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, 110));

        lblPersonaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/luigi.png"))); // NOI18N
        lblPersonaje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje2MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 60, 120));

        lblPersonaje3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ppeach.png"))); // NOI18N
        lblPersonaje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje3MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 60, 120));

        lblPersonaje4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/toad.png"))); // NOI18N
        lblPersonaje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje4MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 60, 120));

        lblPersonaje5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/yoshi.png"))); // NOI18N
        lblPersonaje5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje5MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 60, 120));

        lblPersonaje6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/wario.png"))); // NOI18N
        lblPersonaje6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje6MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 100, 120));

        lblPersonaje7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/waluigi.png"))); // NOI18N
        lblPersonaje7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje7MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 110));

        lblPersonaje8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/birdo.png"))); // NOI18N
        lblPersonaje8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje8MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, -1));

        lblPersonaje9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bowser.png"))); // NOI18N
        lblPersonaje9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje9MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 130, 120));

        lblPersonaje10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/donkey_kong.png"))); // NOI18N
        lblPersonaje10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonaje10MouseClicked(evt);
            }
        });
        jPanel1.add(lblPersonaje10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 110, 120));

        lblNum.setForeground(new java.awt.Color(0, 0, 0));
        lblNum.setText("1");
        jPanel1.add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 20, -1));

        lblTurno.setForeground(new java.awt.Color(0, 0, 0));
        lblTurno.setText("Turno de escoger del jugador #");
        jPanel1.add(lblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        lblEscogerPersonajes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEscogerPersonajes.setForeground(new java.awt.Color(0, 0, 0));
        lblEscogerPersonajes.setText("ESCOGER PERSONAJES");
        lblEscogerPersonajes.setPreferredSize(new java.awt.Dimension(240, 32));
        jPanel1.add(lblEscogerPersonajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 250, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgroudp.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPersonaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje1MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("mario")));
        lblPersonaje1.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("mario")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje1MouseClicked

    private void lblPersonaje2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje2MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("luigi")));
        lblPersonaje2.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("luigi")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje2MouseClicked

    private void lblPersonaje3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje3MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("peach")));
        lblPersonaje3.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("peach")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje3MouseClicked

    private void lblPersonaje4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje4MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("toad")));
        lblPersonaje4.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("toad")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje4MouseClicked

    private void lblPersonaje5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje5MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("yoshi")));
        lblPersonaje5.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("yoshi")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje5MouseClicked

    private void lblPersonaje6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje6MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("wario")));
        lblPersonaje6.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("wario")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje6MouseClicked

    private void lblPersonaje7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje7MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("waluigi")));
        lblPersonaje7.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("waluigi")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje7MouseClicked

    private void lblPersonaje8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje8MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("birdo")));
        lblPersonaje8.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("birdo")));
	if (++jugadorActual == sistema.getCantJugadores())
            this.dispose();
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje8MouseClicked

    private void lblPersonaje9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje9MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("bowser")));
        lblPersonaje9.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("bowser")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje9MouseClicked

    private void lblPersonaje10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonaje10MouseClicked
        SistemaDeJuego.aniadirFicha(restantes.get(restantes.indexOf("donkey_kong")));
        lblPersonaje10.setVisible(false);		
	restantes.remove(restantes.get(restantes.indexOf("donkey_kong")));
	if (++jugadorActual == sistema.getCantJugadores()){
            new VentanaEleccion(sistema).setVisible(true);
            this.dispose();
        }
	lblNum.setText(Integer.toString(jugadorActual + 1));
    }//GEN-LAST:event_lblPersonaje10MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEscogerPersonajes;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblPersonaje1;
    private javax.swing.JLabel lblPersonaje10;
    private javax.swing.JLabel lblPersonaje2;
    private javax.swing.JLabel lblPersonaje3;
    private javax.swing.JLabel lblPersonaje4;
    private javax.swing.JLabel lblPersonaje5;
    private javax.swing.JLabel lblPersonaje6;
    private javax.swing.JLabel lblPersonaje7;
    private javax.swing.JLabel lblPersonaje8;
    private javax.swing.JLabel lblPersonaje9;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
}