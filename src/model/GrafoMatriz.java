/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Random;

/**
 *
 * @author dmora
 */
public final class GrafoMatriz {

    public int matriz[][];
    public Vertice vertices[];
    int cantidadVertices = 0;
    int max;
    public GrafoMatriz(int size) {
        matriz = new int[size][size];

        vertices = new Vertice[size];

        max = size;
    }
    
    public GrafoMatriz(){
        matriz = new int[19][19];
        vertices = new Vertice[19];
        max = 19;
        
        for (int i = 0; i < 19; i++) {
            agregarVertice(i+1);
        }
        
        agregarArista(vertices[0], vertices[4]);
        agregarArista(vertices[0], vertices[1]);
        agregarArista(vertices[0], vertices[2]);
        agregarArista(vertices[4], vertices[0]);
        agregarArista(vertices[1], vertices[0]);
        agregarArista(vertices[2], vertices[0]);
        agregarArista(vertices[2], vertices[3]);
        agregarArista(vertices[3], vertices[2]);
        agregarArista(vertices[1], vertices[3]);
        agregarArista(vertices[3], vertices[1]);
        agregarArista(vertices[1], vertices[5]);
        agregarArista(vertices[5], vertices[1]);
        agregarArista(vertices[1], vertices[6]);
        agregarArista(vertices[6], vertices[1]);
        agregarArista(vertices[1], vertices[7]);
        agregarArista(vertices[7], vertices[1]);
        agregarArista(vertices[3], vertices[11]);
        agregarArista(vertices[11], vertices[3]);
        agregarArista(vertices[3], vertices[12]);
        agregarArista(vertices[12], vertices[3]);
        agregarArista(vertices[3], vertices[13]);
        agregarArista(vertices[13], vertices[3]);
        agregarArista(vertices[5], vertices[8]);
        agregarArista(vertices[8], vertices[5]);
        agregarArista(vertices[8], vertices[10]);
        agregarArista(vertices[10], vertices[8]);
        agregarArista(vertices[10], vertices[9]);
        agregarArista(vertices[9], vertices[10]);
        agregarArista(vertices[6], vertices[9]);
        agregarArista(vertices[9], vertices[6]);
        agregarArista(vertices[7], vertices[14]);
        agregarArista(vertices[14], vertices[7]);
        agregarArista(vertices[7], vertices[13]);
        agregarArista(vertices[13], vertices[7]);
        agregarArista(vertices[9], vertices[14]);
        agregarArista(vertices[14], vertices[9]);
        agregarArista(vertices[9], vertices[15]);
        agregarArista(vertices[15], vertices[9]);
        agregarArista(vertices[14], vertices[15]);
        agregarArista(vertices[15], vertices[14]);
        agregarArista(vertices[16], vertices[15]);
        agregarArista(vertices[15], vertices[16]);
        agregarArista(vertices[14], vertices[17]);
        agregarArista(vertices[17], vertices[14]);
        agregarArista(vertices[15], vertices[18]);
        agregarArista(vertices[18], vertices[15]);

    }

    public void agregarVertice(int v)
    {
       if (cantidadVertices < max){
            vertices[cantidadVertices] = new Vertice(v);
            cantidadVertices++;
        }
    }
    
    public void agregarVertice(int v, int p)
    {
       if (cantidadVertices < max){
            vertices[cantidadVertices] = new Vertice(v, p);
            cantidadVertices++;
        }
    }

