/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 50672
 */
public class Jugador {
    String ficha;
    public int num = 0;
    ArrayList<Vertice> visitados;
    public boolean ganoJuego = false;
    public int castigo = 0;

    public Jugador(String ficha){
	this.ficha = ficha;
	visitados = new ArrayList<>();
    }

    public void visitar(Vertice v){
	visitados.add(v);
    }

    public void reiniciar(){
        num = 0;
        castigo = 0;
	visitados.clear();
    }

    public ArrayList<Vertice> getVisitados() {
        return visitados;
    }
    
    public void anadirCastigo(int n){
        castigo = n;
    }
    
    public String getFicha() {
        return ficha;
    }

    public int getNum() {
        return num;
    }
    
    public void sumarEspacios(int i){
        num += i;
    }
    
    public String returnImage(){
        String result = "";
        result = "/resources/"+ficha+"1.png";
        return result;
    }
    
}
