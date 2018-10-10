/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hpajaro
 */
public class AlgoritmoDijkstraTest {
    private List<Vertice>  vertices;
     private List<Arista>  aristas;
    public AlgoritmoDijkstraTest() {
    }

    @Test
    public void testProcesarGrafo() {
        vertices= new ArrayList<>();
        aristas= new ArrayList<>();
        
        // Creacion de vertices 
        for( int i=0;i<11;i++ ){
          Vertice nodo= new Vertice("id"+i,"v"+i);
          vertices.add(nodo);  
        }
        // Creacion de aristas 
        crearArista("A_1",0,1,2);
        crearArista("A_2",0,2,4);
        crearArista("A_3",1,3,5);
        crearArista("A_4",2,3,8);
        crearArista("A_5",2,4,9);
        crearArista("A_6",3,5,3);
        crearArista("A_7",3,7,9);
        crearArista("A_8",4,6,2);
        crearArista("A_9",5,8,2);
        crearArista("A_10",6,7,5);
        crearArista("A_11",6,9,9);
        crearArista("A_12",7,10,9);
        crearArista("A_13",8,10,7);
        crearArista("A_14",9,7,2);
        
        Grafo grafo= new Grafo(vertices,aristas);
        AlgoritmoDijkstra dijkstra =new AlgoritmoDijkstra(grafo);
        dijkstra.procesarGrafo(vertices.get(0));
        LinkedList<Vertice> camino= dijkstra.getCamino(vertices.get(10));
        assertNotNull(camino);
        assertTrue(camino.size() > 0);

        for (Vertice vertice : camino) {
            System.out.println(vertice);
        }
    }
    private void crearArista(String idLinea, int inicio, int fin, int peso){
    
      Arista  arista= new Arista(idLinea,vertices.get(inicio),vertices.get(fin),peso);
     aristas.add(arista);
    }
    
    
}
