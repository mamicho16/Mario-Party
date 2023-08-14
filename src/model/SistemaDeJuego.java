/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author 50672
 */
public class SistemaDeJuego {
    private int cantJugadores;
    private static ArrayList<Jugador> jugadores;
    private Tablero tablero;
    private Jugador[][] posiciones;
    
    public SistemaDeJuego(int cant, int nodos){
        cantJugadores = cant;
        jugadores = new ArrayList<Jugador>();
        tablero = new Tablero(nodos);
    }
    
    public static void aniadirFicha(String nombreFicha) {
        Jugador j = new Jugador(nombreFicha);
	jugadores.add(j);
        
    }
    
    
    public void crearPosiciones(){
        posiciones = new Jugador[tablero.getGrafo().getMax()][cantJugadores];
        for (int i = 0; i < cantJugadores; i++) {
            posiciones[0][i] = jugadores.get(i);
        }
    }
    
    public void mover(int jugador, int nodo){
        Jugador j = jugadores.get(jugador);
        for (int i = 0; i < tablero.getGrafo().getMax(); i++) {
            if(j == posiciones[i][jugador]){
                posiciones[i][jugador]=null;
            }
        }
        posiciones[nodo][jugador]=j;
    }
    
    public int returnVertice(Jugador j){
        for (int i = 0; i < tablero.getGrafo().max; i++) {
            if(posiciones[i][jugadores.indexOf(j)]==j){
                return i;
            }
        }
        return -1;
    }
    
    public Tablero getTablero() {
        return tablero;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static void setJugadores(ArrayList<Jugador> jugadores) {
        SistemaDeJuego.jugadores = jugadores;
    }
    public Jugador returnJugador(int num){
        Jugador j = null;
        for (int i = 0; i < cantJugadores; i++) {
            if(jugadores.get(i).num == num){
                j = jugadores.get(i);
                jugadores.remove(i);
                return j;
            }
        }
    return j;
    }
    
    public int eliminarPosicionAnt(int j){
        for (int i = 0; i < tablero.getGrafo().getMax(); i++){
            if(posiciones[i][j] == jugadores.get(j)){
                posiciones[i][j]=null;
                return i;
            }
        }
        return -1;
    }
    
    public void imprimirPosiciones(){
        for (int i = 0; i < tablero.getGrafo().getMax(); i++) {
            for (int j = 0; j < cantJugadores; j++) {
                if(posiciones[i][j]!=null){
                    System.out.print(posiciones[i][j].ficha);
                }
                else{
                    System.out.print("null");
                }
            }
            System.out.println("");
        }
    }
    public void asignarNuevaPos(int v, int j){
        posiciones[v][j] = jugadores.get(j);
    }
    
    public void asignarCasillas(){
        ArrayList<String> juegos = new ArrayList<>();
        ArrayList<String> casillasEspeciales = new ArrayList<>();
        juegos.add("gato.png");
        juegos.add("sopa_letras.png");
        juegos.add("memory_path.png");
        juegos.add("bros_memory.png");
        juegos.add("catch_cat.png");
        juegos.add("bombermario.png");
        juegos.add("guess_who.png");
        juegos.add("collect_coins.png");
        juegos.add("mario_cards.png");
        casillasEspeciales.add("carcel.png");
        casillasEspeciales.add("tubo.png");
        casillasEspeciales.add("tubo2.png");
        casillasEspeciales.add("tubo3.png");
        casillasEspeciales.add("estrella.png");
        casillasEspeciales.add("fire_flower.png");
        casillasEspeciales.add("ice_flower.png");
        casillasEspeciales.add("cola.png");
        
        for (int i = 0; i < tablero.getGrafo().getMax(); i++) {
            Random random = new Random();
            if(i != 0 && i != tablero.getGrafo().getMax()-1){
                if(casillasEspeciales.size()!=0){
                    int xd = random.nextInt(casillasEspeciales.size());
                    tablero.getGrafo().vertices[i].casilla = casillasEspeciales.get(xd);
                    casillasEspeciales.remove(xd);
                }
                else{
                    if(juegos.size()!=0){
                        int xd = random.nextInt(juegos.size());
                        tablero.getGrafo().vertices[i].casilla = juegos.get(xd);
                        juegos.remove(xd);
                    }
                    else{
                        
                        juegos.add("gato.png");
                        juegos.add("sopa_letras.png");
                        juegos.add("memory_path.png");
                        juegos.add("bros_memory.png");
                        juegos.add("catch_cat.png");
                        juegos.add("bombermario.png");
                        juegos.add("guess_who.png");
                        juegos.add("collect_coins.png");
                        juegos.add("mario_cards.png");
                        int xd = random.nextInt(juegos.size());
                        tablero.getGrafo().vertices[i].casilla = juegos.get(xd);
                        juegos.remove(xd);
                    }
                } 
            }
            else{
                tablero.getGrafo().vertices[i].casilla = "inicio.jpg";
            }
        }
        for (int i = 0; i < tablero.getGrafo().getMax(); i++) {
            System.out.println(tablero.getGrafo().vertices[i].casilla);
            System.out.println("");
        }
    }
}