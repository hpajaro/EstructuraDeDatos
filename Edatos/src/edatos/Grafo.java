package edatos;
import java.util.List;

public class Grafo {
    private final List<Vertice> vertices;
    private final List<Arista> aristas;

    public Grafo(List<Vertice> vertices, List<Arista> aristas) {
        this.vertices = vertices;
        this.aristas = aristas;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public List<Arista> getAristas() {
        return aristas;
    }
}
