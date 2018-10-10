
package edatos;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDfs {
    
    public TestDfs(){}
    
    @Test
    public void probarDfs() {
        int n=7;
        Grafo1  g=new Grafo1(n);
        g.addArista(3,1);
        g.addArista(3,2);
        g.addArista(6,3);
        g.addArista(1,6);
        g.addArista(6,0);
        g.addArista(6,4);
        g.addArista(5,6);
        g.addArista(2,5);
        int s=3; 
        System.out.println(" Busqueda en anchura BFS en  iniciando en "+s);
        g.BFS(s);
    }
    
}
