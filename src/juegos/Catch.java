/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package juegos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.SistemaDeJuego;

/**
 *
 * @author 50672
 */
public class Catch extends javax.swing.JFrame {
    SistemaDeJuego sistema;
    int j;
    JPanel contentPane;
    private int[][] gameMatrix = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    Icon icon = new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/catch_cat.png");
    /** Creates new form Catch */
    ArrayList<JButton>botones;
    public Catch(SistemaDeJuego sistema, int j) {
        this.sistema = sistema;
        this.j = j;
        initComponents();
        gameMatrix[5][5]=2;
        botones= new ArrayList<JButton>();
        botones.add(jButton1);botones.add(jButton2);botones.add(jButton3);botones.add(jButton4);botones.add(jButton5);
        botones.add(jButton6);botones.add(jButton7);botones.add(jButton8);botones.add(jButton9);botones.add(jButton10);
        botones.add(jButton11);botones.add(jButton12);botones.add(jButton13);botones.add(jButton14);botones.add(jButton15);
        botones.add(jButton16);botones.add(jButton17);botones.add(jButton18);botones.add(jButton19);botones.add(jButton20);
        botones.add(jButton21);botones.add(jButton22);botones.add(jButton23);botones.add(jButton24);botones.add(jButton25);
        botones.add(jButton26);botones.add(jButton27);botones.add(jButton28);botones.add(jButton29);botones.add(jButton30);
        botones.add(jButton31);botones.add(jButton32);botones.add(jButton33);botones.add(jButton34);botones.add(jButton35);
        botones.add(jButton36);botones.add(jButton37);botones.add(jButton38);botones.add(jButton39);botones.add(jButton40);
        botones.add(jButton41);botones.add(jButton42);botones.add(jButton43);botones.add(jButton44);botones.add(jButton45);
        botones.add(jButton46);botones.add(jButton47);botones.add(jButton48);botones.add(jButton49);botones.add(jButton50);
        botones.add(jButton51);botones.add(jButton52);botones.add(jButton53);botones.add(jButton54);botones.add(jButton55);
        botones.add(jButton56);botones.add(jButton57);botones.add(jButton58);botones.add(jButton59);botones.add(jButton60);
        botones.add(jButton61);botones.add(jButton62);botones.add(jButton63);botones.add(jButton64);botones.add(jButton65);
        botones.add(jButton66);botones.add(jButton67);botones.add(jButton68);botones.add(jButton69);botones.add(jButton70);
        botones.add(jButton71);botones.add(jButton72);botones.add(jButton73);botones.add(jButton74);botones.add(jButton75);
        botones.add(jButton76);botones.add(jButton77);botones.add(jButton78);botones.add(jButton79);botones.add(jButton80);
        botones.add(jButton81);botones.add(jButton82);botones.add(jButton83);botones.add(jButton84);botones.add(jButton85);
        botones.add(jButton86);botones.add(jButton87);botones.add(jButton88);botones.add(jButton89);botones.add(jButton90);
        botones.add(jButton91);botones.add(jButton92);botones.add(jButton93);botones.add(jButton94);botones.add(jButton95);
        botones.add(jButton96);botones.add(jButton97);botones.add(jButton98);botones.add(jButton99);botones.add(jButton100);
        botones.add(jButton101);botones.add(jButton102);botones.add(jButton103);botones.add(jButton104);botones.add(jButton105);
        botones.add(jButton106);botones.add(jButton107);botones.add(jButton108);botones.add(jButton109);botones.add(jButton110);
        botones.add(jButton111);botones.add(jButton112);botones.add(jButton113);botones.add(jButton114);botones.add(jButton115);
        botones.add(jButton116);botones.add(jButton117);botones.add(jButton118);botones.add(jButton119);botones.add(jButton120);
        botones.add(jButton121);
        botones.get(60).setIcon(icon);
        
        
    }
    public int getPosicionX(){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(gameMatrix[i][j]==2)
                    return i;
            }
            
        }
      return 0;
    }
    public int getPosicionY(){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(gameMatrix[i][j]==2)
                    return j;
            }
            
        }
      return 0;
    }
    public void imprimir(){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(gameMatrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
            
    public void mover(){
        imprimir();
        int x= getPosicionX();
        int y=getPosicionY();
        System.out.println(x);
        System.out.println(y);
        int x2=0;
        int y2=0;
        
        if(gameMatrix[x+1][y]==0){
            gameMatrix[x][y]=0;
            gameMatrix[x+1][y]=2;
            x2=(x+1)*11;
            y2=y;
            
        }
        else if(gameMatrix[x-1][y]==0){
            gameMatrix[x][y]=0;
            gameMatrix[x-1][y]=2;
            x2=(x-1)*11;
            y2=y;
        }
        else if(gameMatrix[x][y+1]==0){
            gameMatrix[x][y+1]=2;
            gameMatrix[x][y]=0;
            x2=(x)*11;
            y2=y+1;
        }
        else if(gameMatrix[x][y-1]==0){
            gameMatrix[x][y-1]=2;
            gameMatrix[x][y]=0;
            x2=(x)*11;
            y2=y-1;
        }
        else if(gameMatrix[x+1][y+1]==0){
            gameMatrix[x][y]=0;
            gameMatrix[x+1][y+1]=2;
            x2=(x+1)*11;
            y2=y+1;
        }
        else if(gameMatrix[x-1][y+1]==0){
            gameMatrix[x][y]=0;
            gameMatrix[x-1][y+1]=2;
            x2=(x-1)*11;
            y2=y+1;
        }
        else if(gameMatrix[x-1][y-1]==0){
            gameMatrix[x][y]=0;
            gameMatrix[x-1][y-1]=2;
            x2=(x-1)*11;
            y2=y-1;
        }
        else if(gameMatrix[x+1][y-1]==0){
            gameMatrix[x][y]=0;
            gameMatrix[x+1][y-1]=2;
            x2=(x+1)*11;
            y2=y-1;
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Ha ganado, ha capturado al gato");
            sistema.getJugadores().get(j).ganoJuego = true;
            this.dispose();
        }
        
        
        botones.get((x)*11+y).setIcon(null);
        botones.get(x2+y2).setIcon(icon);
        if(gameMatrix[0][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][1]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][2]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][3]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][4]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][5]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][6]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][7]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][8]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][9]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[0][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][1]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][2]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][3]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][4]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][5]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][6]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][7]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][8]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][9]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[10][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[1][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[2][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[3][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[4][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[5][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[6][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[7][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[8][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[9][0]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[1][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[2][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[3][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[4][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[5][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[6][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[7][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[8][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        else if(gameMatrix[9][10]==2){
            JOptionPane.showMessageDialog(null, "Ha perdido, ha escapado el gato");
            this.dispose();
        }
        
    }
    
 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 153, 255));
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 153, 255));
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 153, 255));
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(102, 153, 255));
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 153, 255));
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 153, 255));
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(102, 153, 255));
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(102, 153, 255));
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(102, 153, 255));
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(102, 153, 255));
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 153, 255));
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(102, 153, 255));
        jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(102, 153, 255));
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(102, 153, 255));
        jButton20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(102, 153, 255));
        jButton21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton21.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(102, 153, 255));
        jButton22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(102, 153, 255));
        jButton23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton23.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(102, 153, 255));
        jButton24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton24.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(102, 153, 255));
        jButton25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(102, 153, 255));
        jButton26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(102, 153, 255));
        jButton27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(102, 153, 255));
        jButton28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(102, 153, 255));
        jButton29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(102, 153, 255));
        jButton30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(102, 153, 255));
        jButton31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(102, 153, 255));
        jButton32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(102, 153, 255));
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(102, 153, 255));
        jButton34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed1(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(102, 153, 255));
        jButton35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(102, 153, 255));
        jButton36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton36.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(102, 153, 255));
        jButton37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton37.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(102, 153, 255));
        jButton38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton38.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(102, 153, 255));
        jButton39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton39.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(102, 153, 255));
        jButton40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton40.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(102, 153, 255));
        jButton41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton41.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(102, 153, 255));
        jButton42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton42.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(102, 153, 255));
        jButton43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton43.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(102, 153, 255));
        jButton44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton44.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(102, 153, 255));
        jButton45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton45.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(102, 153, 255));
        jButton46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton46.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(102, 153, 255));
        jButton47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton47.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(102, 153, 255));
        jButton48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton48.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setBackground(new java.awt.Color(102, 153, 255));
        jButton49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton49.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setBackground(new java.awt.Color(102, 153, 255));
        jButton50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton50.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(102, 153, 255));
        jButton51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton51.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setBackground(new java.awt.Color(102, 153, 255));
        jButton52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton52.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(102, 153, 255));
        jButton53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton53.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setBackground(new java.awt.Color(102, 153, 255));
        jButton54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton54.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(102, 153, 255));
        jButton55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton55.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(102, 153, 255));
        jButton56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton56.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(102, 153, 255));
        jButton57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton57.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(102, 153, 255));
        jButton58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton58.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(102, 153, 255));
        jButton59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton59.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.setBackground(new java.awt.Color(102, 153, 255));
        jButton60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton60.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(102, 153, 255));
        jButton61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton61.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(102, 153, 255));
        jButton62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton62.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(102, 153, 255));
        jButton63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton63.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(102, 153, 255));
        jButton64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton64.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(102, 153, 255));
        jButton65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton65.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setBackground(new java.awt.Color(102, 153, 255));
        jButton66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton66.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setBackground(new java.awt.Color(102, 153, 255));
        jButton67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton67.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(102, 153, 255));
        jButton68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton68.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(102, 153, 255));
        jButton69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton69.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setBackground(new java.awt.Color(102, 153, 255));
        jButton70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton70.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(102, 153, 255));
        jButton71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton71.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.setBackground(new java.awt.Color(102, 153, 255));
        jButton72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton72.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(102, 153, 255));
        jButton73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton73.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(102, 153, 255));
        jButton74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton74.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(102, 153, 255));
        jButton75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton75.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(102, 153, 255));
        jButton76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton76.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(102, 153, 255));
        jButton77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton77.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setBackground(new java.awt.Color(102, 153, 255));
        jButton78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton78.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed1(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(102, 153, 255));
        jButton79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton79.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.setBackground(new java.awt.Color(102, 153, 255));
        jButton80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton80.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.setBackground(new java.awt.Color(102, 153, 255));
        jButton81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton81.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton82.setBackground(new java.awt.Color(102, 153, 255));
        jButton82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton82.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(102, 153, 255));
        jButton83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton83.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton84.setBackground(new java.awt.Color(102, 153, 255));
        jButton84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton84.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(102, 153, 255));
        jButton85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton85.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(102, 153, 255));
        jButton86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton86.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        jButton87.setBackground(new java.awt.Color(102, 153, 255));
        jButton87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton87.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton88.setBackground(new java.awt.Color(102, 153, 255));
        jButton88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton88.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(102, 153, 255));
        jButton89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton89.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(102, 153, 255));
        jButton90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton90.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton91.setBackground(new java.awt.Color(102, 153, 255));
        jButton91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton91.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton92.setBackground(new java.awt.Color(102, 153, 255));
        jButton92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton92.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(102, 153, 255));
        jButton93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton93.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jButton94.setBackground(new java.awt.Color(102, 153, 255));
        jButton94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton94.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jButton95.setBackground(new java.awt.Color(102, 153, 255));
        jButton95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton95.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });

        jButton96.setBackground(new java.awt.Color(102, 153, 255));
        jButton96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton96.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.setBackground(new java.awt.Color(102, 153, 255));
        jButton97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton97.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton98.setBackground(new java.awt.Color(102, 153, 255));
        jButton98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton98.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        jButton99.setBackground(new java.awt.Color(102, 153, 255));
        jButton99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton99.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });

        jButton100.setBackground(new java.awt.Color(102, 153, 255));
        jButton100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton100.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton101.setBackground(new java.awt.Color(102, 153, 255));
        jButton101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton101.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton102.setBackground(new java.awt.Color(102, 153, 255));
        jButton102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton102.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jButton103.setBackground(new java.awt.Color(102, 153, 255));
        jButton103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton103.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        jButton104.setBackground(new java.awt.Color(102, 153, 255));
        jButton104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton104.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jButton105.setBackground(new java.awt.Color(102, 153, 255));
        jButton105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton105.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });

        jButton106.setBackground(new java.awt.Color(102, 153, 255));
        jButton106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton106.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.setBackground(new java.awt.Color(102, 153, 255));
        jButton107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton107.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jButton108.setBackground(new java.awt.Color(102, 153, 255));
        jButton108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton108.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jButton109.setBackground(new java.awt.Color(102, 153, 255));
        jButton109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton109.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        jButton110.setBackground(new java.awt.Color(102, 153, 255));
        jButton110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton110.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jButton111.setBackground(new java.awt.Color(102, 153, 255));
        jButton111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton111.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed1(evt);
            }
        });

        jButton112.setBackground(new java.awt.Color(102, 153, 255));
        jButton112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton112.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setBackground(new java.awt.Color(102, 153, 255));
        jButton113.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton113.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });

        jButton114.setBackground(new java.awt.Color(102, 153, 255));
        jButton114.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton114.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });

        jButton115.setBackground(new java.awt.Color(102, 153, 255));
        jButton115.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton115.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });

        jButton116.setBackground(new java.awt.Color(102, 153, 255));
        jButton116.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton116.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });

        jButton117.setBackground(new java.awt.Color(102, 153, 255));
        jButton117.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton117.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });

        jButton118.setBackground(new java.awt.Color(102, 153, 255));
        jButton118.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton118.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });

        jButton119.setBackground(new java.awt.Color(102, 153, 255));
        jButton119.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton119.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });

        jButton120.setBackground(new java.awt.Color(102, 153, 255));
        jButton120.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton120.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });

        jButton121.setBackground(new java.awt.Color(102, 153, 255));
        jButton121.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton121.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton121ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setBackground(new Color(0,153,51));
        jButton1.setEnabled(false);
        gameMatrix[0][0]=1; mover();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setBackground(new Color(0,153,51));
        jButton2.setEnabled(false);
        gameMatrix[0][1]=1; mover();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setBackground(new Color(0,153,51));
        jButton3.setEnabled(false);
        gameMatrix[0][2]=1; mover();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setBackground(new Color(0,153,51));
        jButton4.setEnabled(false);
        gameMatrix[0][3]=1; mover();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setBackground(new Color(0,153,51));
        jButton5.setEnabled(false);
        gameMatrix[0][4]=1; mover();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setBackground(new Color(0,153,51));
        jButton6.setEnabled(false);
        gameMatrix[0][5]=1; mover();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setBackground(new Color(0,153,51));
        jButton7.setEnabled(false);
        gameMatrix[0][6]=1; mover();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setBackground(new Color(0,153,51));
        jButton8.setEnabled(false);
        gameMatrix[0][7]=1; mover();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setBackground(new Color(0,153,51));
        jButton9.setEnabled(false);
        gameMatrix[0][8]=1; mover();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setBackground(new Color(0,153,51));
        jButton10.setEnabled(false);
        gameMatrix[0][9]=1; mover();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setBackground(new Color(0,153,51));
        jButton11.setEnabled(false);
        gameMatrix[0][10]=1; mover();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setBackground(new Color(0,153,51));
        jButton12.setEnabled(false);
        gameMatrix[1][0]=1; mover();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setBackground(new Color(0,153,51));
        jButton13.setEnabled(false);
        gameMatrix[1][1]=1; mover();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setBackground(new Color(0,153,51));
        jButton14.setEnabled(false);
        gameMatrix[1][2]=1; mover();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setBackground(new Color(0,153,51));
        jButton15.setEnabled(false);
        gameMatrix[1][3]=1; mover();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       jButton16.setBackground(new Color(0,153,51));
        jButton16.setEnabled(false);
        gameMatrix[1][4]=1; mover();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton17.setBackground(new Color(0,153,51));
        jButton17.setEnabled(false);
        gameMatrix[1][5]=1; mover();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setBackground(new Color(0,153,51));
        jButton18.setEnabled(false);
        gameMatrix[1][6]=1; mover();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton19.setBackground(new Color(0,153,51));
        jButton19.setEnabled(false);
        gameMatrix[1][7]=1; mover();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setBackground(new Color(0,153,51));
        jButton20.setEnabled(false);
        gameMatrix[1][8]=1; mover();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton21.setBackground(new Color(0,153,51));
        jButton21.setEnabled(false);
        gameMatrix[1][9]=1; mover();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton22.setBackground(new Color(0,153,51));
        jButton22.setEnabled(false);
        gameMatrix[1][10]=1; mover();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jButton23.setBackground(new Color(0,153,51));
        jButton23.setEnabled(false);
        gameMatrix[2][0]=1; mover();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton24.setBackground(new Color(0,153,51));
        jButton24.setEnabled(false);
        gameMatrix[2][1]=1; mover();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jButton25.setBackground(new Color(0,153,51));
        jButton25.setEnabled(false);
        gameMatrix[2][2]=1; mover();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton26.setBackground(new Color(0,153,51));
        jButton26.setEnabled(false);
        gameMatrix[2][3]=1; mover();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jButton27.setBackground(new Color(0,153,51));
        jButton27.setEnabled(false);
        gameMatrix[2][4]=1; mover();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jButton28.setBackground(new Color(0,153,51));
        jButton28.setEnabled(false);
        gameMatrix[2][5]=1; mover();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jButton29.setBackground(new Color(0,153,51));
        jButton29.setEnabled(false);
        gameMatrix[2][6]=1; mover();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jButton30.setBackground(new Color(0,153,51));
        jButton30.setEnabled(false);
        gameMatrix[2][7]=1; mover();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jButton31.setBackground(new Color(0,153,51));
        jButton31.setEnabled(false);
        gameMatrix[2][8]=1; mover();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jButton32.setBackground(new Color(0,153,51));
        jButton32.setEnabled(false);
        gameMatrix[2][9]=1; mover();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jButton33.setBackground(new Color(0,153,51));
        jButton33.setEnabled(false);
        gameMatrix[2][10]=1; mover();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed1
        jButton34.setBackground(new Color(0,153,51));
        jButton34.setEnabled(false);
        gameMatrix[3][0]=1; mover();
    }//GEN-LAST:event_jButton34ActionPerformed1

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jButton35.setBackground(new Color(0,153,51));
        jButton35.setEnabled(false);
        gameMatrix[3][1]=1; mover();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
       jButton36.setBackground(new Color(0,153,51));
        jButton36.setEnabled(false);
        gameMatrix[3][2]=1; mover();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jButton40.setBackground(new Color(0,153,51));
        jButton40.setEnabled(false);
        gameMatrix[3][6]=1; mover();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        jButton41.setBackground(new Color(0,153,51));
        jButton41.setEnabled(false);
        gameMatrix[3][7]=1; mover();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        jButton45.setBackground(new Color(0,153,51));
        jButton45.setEnabled(false);
        gameMatrix[4][0]=1; mover();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jButton46.setBackground(new Color(0,153,51));
        jButton46.setEnabled(false);
        gameMatrix[4][1]=1; mover();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        jButton47.setBackground(new Color(0,153,51));
        jButton47.setEnabled(false);
        gameMatrix[4][2]=1; mover();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        jButton48.setBackground(new Color(0,153,51));
        jButton48.setEnabled(false);
        gameMatrix[4][3]=1; mover();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        jButton49.setBackground(new Color(0,153,51));
        jButton49.setEnabled(false);
        gameMatrix[4][4]=1; mover();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        jButton50.setBackground(new Color(0,153,51));
        jButton50.setEnabled(false);
        gameMatrix[4][5]=1; mover();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        jButton51.setBackground(new Color(0,153,51));
        jButton51.setEnabled(false);
        gameMatrix[4][6]=1; mover();
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        jButton52.setBackground(new Color(0,153,51));
        jButton52.setEnabled(false);
        gameMatrix[4][7]=1; mover();
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        jButton53.setBackground(new Color(0,153,51));
        jButton53.setEnabled(false);
        gameMatrix[4][8]=1; mover();
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        jButton54.setBackground(new Color(0,153,51));
        jButton54.setEnabled(false);
        gameMatrix[4][9]=1; mover();
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        jButton55.setBackground(new Color(0,153,51));
        jButton55.setEnabled(false);
        gameMatrix[4][10]=1; mover();
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        jButton56.setBackground(new Color(0,153,51));
        jButton56.setEnabled(false);
        gameMatrix[5][0]=1; mover();
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        jButton57.setBackground(new Color(0,153,51));
        jButton57.setEnabled(false);
        gameMatrix[5][1]=1; mover();
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        jButton58.setBackground(new Color(0,153,51));
        jButton58.setEnabled(false);
        gameMatrix[5][2]=1; mover();
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        jButton59.setBackground(new Color(0,153,51));
        jButton59.setEnabled(false);
        gameMatrix[5][3]=1; mover();
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        jButton60.setBackground(new Color(0,153,51));
        jButton60.setEnabled(false);
        gameMatrix[5][4]=1; mover();
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        jButton61.setBackground(new Color(0,153,51));
        jButton61.setEnabled(false);
        gameMatrix[5][5]=1; mover();
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        jButton62.setBackground(new Color(0,153,51));
        jButton62.setEnabled(false);
        gameMatrix[5][6]=1; mover();
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        jButton63.setBackground(new Color(0,153,51));
        jButton63.setEnabled(false);
        gameMatrix[5][7]=1; mover();
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        jButton64.setBackground(new Color(0,153,51));
        jButton64.setEnabled(false);
        gameMatrix[5][8]=1; mover();
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        jButton65.setBackground(new Color(0,153,51));
        jButton65.setEnabled(false);
        gameMatrix[5][9]=1; mover();
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        jButton66.setBackground(new Color(0,153,51));
        jButton56.setEnabled(false);
        gameMatrix[5][10]=1; mover();
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        jButton67.setBackground(new Color(0,153,51));
        jButton67.setEnabled(false);
        gameMatrix[6][0]=1; mover();
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        jButton68.setBackground(new Color(0,153,51));
        jButton68.setEnabled(false);
        gameMatrix[6][1]=1; mover();
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        jButton69.setBackground(new Color(0,153,51));
        jButton69.setEnabled(false);
        gameMatrix[6][2]=1; mover();
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        jButton70.setBackground(new Color(0,153,51));
        jButton70.setEnabled(false);
        gameMatrix[6][3]=1; mover();
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        jButton71.setBackground(new Color(0,153,51));
        jButton71.setEnabled(false);
        gameMatrix[6][4]=1; mover();
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        jButton72.setBackground(new Color(0,153,51));
        jButton72.setEnabled(false);
        gameMatrix[6][5]=1; mover();
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        jButton73.setBackground(new Color(0,153,51));
        jButton73.setEnabled(false);
        gameMatrix[6][6]=1; mover();
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        jButton74.setBackground(new Color(0,153,51));
        jButton74.setEnabled(false);
        gameMatrix[6][7]=1; mover();
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        jButton75.setBackground(new Color(0,153,51));
        jButton75.setEnabled(false);
        gameMatrix[6][8]=1; mover();
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        jButton76.setBackground(new Color(0,153,51));
        jButton76.setEnabled(false);
        gameMatrix[6][9]=1; mover();
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        jButton77.setBackground(new Color(0,153,51));
        jButton77.setEnabled(false);
        gameMatrix[6][10]=1; mover();
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed1
        jButton78.setBackground(new Color(0,153,51));
        jButton78.setEnabled(false);
        gameMatrix[7][0]=1; mover();
    }//GEN-LAST:event_jButton78ActionPerformed1

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        jButton79.setBackground(new Color(0,153,51));
        jButton79.setEnabled(false);
        gameMatrix[7][1]=1; mover();
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        jButton80.setBackground(new Color(0,153,51));
        jButton80.setEnabled(false);
        gameMatrix[7][2]=1; mover();
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        jButton84.setBackground(new Color(0,153,51));
        jButton84.setEnabled(false);
        gameMatrix[7][6]=1; mover();
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        jButton85.setBackground(new Color(0,153,51));
        jButton85.setEnabled(false);
        gameMatrix[7][7]=1; mover();
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        jButton89.setBackground(new Color(0,153,51));
        jButton89.setEnabled(false);
        gameMatrix[8][0]=1; mover();
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        jButton90.setBackground(new Color(0,153,51));
        jButton90.setEnabled(false);
        gameMatrix[8][1]=1; mover();
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        jButton91.setBackground(new Color(0,153,51));
        jButton91.setEnabled(false);
        gameMatrix[8][2]=1; mover();
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        jButton92.setBackground(new Color(0,153,51));
        jButton92.setEnabled(false);
        gameMatrix[8][3]=1; mover();
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        jButton93.setBackground(new Color(0,153,51));
        jButton93.setEnabled(false);
        gameMatrix[8][4]=1; mover();
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        jButton94.setBackground(new Color(0,153,51));
        jButton94.setEnabled(false);
        gameMatrix[8][5]=1; mover();
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        jButton95.setBackground(new Color(0,153,51));
        jButton95.setEnabled(false);
        gameMatrix[8][6]=1; mover();
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        jButton96.setBackground(new Color(0,153,51));
        jButton96.setEnabled(false);
        gameMatrix[8][7]=1; mover();
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        jButton97.setBackground(new Color(0,153,51));
        jButton97.setEnabled(false);
        gameMatrix[8][8]=1; mover();
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        jButton98.setBackground(new Color(0,153,51));
        jButton98.setEnabled(false);
        gameMatrix[8][9]=1; mover();
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        jButton99.setBackground(new Color(0,153,51));
        jButton99.setEnabled(false);
        gameMatrix[8][10]=1; mover();
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        jButton100.setBackground(new Color(0,153,51));
        jButton100.setEnabled(false);
        gameMatrix[9][0]=1; mover();
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        jButton101.setBackground(new Color(0,153,51));
        jButton101.setEnabled(false);
        gameMatrix[9][1]=1; mover();
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        jButton102.setBackground(new Color(0,153,51));
        jButton102.setEnabled(false);
        gameMatrix[9][2]=1; mover();
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        jButton103.setBackground(new Color(0,153,51));
        jButton103.setEnabled(false);
        gameMatrix[9][3]=1; mover();
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        jButton104.setBackground(new Color(0,153,51));
        jButton104.setEnabled(false);
        gameMatrix[9][4]=1; mover();
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        jButton105.setBackground(new Color(0,153,51));
        jButton105.setEnabled(false);
        gameMatrix[9][5]=1; mover();
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        jButton106.setBackground(new Color(0,153,51));
        jButton106.setEnabled(false);
        gameMatrix[9][6]=1; mover();
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        jButton107.setBackground(new Color(0,153,51));
        jButton107.setEnabled(false);
        gameMatrix[9][7]=1; mover();
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
        jButton108.setBackground(new Color(0,153,51));
        jButton108.setEnabled(false);
        gameMatrix[9][8]=1; mover();
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        jButton109.setBackground(new Color(0,153,51));
        jButton109.setEnabled(false);
        gameMatrix[9][9]=1; mover();
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        jButton110.setBackground(new Color(0,153,51));
        jButton110.setEnabled(false);
        gameMatrix[9][10]=1; mover();
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton111ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed1
        jButton110.setBackground(new Color(0,153,51));
        jButton110.setEnabled(false);
        gameMatrix[10][0]=1; mover();
    }//GEN-LAST:event_jButton111ActionPerformed1

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        jButton110.setBackground(new Color(0,153,51));
        jButton110.setEnabled(false);
        gameMatrix[10][1]=1; mover();
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
        jButton110.setBackground(new Color(0,153,51));
        jButton110.setEnabled(false);
        gameMatrix[10][2]=1; mover();
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
        jButton110.setBackground(new Color(0,153,51));
        jButton110.setEnabled(false);
        gameMatrix[10][6]=1; mover();
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        jButton110.setBackground(new Color(0,153,51));
        jButton110.setEnabled(false);
        gameMatrix[10][7]=1; mover();
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jButton38.setBackground(new Color(0,153,51));
        jButton38.setEnabled(false);
        gameMatrix[3][4]=1; mover();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        jButton37.setBackground(new Color(0,153,51));
        jButton37.setEnabled(false);
        gameMatrix[3][3]=1; mover();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jButton39.setBackground(new Color(0,153,51));
        jButton39.setEnabled(false);
        gameMatrix[3][5]=1; mover();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        jButton42.setBackground(new Color(0,153,51));
        jButton42.setEnabled(false);
        gameMatrix[3][8]=1; mover();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        jButton43.setBackground(new Color(0,153,51));
        jButton43.setEnabled(false);
        gameMatrix[3][9]=1; mover();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        jButton44.setBackground(new Color(0,153,51));
        jButton44.setEnabled(false);
        gameMatrix[3][10]=1; mover();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        jButton82.setBackground(new Color(0,153,51));
        jButton82.setEnabled(false);
        gameMatrix[7][4]=1; mover();
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        jButton83.setBackground(new Color(0,153,51));
        jButton83.setEnabled(false);
        gameMatrix[7][5]=1; mover();
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        jButton86.setBackground(new Color(0,153,51));
        jButton86.setEnabled(false);
        gameMatrix[7][8]=1; mover();
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        jButton87.setBackground(new Color(0,153,51));
        jButton87.setEnabled(false);
        gameMatrix[7][9]=1; mover();
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        jButton88.setBackground(new Color(0,153,51));
        jButton88.setEnabled(false);
        gameMatrix[7][10]=1; mover();
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        jButton81.setBackground(new Color(0,153,51));
        jButton81.setEnabled(false);
        gameMatrix[7][3]=1; mover();
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        jButton114.setBackground(new Color(0,153,51));
        jButton114.setEnabled(false);
        gameMatrix[10][3]=1; mover();
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
        jButton115.setBackground(new Color(0,153,51));
        jButton115.setEnabled(false);
        gameMatrix[10][4]=1; mover();
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        jButton116.setBackground(new Color(0,153,51));
        jButton116.setEnabled(false);
        gameMatrix[10][5]=1; mover();
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
        jButton119.setBackground(new Color(0,153,51));
        jButton119.setEnabled(false);
        gameMatrix[10][8]=1; mover();
    }//GEN-LAST:event_jButton119ActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
        jButton120.setBackground(new Color(0,153,51));
        jButton120.setEnabled(false);
        gameMatrix[10][9]=1; mover();
    }//GEN-LAST:event_jButton120ActionPerformed

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton121ActionPerformed
        jButton121.setBackground(new Color(0,153,51));
        jButton121.setEnabled(false);
        gameMatrix[10][10]=1; mover();
    }//GEN-LAST:event_jButton121ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
