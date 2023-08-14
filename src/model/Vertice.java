/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author dmora
 */
public class Vertice {
    public int dato;
    boolean visitado;
    public ArrayList<Vertice> aristas;
    public int peso;//peso
    public String casilla;
    public JLabel lbl = new JLabel();
    public boolean usado = false;
    public int jugadorSeleccionado = 0;

    // cosntructor
    public Vertice(int dato)
    {
        aristas = new ArrayList<Vertice>();
        this.dato = dato;
        this.visitado = false;
        this.casilla = "";
    }

    public Vertice(int dato, int peso)
    {
        aristas = new ArrayList<Vertice>();
        this.dato = dato;
        this.visitado = false;
        this.peso = peso;
    }

    public void agregarArista (Vertice arista)
    {
        // si no está la arista para no repetir
        if (buscarArista(arista) == -1)
            aristas.add(new Vertice(arista.dato));
    }
    
    public void agregarArista (Vertice arista, int peso)
    {
        // si no está la arista para no repetir
        if (buscarArista(arista) == -1)
            aristas.add(new Vertice(arista.dato, peso));
    }

    public int buscarArista(Vertice v)
    {
        for (int i = 0; i < aristas.size(); i++) {
            if (v.dato == aristas.get(i).dato)
                return i;
        }
        return -1;
    }
}
