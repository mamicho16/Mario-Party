/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import juegos.Catch;
import juegos.Gato;
import juegos.GuessWho;
import model.Jugador;
import model.SistemaDeJuego;
import model.Vertice;

/**
 *
 * @author 50672
 */
public class VentanaJuego extends javax.swing.JFrame {
    SistemaDeJuego sistema;
    ArrayList<JLabel> labels; 
    ArrayList<JLabel> lol;
    int jugadorActual = 0;
    /**
     * Creates new form VentanaJuego
     */
    public VentanaJuego(SistemaDeJuego sistema) {
        this.sistema = sistema;
        for (int i = 0; i < sistema.getJugadores().size(); i++) {
            sistema.getJugadores().get(i).num = 0;
        }
        labels = new ArrayList<>();
        lol = new ArrayList<>();
        initComponents();
        
        sistema.getTablero().getGrafo().generarAristas();
        sistema.getTablero().getGrafo().imprimir();
        sistema.crearPosiciones();
        generateLbl(sistema.getTablero().getGrafo().getMax());
        desbloquearCasillas();
        for (int i = 0; i < sistema.getCantJugadores(); i++) {
            lol.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(i).returnImage())));
            sistema.getJugadores().get(i).visitar(sistema.getTablero().getGrafo().vertices[0]);
        }
        caminos(0);
        visitados(0);
        sistema.asignarCasillas();
        btnJugarCasilla.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCaminos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listVisitados = new javax.swing.JList<>();
        btnGirarDado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        btnJugarCasilla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        pnlPrincipal.setBackground(new java.awt.Color(51, 153, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1366, 768));

        listCaminos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCaminos);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Turno del jugador #");

        lblNum.setForeground(new java.awt.Color(0, 0, 0));
        lblNum.setText("1");

        listVisitados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listVisitados);

        btnGirarDado.setText("Girar dado");
        btnGirarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirarDadoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Visitados");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Caminos");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad de espacios disponibles:");

        lblNum1.setForeground(new java.awt.Color(0, 0, 0));
        lblNum1.setText("0");

        btnJugarCasilla.setText("Jugar casilla");
        btnJugarCasilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarCasillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(849, 849, 849)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(lblNum))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGap(815, 815, 815)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(btnGirarDado)
                                .addGap(18, 18, 18)
                                .addComponent(btnJugarCasilla)
                                .addGap(73, 73, 73)))))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(283, 283, 283))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGirarDado)
                            .addComponent(btnJugarCasilla))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNum1))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(390, 390, 390))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1426, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirarDadoActionPerformed
        if(sistema.getJugadores().get(jugadorActual).castigo != 0){
            JOptionPane.showMessageDialog(this, "El jugador tiene castigo", "Castigo", 0);
            sistema.getJugadores().get(jugadorActual).castigo--; 
            cambiarTurno();
            btnGirarDado.setEnabled(true);
            return;
        }
        
        else if(sistema.getJugadores().get(jugadorActual).ganoJuego == false && sistema.returnVertice(sistema.getJugadores().get(jugadorActual)) > 8 && sistema.returnVertice(sistema.getJugadores().get(jugadorActual)) < sistema.getTablero().getGrafo().getMax()){
            jugarCasillaActual(sistema.returnVertice(sistema.getJugadores().get(jugadorActual)));
            cambiarTurno();
            return;
        }
        
        else{
            sistema.getJugadores().get(jugadorActual).ganoJuego = false;
            Random random = new Random();
            int cont = 0;
            int dado1 = random.nextInt(6)+1;
            if(dado1 == 6){
                cont++;
            }
            int dado2 = random.nextInt(6)+1;
            if(dado2 == 6){
                cont++;
            }
            int dado3 = random.nextInt(6)+1;
            if(dado3 == 6){
                cont++;
            }
            if(cont == 2){
                JOptionPane.showMessageDialog(this, "En los dados saco 2 castigos, pierde el turno", "Castigo", 0);
                cambiarTurno();
                return;
            }
            else if(cont == 3){
                sistema.getJugadores().get(jugadorActual).anadirCastigo(1);
                JOptionPane.showMessageDialog(this, "En los dados saco 3 castigos, pierde el turno y el siguiente", "Castigos", 0);
                cambiarTurno();
                return;
            }
            else{
                sistema.getJugadores().get(jugadorActual).sumarEspacios(dado1+dado2+dado3);
                lblNum1.setText(sistema.getJugadores().get(jugadorActual).num + "");
                JOptionPane.showMessageDialog(this, "Ha obtenido " + (dado1+dado2+dado3) + " en los dados", "Dados", 1);
                
            }
        }
        btnGirarDado.setEnabled(false);
        btnJugarCasilla.setEnabled(true);
        generateMouseListener(sistema.returnVertice(sistema.getJugadores().get(jugadorActual)),sistema.getJugadores().get(jugadorActual).num);
    }//GEN-LAST:event_btnGirarDadoActionPerformed

    private void btnJugarCasillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarCasillaActionPerformed
        int v = sistema.returnVertice(sistema.getJugadores().get(jugadorActual));
        if(sistema.getTablero().getGrafo().vertices[v].usado == false){
            jugarCasillaActual(sistema.returnVertice(sistema.getJugadores().get(jugadorActual)));
        }
        btnJugarCasilla.setEnabled(false);
        cambiarTurno();
        
    }//GEN-LAST:event_btnJugarCasillaActionPerformed

    /**
     * @param args the command line arguments
     */
    private void generateLbl(int size){
        int x = 0;
        int y = 0;
        for (int i = 0; i < size; i++){
            JLabel label = new JLabel(""+(i+1));
            JPanel panel = new JPanel();
            JLabel label2 = new JLabel();
            JPanel pnlJug = new JPanel();
            pnlPrincipal.add(pnlJug);
            pnlPrincipal.add(panel);
            panel.add(label);
            pnlPrincipal.add(label2);
            label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png")));
            
            if (i%5 == 0){
                x = 1;
                y++;
                label.setForeground(Color.BLACK);
                label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
                label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                label.setLocation(0, 0);
                label.setSize(5, 5);
                label2.setLocation(140*x++, 100*y);
                label2.setSize(50, 50);
                panel.setLocation(120*(x-1), 100*y);
                panel.setSize(20, 20);
                panel.setBackground(Color.WHITE);
                pnlJug.setLocation(60*(x-1), 120*y-(20*(i/5)));
                pnlJug.setSize(80, 50);
                pnlJug.setBackground(Color.WHITE);
                for (int j = 0;j < sistema.getCantJugadores(); j++){
                    JLabel label3 = new JLabel("");
                    pnlJug.add(label3);
                    label3.setLocation(60/sistema.getCantJugadores()*j, 0);
                    label3.setSize(60/sistema.getCantJugadores(), 30);
                    lol.add(label3);
                }
            }
            else{
                label.setForeground(Color.BLACK);
                label.setFont(new java.awt.Font("Segoe UI",0 ,  12)); // NOI18N
                label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                label.setLocation(0, 0);
                label.setSize(10, 10);
                label2.setLocation(140*x++, 100*y);
                label2.setSize(50, 50);
                panel.setLocation(120*(x-1)+(20*(i%5)), 100*y);
                panel.setSize(20, 20);
                panel.setBackground(Color.WHITE);
                pnlJug.setLocation(60*(x-1)+(60*(i%5))+20*(i%5), 120*y-(20*(i/5)));
                pnlJug.setSize(80, 50);
                pnlJug.setBackground(Color.WHITE);
                for (int j = 0;j < sistema.getCantJugadores(); j++){
                    JLabel label3 = new JLabel("");
                    pnlJug.add(label3);
                    label3.setLocation(60/sistema.getCantJugadores()*j, 0);
                    label3.setSize(60/sistema.getCantJugadores(), 30);
                    lol.add(label3);
                }

            }
            labels.add(label2);
            sistema.getTablero().getGrafo().vertices[i].lbl = label2;
        }
    }

    public void generateMouseListener(int v, int cant){
        for (int i = 0; i < labels.size(); i++) {
            MouseListener m1 = new MouseListener(){
                public void mouseClicked(MouseEvent e){
                    JLabel lbl = (JLabel)e.getComponent();
                    int l = labels.indexOf(lbl);
                    if(jugadorActual == 0){
                        int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                        lol.get(posLbl*sistema.getCantJugadores()).setIcon(null);
                        lol.get((l*sistema.getCantJugadores())).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));  
                    }
                    else if(jugadorActual == 1){
                        int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                        lol.get(posLbl*sistema.getCantJugadores()+1).setIcon(null);
                        lol.get((l*sistema.getCantJugadores())+1).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
                    }
                    else if(jugadorActual == 2){
                        int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                        lol.get(posLbl*sistema.getCantJugadores()+2).setIcon(null);
                        lol.get((l*sistema.getCantJugadores())+2).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
                    }
                    else if(jugadorActual == 3){
                        int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                        lol.get(posLbl*sistema.getCantJugadores()+3).setIcon(null);
                        lol.get((l*sistema.getCantJugadores())+3).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
                    }
                    else if(jugadorActual == 4){
                        int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                        lol.get(posLbl*sistema.getCantJugadores()+4).setIcon(null);
                        lol.get((l*sistema.getCantJugadores())+4).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
                    }
                    else{
                        int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                        lol.get(posLbl*sistema.getCantJugadores()+5).setIcon(null);
                        lol.get((l*sistema.getCantJugadores())+5).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage()))); 
                        
                    }
                    sistema.getJugadores().get(jugadorActual).visitar(sistema.getTablero().getGrafo().vertices[l]);
                    sistema.mover(jugadorActual, l);
                    sistema.imprimirPosiciones();
                    labels.get(l).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/" + sistema.getTablero().getGrafo().vertices[l].casilla)));
                    caminos(sistema.returnVertice(sistema.getJugadores().get(jugadorActual)));
                    sistema.getJugadores().get(jugadorActual).num = sistema.getJugadores().get(jugadorActual).num - sistema.getTablero().getGrafo().matriz[v][l];
                    lblNum1.setText(sistema.getJugadores().get(jugadorActual).num+"");
                    visitados(jugadorActual);
                    if(l == (labels.size()-1) && sistema.getJugadores().get(jugadorActual).num == 0){
                        JOptionPane.showMessageDialog(null, "Gano el jugador " + (jugadorActual + 1), "Ganador", 1);
                    }
                    
                }

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
            };
            if(sistema.getTablero().getGrafo().matriz[v][i] != 0 && sistema.getTablero().getGrafo().matriz[v][i] <= cant){
                labels.get(i).addMouseListener(m1);
                if(labels.get(i).getMouseListeners().length != 1)
                    labels.get(i).removeMouseListener(m1);
            }
            else{
                labels.get(i).removeMouseListener(m1);
            }
        }
    }
    public void desbloquearCasillas(){
        JLabel inicio = labels.get(0);
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inicio.jpg")));
        JLabel fin = labels.get(sistema.getTablero().getGrafo().getMax()-1);
        fin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inicio.jpg")));
    }
    
    public void caminos(int v){
        int cont = 0;
        ArrayList<Vertice> aristas = new ArrayList<>();
        ArrayList<String> caminos = new ArrayList<>();
        DefaultListModel<String> lol = new DefaultListModel<>();
        for (int i = 0; i < sistema.getTablero().getGrafo().getMax(); i++) {
            if(sistema.getTablero().getGrafo().matriz[v][i]!=0){
                aristas.add(sistema.getTablero().getGrafo().vertices[i]);
                caminos.add(aristas.get(cont).dato + ". " + sistema.getTablero().getGrafo().matriz[v][i]);
                lol.addElement(caminos.get(cont));
                cont++;
            }
        }
        listCaminos.setModel(lol);
    }
    
    public void visitados(int jug){
        Jugador jugador = sistema.getJugadores().get(jug);
        ArrayList<Integer> visitados = new ArrayList<>();
        DefaultListModel<String> lol = new DefaultListModel<>();
        for (int i = 0; i < jugador.getVisitados().size(); i++) {
            visitados.add(jugador.getVisitados().get(i).dato);
        }
        for (int i = 0; i < jugador.getVisitados().size(); i++) {
            lol.addElement(visitados.get(i).toString());
        }
        listVisitados.setModel(lol);
    }
    
    public void cambiarTurno(){
        if(jugadorActual < sistema.getCantJugadores()-1){
            jugadorActual++;
            lblNum.setText(Integer.toString(jugadorActual+1));
        }
        else{
            jugadorActual = 0;
            lblNum.setText("1");
        }
        lblNum1.setText(sistema.getJugadores().get(jugadorActual).num + "");
        caminos(sistema.returnVertice(sistema.getJugadores().get(jugadorActual)));
        visitados(jugadorActual);
        btnGirarDado.setEnabled(true);
    }
    
    private void jugarCasillaActual(int v){
        Vertice vertice = sistema.getTablero().getGrafo().vertices[v];
        if(vertice.casilla == "gato.png"){
            Random random = new Random();
            int xd = random.nextInt(sistema.getCantJugadores()+1);
            if((xd-1) == jugadorActual){
                while((xd-1) == jugadorActual){
                    xd = random.nextInt(sistema.getCantJugadores()+1);
                }
            }
            JOptionPane.showMessageDialog(this, "Cayo en el juego gato, contra el jugador " + xd+1, "Gato", 1);
            new Gato(jugadorActual+1, xd, sistema).setVisible(true);
        }
        /*else if(vertice.casilla == "memory_path.png"){
            
        }
        else if(vertice.casilla == "bros_memory.png"){
            
        }*/
        else if(vertice.casilla == "catch_cat.png"){
            new Catch(sistema, jugadorActual).setVisible(true);
        }/*
        else if(vertice.casilla == "bombermario.png"){
            
        }*/
        else if(vertice.casilla == "guess_who.png"){
            new GuessWho(sistema, jugadorActual).setVisible(true);
        }/*
        else if(vertice.casilla == "collect_coins.png"){
            
        }
        else if(vertice.casilla == "mario_carts.png"){
            
        }*/
        else if(vertice.casilla == "carcel.png"){
            sistema.getJugadores().get(jugadorActual).anadirCastigo(2);
            JOptionPane.showMessageDialog(this, "Cayo en la carcel, pierde dos turnos", "Carcel", 0);
        }
        else if(vertice.casilla == "tubo.png"){
            JOptionPane.showMessageDialog(this, "Cayo en el tubo 1, sera dirigo al 3", "Tubo", 1);
            int tubo2 = 0;
            for (int i = 0; i < sistema.getTablero().getGrafo().getMax(); i++) {
                if(sistema.getTablero().getGrafo().vertices[i].casilla == "tubo2.png"){
                    tubo2 = i;
                }
            }
            if(jugadorActual == 0){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()).setIcon(null);
                lol.get((tubo2*sistema.getCantJugadores())).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));  
            }
            else if(jugadorActual == 1){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+1).setIcon(null);
                lol.get((tubo2*sistema.getCantJugadores())+1).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
            }
            else if(jugadorActual == 2){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+2).setIcon(null);
                lol.get((tubo2*sistema.getCantJugadores())+2).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
            }
            else if(jugadorActual == 3){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+3).setIcon(null);
                lol.get((tubo2*sistema.getCantJugadores())+3).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));

            }
            else if(jugadorActual == 4){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+4).setIcon(null);
                lol.get((tubo2*sistema.getCantJugadores())+4).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));

            }
            else{
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+5).setIcon(null);
                lol.get((tubo2*sistema.getCantJugadores())+5).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage()))); 
            }
            sistema.mover(jugadorActual, tubo2);
            labels.get(tubo2).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/" + sistema.getTablero().getGrafo().vertices[tubo2].casilla)));
        }
        else if(vertice.casilla == "tubo2.png"){
            JOptionPane.showMessageDialog(this, "Cayo en el tubo 2, sera dirigo al 3", "Tubo", 1);
            int tubo3 = 0;
            for (int i = 0; i < sistema.getTablero().getGrafo().getMax(); i++) {
                if(sistema.getTablero().getGrafo().vertices[i].casilla == "tubo3.png"){
                    tubo3 = i;
                }
            }
            if(jugadorActual == 0){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()).setIcon(null);
                lol.get((tubo3*sistema.getCantJugadores())).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));  
            }
            else if(jugadorActual == 1){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+1).setIcon(null);
                lol.get((tubo3*sistema.getCantJugadores())+1).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
            }
            else if(jugadorActual == 2){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+2).setIcon(null);
                lol.get((tubo3*sistema.getCantJugadores())+2).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
            }
            else if(jugadorActual == 3){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+3).setIcon(null);
                lol.get((tubo3*sistema.getCantJugadores())+3).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));

            }
            else if(jugadorActual == 4){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+4).setIcon(null);
                lol.get((tubo3*sistema.getCantJugadores())+4).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));

            }
            else{
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+5).setIcon(null);
                lol.get((tubo3*sistema.getCantJugadores())+5).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage()))); 
            }
            sistema.mover(jugadorActual, tubo3);
            labels.get(tubo3).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/" + sistema.getTablero().getGrafo().vertices[tubo3].casilla)));
            
        }
        else if(vertice.casilla == "tubo3.png"){
            JOptionPane.showMessageDialog(this, "Cayo en el tubo 3, sera dirigo al 1", "Tubo", 1);
            int tubo = 0;
            for (int i = 0; i < sistema.getTablero().getGrafo().getMax(); i++) {
                if(sistema.getTablero().getGrafo().vertices[i].casilla == "tubo.png"){
                    tubo = i;
                }
            }
            if(jugadorActual == 0){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()).setIcon(null);
                lol.get((tubo*sistema.getCantJugadores())).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));  
            }
            else if(jugadorActual == 1){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+1).setIcon(null);
                lol.get((tubo*sistema.getCantJugadores())+1).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
                        
            }
            else if(jugadorActual == 2){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+2).setIcon(null);
                lol.get((tubo*sistema.getCantJugadores())+2).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));
            }
            else if(jugadorActual == 3){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+3).setIcon(null);
                lol.get((tubo*sistema.getCantJugadores())+3).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));

            }
            else if(jugadorActual == 4){
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+4).setIcon(null);
                lol.get((tubo*sistema.getCantJugadores())+4).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage())));

            }
            else{
                int posLbl = sistema.eliminarPosicionAnt(jugadorActual);
                lol.get(posLbl*sistema.getCantJugadores()+5).setIcon(null);
                lol.get((tubo*sistema.getCantJugadores())+5).setIcon(new javax.swing.ImageIcon(getClass().getResource(sistema.getJugadores().get(jugadorActual).returnImage()))); 
            }
            sistema.mover(jugadorActual, tubo);
            labels.get(tubo).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/" + sistema.getTablero().getGrafo().vertices[tubo].casilla)));
            
        }
        else if(vertice.casilla == "estrella.png"){
            btnGirarDado.setEnabled(true);
            vertice.usado = true;
            JOptionPane.showMessageDialog(this, "Puede volver a tirar los dados", "Estrella", 1);
            for (int i = 0; i < sistema.getCantJugadores()-1; i++) {
                cambiarTurno();
            }
        }
        else if(vertice.casilla == "fire_flower.png"){
            JOptionPane.showMessageDialog(this, "Elija al jugador al cual quiera reiniciar su juego", "Flor de hielo", 1);
            new VentanaFlorFuego(this, sistema, v, jugadorActual,lol).setVisible(true);
            vertice.usado = true;
        }
        else if(vertice.casilla == "ice_flower.png"){
            JOptionPane.showMessageDialog(this, "Elija al jugador al cual quiere quitarle los siguientes dos turnos", "Flor de hielo", 1);
            new VentanaFlorHielo(sistema, v, jugadorActual).setVisible(true);
            vertice.usado = true;
        }
        else if(vertice.casilla == "cola.png"){
            JOptionPane.showMessageDialog(this, "Casilla especial no implementada aun", "Error", 0);
        }
        else if(vertice.casilla == "inicio.jpg"){
            JOptionPane.showMessageDialog(this, "La casilla es inicio o final", "Error", 0);
        }
        else{
            JOptionPane.showMessageDialog(this, "Juego no implementado aun", "Error", 0);
            sistema.getJugadores().get(jugadorActual).ganoJuego = true;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGirarDado;
    private javax.swing.JButton btnJugarCasilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JList<String> listCaminos;
    private javax.swing.JList<String> listVisitados;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
