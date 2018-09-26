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
        for( int i=0;i<8;i++ ){
          Vertice nodo= new Vertice("id"+i,"v"+i);
          vertices.add(nodo);  
        }
        // Creacion de aristas 
        crearArista("A_1",0,1,3);
        crearArista("A_2",0,2,1);
        crearArista("A_3",1,6,5);
        crearArista("A_4",1,3,1);
        crearArista("A_5",2,5,5);
        crearArista("A_6",2,3,2);
        crearArista("A_7",3,5,2);
        crearArista("A_8",3,4,4);
        crearArista("A_9",5,7,3);
        crearArista("A_10",4,7,1);
        crearArista("A_11",6,4,2);
        
        Grafo grafo= new Grafo(vertices,aristas);
        AlgoritmoDijkstra dijkstra =new AlgoritmoDijkstra(grafo);
        dijkstra.procesarGrafo(vertices.get(0));
        LinkedList<Vertice> camino= dijkstra.getCamino(vertices.get(7));
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
