/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegos;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.SistemaDeJuego;

/**
 *
 * @author eka2004
 */
public class GuessWho extends javax.swing.JFrame {
    SistemaDeJuego sistema;
    int j;
    Icon icon;
    int respuesta;
    ArrayList<JLabel>labels;
    int turnos;
    /**
     * Creates new form Guess
     */
    public GuessWho(SistemaDeJuego sistema, int j) {
        this.sistema=sistema;
        this.j=j;
        initComponents();
        labels= new ArrayList();
        labels.add(jLabel1);labels.add(jLabel2);labels.add(jLabel3);labels.add(jLabel4);labels.add(jLabel5);
        labels.add(jLabel6);labels.add(jLabel7);labels.add(jLabel8);labels.add(jLabel9);labels.add(jLabel10);
        labels.add(jLabel11);labels.add(jLabel12);labels.add(jLabel13);labels.add(jLabel14);labels.add(jLabel15);
        labels.add(jLabel16);labels.add(jLabel17);labels.add(jLabel18);labels.add(jLabel19);labels.add(jLabel20);
        labels.add(jLabel21);labels.add(jLabel22);labels.add(jLabel23);labels.add(jLabel24);labels.add(jLabel25);
        labels.add(jLabel26);labels.add(jLabel27);labels.add(jLabel28);labels.add(jLabel29);labels.add(jLabel30);
        labels.add(jLabel31);labels.add(jLabel32);labels.add(jLabel33);labels.add(jLabel34);labels.add(jLabel35);
        labels.add(jLabel36);labels.add(jLabel37);labels.add(jLabel38);labels.add(jLabel39);labels.add(jLabel40);
        labels.add(jLabel41);labels.add(jLabel42);labels.add(jLabel43);labels.add(jLabel44);labels.add(jLabel45);
        labels.add(jLabel46);labels.add(jLabel47);labels.add(jLabel48);labels.add(jLabel49);labels.add(jLabel50);
        labels.add(jLabel51);labels.add(jLabel52);labels.add(jLabel53);labels.add(jLabel54);labels.add(jLabel55);
        labels.add(jLabel56);labels.add(jLabel57);labels.add(jLabel58);labels.add(jLabel59);labels.add(jLabel60);
        labels.add(jLabel61);labels.add(jLabel62);labels.add(jLabel63);labels.add(jLabel64);labels.add(jLabel65);
        labels.add(jLabel66);labels.add(jLabel67);labels.add(jLabel68);labels.add(jLabel69);labels.add(jLabel70);
        labels.add(jLabel71);labels.add(jLabel72);labels.add(jLabel73);labels.add(jLabel74);labels.add(jLabel75);
        labels.add(jLabel76);labels.add(jLabel77);labels.add(jLabel78);labels.add(jLabel79);labels.add(jLabel80);
        labels.add(jLabel81);labels.add(jLabel82);labels.add(jLabel83);labels.add(jLabel84);labels.add(jLabel85);
        labels.add(jLabel86);labels.add(jLabel87);labels.add(jLabel88);labels.add(jLabel89);labels.add(jLabel90);
        labels.add(jLabel91);labels.add(jLabel92);labels.add(jLabel93);labels.add(jLabel94);labels.add(jLabel95);
        labels.add(jLabel96);labels.add(jLabel97);labels.add(jLabel98);labels.add(jLabel99);labels.add(jLabel100);
        aleatorio();
    }
     public void aleatorio(){
         int random =ThreadLocalRandom.current().nextInt(0, 14 + 1);
         int random2=ThreadLocalRandom.current().nextInt(4, 8 + 1);
         turnos=random2;
         if(random==0){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/mario (1).png");
             respuesta=0;
         }
         else if(random==1){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/luigi (2).png");
             respuesta=1;
         }
         else if(random==2){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/peach (1).png");
             respuesta=2;
         }
         else if(random==3){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/daisy (1).png");
             respuesta=3;
         }
         else if(random==4){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/donkey_kong (1).png");
             respuesta=4;
         }
         else if(random==5){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/estrella.png");
             respuesta=5;
         }
         else if(random==6){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/king_boo.png");
             respuesta=6;
         }
         else if(random==7){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/toad (1).png");
             respuesta=7;
         }
         else if(random==8){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/waluigi.png");
             respuesta=8;
         }
         else if(random==9){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/birdo.png");
             respuesta=9;
         }
         else if(random==10){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/yoshi (1).png");
             respuesta=10;
         }
         else if(random==11){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/Bowser (1).png");
             respuesta=11;
           
         }
         else if(random==12){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/Diddy.png");
             respuesta=12;
         }
         else if(random==13){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/Birdo (1).png");
             respuesta=13;
         }
         else if(random==14){
             icon=new ImageIcon("C:/Users/50672/Documents/NetBeansProjects/MarioGraph1/src/resources/CatMario (2).png");
             respuesta=14;
         }
         
         jLabel101.setIcon(icon);
         
     }
     public void distribu(int i){
         if(revisar()){
            int indice= i;
            JLabel label= labels.get(i);
            label.setSize(0,0);
         }
                
        }
     public boolean revisar(){
         if (turnos!=0){
             turnos--;
             return true;
             
         }
         else {JOptionPane.showMessageDialog(null, "No tiene más celdas, adivine un personaje", "No mas celdas.", JOptionPane.WARNING_MESSAGE);
        return false;}
            
     }
     public void descubrir(){
         for (int i = 0; i < 100; i++) {
             labels.get(i).setSize(0,0);
         }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        Mario = new javax.swing.JButton();
        Mario1 = new javax.swing.JButton();
        Mario2 = new javax.swing.JButton();
        Mario3 = new javax.swing.JButton();
        Mario4 = new javax.swing.JButton();
        Mario5 = new javax.swing.JButton();
        Mario6 = new javax.swing.JButton();
        Mario7 = new javax.swing.JButton();
        Mario8 = new javax.swing.JButton();
        Mario9 = new javax.swing.JButton();
        Mario10 = new javax.swing.JButton();
        Mario11 = new javax.swing.JButton();
        Mario12 = new javax.swing.JButton();
        Mario13 = new javax.swing.JButton();
        Mario14 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel1.setToolTipText("1");
        jLabel1.setName("1"); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel2.setToolTipText("2");
        jLabel2.setName("2"); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel3.setToolTipText("1");
        jLabel3.setName("1"); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel4.setToolTipText("2");
        jLabel4.setName("2"); // NOI18N
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel5.setToolTipText("1");
        jLabel5.setName("1"); // NOI18N
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel6.setToolTipText("2");
        jLabel6.setName("2"); // NOI18N
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel7.setToolTipText("1");
        jLabel7.setName("1"); // NOI18N
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel8.setToolTipText("2");
        jLabel8.setName("2"); // NOI18N
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel9.setToolTipText("1");
        jLabel9.setName("1"); // NOI18N
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel10.setToolTipText("2");
        jLabel10.setName("2"); // NOI18N
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel11.setToolTipText("1");
        jLabel11.setName("1"); // NOI18N
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel12.setToolTipText("2");
        jLabel12.setName("2"); // NOI18N
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel13.setToolTipText("1");
        jLabel13.setName("1"); // NOI18N
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel14.setToolTipText("2");
        jLabel14.setName("2"); // NOI18N
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel15.setToolTipText("1");
        jLabel15.setName("1"); // NOI18N
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel16.setToolTipText("2");
        jLabel16.setName("2"); // NOI18N
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel17.setToolTipText("1");
        jLabel17.setName("1"); // NOI18N
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel18.setToolTipText("2");
        jLabel18.setName("2"); // NOI18N
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel19.setToolTipText("1");
        jLabel19.setName("1"); // NOI18N
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel20.setToolTipText("2");
        jLabel20.setName("2"); // NOI18N
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel21.setToolTipText("1");
        jLabel21.setName("1"); // NOI18N
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel22.setToolTipText("2");
        jLabel22.setName("2"); // NOI18N
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel23.setToolTipText("1");
        jLabel23.setName("1"); // NOI18N
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel24.setToolTipText("2");
        jLabel24.setName("2"); // NOI18N
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel25.setToolTipText("1");
        jLabel25.setName("1"); // NOI18N
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel26.setToolTipText("2");
        jLabel26.setName("2"); // NOI18N
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel27.setToolTipText("1");
        jLabel27.setName("1"); // NOI18N
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel28.setToolTipText("2");
        jLabel28.setName("2"); // NOI18N
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel29.setToolTipText("1");
        jLabel29.setName("1"); // NOI18N
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel30.setToolTipText("2");
        jLabel30.setName("2"); // NOI18N
        jLabel30.setOpaque(true);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel31.setToolTipText("1");
        jLabel31.setName("1"); // NOI18N
        jLabel31.setOpaque(true);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel32.setToolTipText("2");
        jLabel32.setName("2"); // NOI18N
        jLabel32.setOpaque(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel33.setToolTipText("1");
        jLabel33.setName("1"); // NOI18N
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel34.setToolTipText("2");
        jLabel34.setName("2"); // NOI18N
        jLabel34.setOpaque(true);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel35.setToolTipText("1");
        jLabel35.setName("1"); // NOI18N
        jLabel35.setOpaque(true);
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 51, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel36.setToolTipText("2");
        jLabel36.setName("2"); // NOI18N
        jLabel36.setOpaque(true);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel37.setToolTipText("1");
        jLabel37.setName("1"); // NOI18N
        jLabel37.setOpaque(true);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 51, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel38.setToolTipText("2");
        jLabel38.setName("2"); // NOI18N
        jLabel38.setOpaque(true);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 51, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel39.setToolTipText("1");
        jLabel39.setName("1"); // NOI18N
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 51, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel40.setToolTipText("2");
        jLabel40.setName("2"); // NOI18N
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 51, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel41.setToolTipText("1");
        jLabel41.setName("1"); // NOI18N
        jLabel41.setOpaque(true);
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 51, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel42.setToolTipText("2");
        jLabel42.setName("2"); // NOI18N
        jLabel42.setOpaque(true);
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel43.setToolTipText("1");
        jLabel43.setName("1"); // NOI18N
        jLabel43.setOpaque(true);
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 51, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel44.setToolTipText("2");
        jLabel44.setName("2"); // NOI18N
        jLabel44.setOpaque(true);
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 51, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel45.setToolTipText("1");
        jLabel45.setName("1"); // NOI18N
        jLabel45.setOpaque(true);
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 51, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel46.setToolTipText("2");
        jLabel46.setName("2"); // NOI18N
        jLabel46.setOpaque(true);
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 51, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel47.setToolTipText("1");
        jLabel47.setName("1"); // NOI18N
        jLabel47.setOpaque(true);
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 51, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel48.setToolTipText("2");
        jLabel48.setName("2"); // NOI18N
        jLabel48.setOpaque(true);
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 51, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel49.setToolTipText("1");
        jLabel49.setName("1"); // NOI18N
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 51, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel50.setToolTipText("2");
        jLabel50.setName("2"); // NOI18N
        jLabel50.setOpaque(true);
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 51, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel51.setToolTipText("1");
        jLabel51.setName("1"); // NOI18N
        jLabel51.setOpaque(true);
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 51, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel52.setToolTipText("2");
        jLabel52.setName("2"); // NOI18N
        jLabel52.setOpaque(true);
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 51, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel53.setToolTipText("1");
        jLabel53.setName("1"); // NOI18N
        jLabel53.setOpaque(true);
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 51, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel54.setToolTipText("2");
        jLabel54.setName("2"); // NOI18N
        jLabel54.setOpaque(true);
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 51, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel55.setToolTipText("1");
        jLabel55.setName("1"); // NOI18N
        jLabel55.setOpaque(true);
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 51, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel56.setToolTipText("2");
        jLabel56.setName("2"); // NOI18N
        jLabel56.setOpaque(true);
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 51, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel57.setToolTipText("1");
        jLabel57.setName("1"); // NOI18N
        jLabel57.setOpaque(true);
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 51, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel58.setToolTipText("2");
        jLabel58.setName("2"); // NOI18N
        jLabel58.setOpaque(true);
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 51, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel59.setToolTipText("1");
        jLabel59.setName("1"); // NOI18N
        jLabel59.setOpaque(true);
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 51, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel60.setToolTipText("2");
        jLabel60.setName("2"); // NOI18N
        jLabel60.setOpaque(true);
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 51, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel61.setToolTipText("1");
        jLabel61.setName("1"); // NOI18N
        jLabel61.setOpaque(true);
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 51, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel62.setToolTipText("2");
        jLabel62.setName("2"); // NOI18N
        jLabel62.setOpaque(true);
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 51, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel63.setToolTipText("1");
        jLabel63.setName("1"); // NOI18N
        jLabel63.setOpaque(true);
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 51, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel64.setToolTipText("2");
        jLabel64.setName("2"); // NOI18N
        jLabel64.setOpaque(true);
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 51, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel65.setToolTipText("1");
        jLabel65.setName("1"); // NOI18N
        jLabel65.setOpaque(true);
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 51, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel66.setToolTipText("2");
        jLabel66.setName("2"); // NOI18N
        jLabel66.setOpaque(true);
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 51, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel67.setToolTipText("1");
        jLabel67.setName("1"); // NOI18N
        jLabel67.setOpaque(true);
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 51, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel68.setToolTipText("2");
        jLabel68.setName("2"); // NOI18N
        jLabel68.setOpaque(true);
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 51, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel69.setToolTipText("1");
        jLabel69.setName("1"); // NOI18N
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 51, 0));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel70.setToolTipText("2");
        jLabel70.setName("2"); // NOI18N
        jLabel70.setOpaque(true);
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 51, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel71.setToolTipText("1");
        jLabel71.setName("1"); // NOI18N
        jLabel71.setOpaque(true);
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 51, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel72.setToolTipText("2");
        jLabel72.setName("2"); // NOI18N
        jLabel72.setOpaque(true);
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 51, 0));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel73.setToolTipText("1");
        jLabel73.setName("1"); // NOI18N
        jLabel73.setOpaque(true);
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 51, 0));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel74.setToolTipText("2");
        jLabel74.setName("2"); // NOI18N
        jLabel74.setOpaque(true);
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 51, 0));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel75.setToolTipText("1");
        jLabel75.setName("1"); // NOI18N
        jLabel75.setOpaque(true);
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
        });

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 51, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel76.setToolTipText("2");
        jLabel76.setName("2"); // NOI18N
        jLabel76.setOpaque(true);
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 51, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel77.setToolTipText("1");
        jLabel77.setName("1"); // NOI18N
        jLabel77.setOpaque(true);
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 51, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel78.setToolTipText("2");
        jLabel78.setName("2"); // NOI18N
        jLabel78.setOpaque(true);
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
        });

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 51, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel79.setToolTipText("1");
        jLabel79.setName("1"); // NOI18N
        jLabel79.setOpaque(true);
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
        });

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 51, 0));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel80.setToolTipText("2");
        jLabel80.setName("2"); // NOI18N
        jLabel80.setOpaque(true);
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 51, 0));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel81.setToolTipText("1");
        jLabel81.setName("1"); // NOI18N
        jLabel81.setOpaque(true);
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 51, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel82.setToolTipText("2");
        jLabel82.setName("2"); // NOI18N
        jLabel82.setOpaque(true);
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 51, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel83.setToolTipText("1");
        jLabel83.setName("1"); // NOI18N
        jLabel83.setOpaque(true);
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
        });

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 51, 0));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel84.setToolTipText("2");
        jLabel84.setName("2"); // NOI18N
        jLabel84.setOpaque(true);
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
        });

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 51, 0));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel85.setToolTipText("1");
        jLabel85.setName("1"); // NOI18N
        jLabel85.setOpaque(true);
        jLabel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel85MouseClicked(evt);
            }
        });

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 51, 0));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel86.setToolTipText("2");
        jLabel86.setName("2"); // NOI18N
        jLabel86.setOpaque(true);
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
        });

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 51, 0));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel87.setToolTipText("1");
        jLabel87.setName("1"); // NOI18N
        jLabel87.setOpaque(true);
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel87MouseClicked(evt);
            }
        });

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 51, 0));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel88.setToolTipText("2");
        jLabel88.setName("2"); // NOI18N
        jLabel88.setOpaque(true);
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 51, 0));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel89.setToolTipText("1");
        jLabel89.setName("1"); // NOI18N
        jLabel89.setOpaque(true);
        jLabel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel89MouseClicked(evt);
            }
        });

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 51, 0));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel90.setToolTipText("2");
        jLabel90.setName("2"); // NOI18N
        jLabel90.setOpaque(true);
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
        });

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 51, 0));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel91.setToolTipText("1");
        jLabel91.setName("1"); // NOI18N
        jLabel91.setOpaque(true);
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
        });

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 51, 0));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel92.setToolTipText("2");
        jLabel92.setName("2"); // NOI18N
        jLabel92.setOpaque(true);
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 51, 0));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel93.setToolTipText("1");
        jLabel93.setName("1"); // NOI18N
        jLabel93.setOpaque(true);
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
        });

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 51, 0));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel94.setToolTipText("2");
        jLabel94.setName("2"); // NOI18N
        jLabel94.setOpaque(true);
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 51, 0));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel95.setToolTipText("1");
        jLabel95.setName("1"); // NOI18N
        jLabel95.setOpaque(true);
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 51, 0));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel96.setToolTipText("2");
        jLabel96.setName("2"); // NOI18N
        jLabel96.setOpaque(true);
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel96MouseClicked(evt);
            }
        });

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 51, 0));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel97.setToolTipText("1");
        jLabel97.setName("1"); // NOI18N
        jLabel97.setOpaque(true);
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
        });

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 51, 0));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel98.setToolTipText("2");
        jLabel98.setName("2"); // NOI18N
        jLabel98.setOpaque(true);
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 51, 0));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel99.setToolTipText("1");
        jLabel99.setName("1"); // NOI18N
        jLabel99.setOpaque(true);
        jLabel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel99MouseClicked(evt);
            }
        });

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Wawati SC", 0, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 51, 0));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guessBox.png"))); // NOI18N
        jLabel100.setToolTipText("2");
        jLabel100.setName("2"); // NOI18N
        jLabel100.setOpaque(true);
        jLabel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel100MouseClicked(evt);
            }
        });

        Mario.setText("Mario");
        Mario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarioActionPerformed(evt);
            }
        });

        Mario1.setText("Luigi");
        Mario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario1ActionPerformed(evt);
            }
        });

        Mario2.setText("Peach");
        Mario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario2ActionPerformed(evt);
            }
        });

        Mario3.setText("Daisy");
        Mario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario3ActionPerformed(evt);
            }
        });

        Mario4.setText("Donkey Kong");
        Mario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario4ActionPerformed(evt);
            }
        });

        Mario5.setText("Estrella");
        Mario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario5ActionPerformed(evt);
            }
        });

        Mario6.setText("King Boo");
        Mario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario6ActionPerformed(evt);
            }
        });

        Mario7.setText("Toad");
        Mario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario7ActionPerformed(evt);
            }
        });

        Mario8.setText("Waluigi");
        Mario8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario8ActionPerformed(evt);
            }
        });

        Mario9.setText("Goomba");
        Mario9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario9ActionPerformed(evt);
            }
        });

        Mario10.setText("Yoshi");
        Mario10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario10ActionPerformed(evt);
            }
        });

        Mario11.setText("Bowser");
        Mario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario11ActionPerformed(evt);
            }
        });

        Mario12.setText("Diddy Kong");
        Mario12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario12ActionPerformed(evt);
            }
        });

        Mario13.setText("Birdo");
        Mario13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario13ActionPerformed(evt);
            }
        });

        Mario14.setText("Cat Mario");
        Mario14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mario14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(Mario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mario1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mario14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Mario)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Mario1)
                        .addGap(8, 8, 8)
                        .addComponent(Mario2)
                        .addGap(8, 8, 8)
                        .addComponent(Mario3)
                        .addGap(8, 8, 8)
                        .addComponent(Mario4)
                        .addGap(8, 8, 8)
                        .addComponent(Mario5)
                        .addGap(8, 8, 8)
                        .addComponent(Mario6)
                        .addGap(8, 8, 8)
                        .addComponent(Mario7)
                        .addGap(8, 8, 8)
                        .addComponent(Mario8)
                        .addGap(8, 8, 8)
                        .addComponent(Mario9)
                        .addGap(8, 8, 8)
                        .addComponent(Mario10)
                        .addGap(8, 8, 8)
                        .addComponent(Mario11)
                        .addGap(8, 8, 8)
                        .addComponent(Mario12)
                        .addGap(8, 8, 8)
                        .addComponent(Mario13)
                        .addGap(8, 8, 8)
                        .addComponent(Mario14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        distribu(0);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        distribu(1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        distribu(2);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        distribu(3);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        distribu(4);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        distribu(5);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        distribu(6);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        distribu(7);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        distribu(8);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        distribu(9);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        distribu(10);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        distribu(11);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        distribu(12);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        distribu(13);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        distribu(14);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        distribu(15);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        distribu(16);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        distribu(17); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        distribu(18);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        distribu(19);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        distribu(20);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        distribu(21);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        distribu(22);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        distribu(23);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        distribu(24);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        distribu(25);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        distribu(26);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        distribu(27);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        distribu(28);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        distribu(29);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        distribu(30);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        distribu(31);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        distribu(32);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        distribu(33);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        distribu(34);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        distribu(35);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        distribu(36);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        distribu(37);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        distribu(38);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        distribu(39);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        distribu(40);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        distribu(41);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        distribu(42);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        distribu(43);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        distribu(44);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        distribu(45);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        distribu(46);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        distribu(47);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        distribu(48);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        distribu(49);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        distribu(50);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        distribu(51);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        distribu(52);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        distribu(53);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        distribu(54);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        distribu(55);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        distribu(56);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        distribu(57);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        distribu(58);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        distribu(59);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        distribu(60);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        distribu(61);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        distribu(62);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        distribu(63);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        distribu(64); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        distribu(65);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        distribu(66); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        distribu(67);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        distribu(68);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        distribu(69); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        distribu(70);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        distribu(71);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        distribu(72);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        distribu(73);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
        distribu(74);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        distribu(75);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        distribu(76);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        distribu(77);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel78MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        distribu(78); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel79MouseClicked

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        distribu(79);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        distribu(80);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        distribu(81);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        distribu(82);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel83MouseClicked

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
        distribu(83);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel84MouseClicked

    private void jLabel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel85MouseClicked
        distribu(84);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel85MouseClicked

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        distribu(85);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseClicked
        distribu(86);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel87MouseClicked

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
        distribu(87);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel88MouseClicked

    private void jLabel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel89MouseClicked
        distribu(88);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel89MouseClicked

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
        distribu(89); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        distribu(90);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        distribu(91);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
        distribu(92);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel93MouseClicked

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        distribu(93);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel94MouseClicked

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        distribu(94);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel95MouseClicked

    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
        distribu(95);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel96MouseClicked

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
        distribu(96);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel97MouseClicked

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        distribu(97); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel98MouseClicked

    private void jLabel99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseClicked
        distribu(98);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel99MouseClicked

    private void jLabel100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel100MouseClicked
        distribu(99);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel100MouseClicked

    private void MarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarioActionPerformed
        if (respuesta==0){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
    }//GEN-LAST:event_MarioActionPerformed

    private void Mario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario1ActionPerformed
        if (respuesta==1){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
    }//GEN-LAST:event_Mario1ActionPerformed

    private void Mario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario2ActionPerformed
        if (respuesta==2){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
    }//GEN-LAST:event_Mario2ActionPerformed

    private void Mario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario3ActionPerformed
        if (respuesta==3){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
    }//GEN-LAST:event_Mario3ActionPerformed

    private void Mario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario4ActionPerformed
        if (respuesta==4){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
    }//GEN-LAST:event_Mario4ActionPerformed

    private void Mario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario5ActionPerformed
        if (respuesta==5){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
    }//GEN-LAST:event_Mario5ActionPerformed

    private void Mario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario6ActionPerformed
        if (respuesta==6){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario6ActionPerformed

    private void Mario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario7ActionPerformed
        if (respuesta==7){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario7ActionPerformed

    private void Mario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario8ActionPerformed
        if (respuesta==8){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario8ActionPerformed

    private void Mario9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario9ActionPerformed
        if (respuesta==9){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario9ActionPerformed

    private void Mario10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario10ActionPerformed
        if (respuesta==10){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario10ActionPerformed

    private void Mario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario11ActionPerformed
        if (respuesta==11){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario11ActionPerformed

    private void Mario12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario12ActionPerformed
        if (respuesta==12){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario12ActionPerformed

    private void Mario13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario13ActionPerformed
        if (respuesta==13){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario13ActionPerformed

    private void Mario14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mario14ActionPerformed
        if (respuesta==14){
            sistema.getJugadores().get(j).ganoJuego = true;
            JOptionPane.showMessageDialog(null, "Ha ganado", "Wins turn.", 2);
        }
        else JOptionPane.showMessageDialog(null, "Ha fallado", "Looses turn.", 0);
        this.dispose();
        descubrir();
    }//GEN-LAST:event_Mario14ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mario;
    private javax.swing.JButton Mario1;
    private javax.swing.JButton Mario10;
    private javax.swing.JButton Mario11;
    private javax.swing.JButton Mario12;
    private javax.swing.JButton Mario13;
    private javax.swing.JButton Mario14;
    private javax.swing.JButton Mario2;
    private javax.swing.JButton Mario3;
    private javax.swing.JButton Mario4;
    private javax.swing.JButton Mario5;
    private javax.swing.JButton Mario6;
    private javax.swing.JButton Mario7;
    private javax.swing.JButton Mario8;
    private javax.swing.JButton Mario9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
