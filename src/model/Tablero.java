/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 50672
 */
public class Tablero {
    private GrafoMatriz grafo;
    
    public Tablero(int size){
        grafo = new GrafoMatriz(size);
        for (int i = 0; i < size; i++) {
            grafo.agregarVertice(i);
        }
    }

    public GrafoMatriz getGrafo() {
        return grafo;
    }

    public void setGrafo(GrafoMatriz grafo) {
        this.grafo = grafo;
    }
    
    
    
}