    public int indexOfVertice(Vertice v)
    {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(v))
                return i;
        }

        return -1;
    }

    // borrar
    public void borrarArista (Vertice v)
    {
        int indice = indexOfVertice(v);
        // si es igual a cantidad vertices, no hace nada, solo corre
        // cant vertices
        if (indice != -1)
        {
                if(indice < (cantidadVertices-1))
                {

                    for (int i = indice; i < vertices.length-1; i++) {
                        // corre a la izquierda los vertices
                        vertices[i] = vertices[i+1];
                    }

                    for (int i = indice; i < matriz.length-1; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            matriz[i][j] = matriz[i+1][j];
                            //matriz[j][i] = matriz[j][i+1];

                        }

                    }
                    for (int i = indice; i < matriz.length-1; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            //matriz[i][j] = matriz[i+1][j];
                            matriz[j][i] = matriz[j][i+1];

                        }

                    }
                }
                // disminuye el indice del arreglo
                cantidadVertices--;
        }
        else
        {
            System.out.println("No encontrado");

        }




    }

    public void agregarArista(Vertice origen, Vertice destino)
    {
        int orig = indexOfVertice(origen);
        int dest = indexOfVertice(destino);

        if (orig != -1 && dest != -1)
        {
            matriz[dest][orig] = 1;
        }
    }

    public void agregarArista(Vertice origen, Vertice destino, int peso)
    {
        int orig = indexOfVertice(origen);
        int dest = indexOfVertice(destino);

        if (orig != -1 && dest != -1)
        {
            matriz[dest][orig] = peso;

        }
    }

    public void imprimir()
    {
        System.out.print(" "+"\t");
        for (int i = 0; i < cantidadVertices; i++) {
            System.out.print(vertices[i].dato+"\t");
        }

        System.out.println("");

        for (int i = 0; i < cantidadVertices; i++) {
            System.out.print(vertices[i].dato+"\t");
            for (int j = 0; j < cantidadVertices; j++) {
                
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

        public void imprimir(int[][] mat)
    {
        System.out.print(" "+"\t");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(vertices[i].dato+"\t");
        }

        System.out.println("");

        for (int i = 0; i < mat.length; i++) {
            System.out.print(vertices[i].dato+"\t");
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]>1000 )
                    System.out.print("**"+"\t");
                else if (mat[i][j] >= 0)
                    System.out.print(mat[i][j]+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }
    }
//-----------------------------------------
    public int[] dijkstra(Vertice v) {
        // arreglo para llevar los nodos visitados
        boolean nodosVisitados[]= new boolean[cantidadVertices];
        // arreglo que almacena las distancias más cortas desde el vertice
        int distanciasCortas[] = new int[cantidadVertices];
        // obtiene el índice del vertice en la matriz
        int node = indexOfVertice(v);
        // coloca visitado el nodo inicial
        nodosVisitados[node] = true;


        // desde 1, porque cero ya tiene valor cero, pues las distancia inicial
        // es de x a x, = 0
        // para cada posición en distancias cortas, va colocando el peso si
        // hay arista entre el nodo inicial y los demás, sino, infito
        for (int i = 1; i < distanciasCortas.length; i++) {
            if (matriz[i][node] != 0) // como sí hay camino, coloca el peso
                distanciasCortas[i] = matriz[i][node];
            else /// si no, infinito
                distanciasCortas[i] = Integer.MAX_VALUE;
        }

        // no considera el primero pues es el primer nodo distancia = 0
        for (int i = 0; i < (distanciasCortas.length - 1); i++){
            // obtiene el menor del arreglo, mientras no visitado
            int next = minVertex(distanciasCortas, nodosVisitados);
            nodosVisitados[next] = true;
            //
            for (int j = 0; j < cantidadVertices; j++) {
                // calcula el ultimo más corto (NEXT) + la arista ady a NEXT
                int d = distanciasCortas[next] + matriz[j][next];
                // si en la pos del vertice no visitado y hay camino a la arista
                // se coloca en distancias cortas de arista la suma del menor
                // más el peso de arista, para ver cual es menor, si no
                // quedo el más corto inicial
                if (distanciasCortas[j] > d && matriz[j][next] > 0) {
                    // como d es menor, se coloca ese valor, que es sumando
                    // el camino acumulado + arista adyacente a next
                    distanciasCortas[j] = distanciasCortas[next] + matriz[j][next];


                    //System.out.println(distanciasCortas[j]);
                }
            }
        }

        for (int i = 0; i < distanciasCortas.length; i++)
            System.out.print(distanciasCortas[i]+"   ");


        return distanciasCortas;
    }


    private int minVertex (int [] distanciasCortas, boolean [] nodosVisitados) {
        int x = Integer.MAX_VALUE;
        int y = -1;
        // RECORRE EL ARREGLO DE DISTANCIAS CORTAS BUSCANDO EL MENOR NO VISITADO
        for (int i = 0; i < distanciasCortas.length; i++) {
            System.out.print(distanciasCortas[i]+ "   ");
            // CONDICION PARA OBTENER NO VISITADO Y EL MENOS DE TODOS
            if (!nodosVisitados[i] && distanciasCortas[i] < x) {
                y = i;
                x = distanciasCortas[i];
            }
        }
        System.out.println("min: "+ y + "  valor = "+x);
        return y;// RETORNA LA POSICION DEL MENOR
    }

//------------------------------------------------------
    public void DFS(GrafoMatriz g, int v, boolean[] visited){
        // marca el nodo actual como visitado
        visited[v] = true;
 
        // hacer para cada borde (v, u)
        for (int i = 0; i < g.max; i++) {
            for (int j = 0; j < g.max; j++) {
                if(i==v && matriz[i][j] == 1){
                    if(!visited[j]){
                        DFS(g,j,visited);
                    }
                }
            }
        }
    }
    
    public boolean isConnected(GrafoMatriz g, int n){
        // hacer para cada vértice
        for (int i = 0; i < n; i++){
            // para realizar un seguimiento de si un vértice es visitado o no
            boolean[] visited = new boolean[n];
 
            // inicia DFS desde el primer vértice
            DFS(g, i, visited);
 
            // Si el recorrido DFS no visita todos los vértices,
            // entonces el grafo no es fuertemente conexo
            for (boolean b: visited){
                if (!b) {
                    return false;
                }
            }
        }
 
        return true;
    }
    
    public void generarAristas(){
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if(matriz[i][j] == 1){
                    Random random = new Random();
                    int xd = random.nextInt(15)+1;
                    System.out.println(xd);
                    matriz[i][j] = xd;
                }
            }
        }
    }
    
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
}
