
package edatos;
import java.util.*; 
  
// representacion del grafo mediante lista de Adjacencia 
//  
class Grafo1 { 
    private final int nv;   // No. of vertices 
    private final LinkedList<Integer> adj[]; //Lista de Adjacencias 
  
    Grafo1(int v)  { 
        this.nv = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 

    public int getNv() {
        return nv;
    }
  
    // metodo que adiciona un vertice al grafo 
    void addArista(int inicio,int fin) { 
        adj[inicio].add(fin); 
    } 
  
    // Muestra el recorrigo tipo BFS partiendo del vertice s 
    // Breadth First Search
    void BFS(int s) { 
        // Marca todos los vertices como no visitados (default =false)
        
        boolean visitados[] = new boolean[nv]; 
  
        // Se requiere una cola para impementar  BFS 
        Queue<Integer> cola = new LinkedList<>(); 
  
        // Marca el nodo como visitado y lo encola
        visitados[s]=true; 
        cola.add(s); 
  
        while (!cola.isEmpty())  { 
            // Saca un vertice de la cola y lo muestra 
            s = cola.poll(); 
            System.out.println(s+" "); 
  
            // Obtiene todos los vertices adyacentes de s  
            // si un vertice adyacente no ha sido visitado lo marca true y lo encola 
            Iterator<Integer> k = adj[s].listIterator(); 
            while (k.hasNext())  { 
                int j = k.next(); 
                if (!visitados[j]) { 
                    visitados[j] = true; 
                    cola.add(j); 
                } 
            } 
        } 
    }
    
}