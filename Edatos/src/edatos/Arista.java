package edatos;

public class Arista {
    private final String id;
    private final Vertice inicio;
    private final Vertice destino;
    private final int peso;

    public Arista(String id, Vertice inicio, Vertice destino, int peso) {
        this.id = id;
        this.inicio = inicio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }
    public Vertice getDestino() {
        return destino;
    }

    public Vertice getInicio() {
        return inicio;
    }
    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return inicio + " " + destino;
    }
}
