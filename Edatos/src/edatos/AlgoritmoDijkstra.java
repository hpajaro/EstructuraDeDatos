package edatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AlgoritmoDijkstra {
    private final List<Vertice> vertices;
    private final List<Arista> aristas;
    private Set<Vertice> visitados;
    private Set<Vertice> noVisitados;
    private Map<Vertice, Vertice> predecesores;
    private Map<Vertice, Integer> distancias;

    public AlgoritmoDijkstra(Grafo grafo) {
        // create a copy of the array so that we can operate on this array
        this.vertices = new ArrayList<>(grafo.getVertices());
        this.aristas = new ArrayList<>(grafo.getAristas());
    }

    public void procesarGrafo(Vertice inicio) {
        visitados = new HashSet<>();
        noVisitados = new HashSet<>();
        distancias = new HashMap<>();
        predecesores = new HashMap<>();
        distancias.put(inicio, 0);
        noVisitados.add(inicio);
        while (noVisitados.size() > 0) {
            Vertice nodo = getMinimo(noVisitados);
            visitados.add(nodo);
            noVisitados.remove(nodo);
            distanciasMinima(nodo);
        }
    }

    private void distanciasMinima(Vertice nodo) {
        List<Vertice> nodosAdjacentes = getVecinos(nodo);
        for (Vertice destino : nodosAdjacentes) {
            if (getDistanciaMasCorta(destino) > getDistanciaMasCorta(nodo)
                    + getDistancia(nodo, destino)) {
                distancias.put(destino, getDistanciaMasCorta(nodo)
                        + getDistancia(nodo, destino));
                predecesores.put(destino, nodo);
                noVisitados.add(destino);
            }
        }

    }

    private int getDistancia(Vertice nodo, Vertice destino) {
        for (Arista arista : aristas) {
            if (arista.getInicio().equals(nodo)
                    && arista.getDestino().equals(destino)) {
                return arista.getPeso();
            }
        }
        throw new RuntimeException("Falla calculo distancias");
    }

    private List<Vertice> getVecinos(Vertice nodo) {
        List<Vertice> vecinos = new ArrayList<>();
        for (Arista arista : aristas) {
            if (arista.getInicio().equals(nodo)
                    && !estaVisitado(arista.getDestino())) {
                vecinos.add(arista.getDestino());
            }
        }
        return vecinos;
    }

    private Vertice getMinimo(Set<Vertice> vertices) {
        Vertice minimo = null;
        for (Vertice vertice : vertices) {
            if (minimo == null) {
                minimo = vertice;
            } else {
                if (getDistanciaMasCorta(vertice) < getDistanciaMasCorta(minimo)) {
                    minimo = vertice;
                }
            }
        }
        return minimo;
    }

    private boolean estaVisitado(Vertice vertice) {
        return visitados.contains(vertice);
    }

    private int getDistanciaMasCorta(Vertice destino) {
        Integer d = distancias.get(destino);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    /*
     * Este metodo retorna el camino desde inicio  al destino o NULL si el  camino no existe
     */
    public LinkedList<Vertice> getCamino(Vertice destino) {
        LinkedList<Vertice> camino = new LinkedList<>();
        Vertice paso = destino;
        // verifica su el camino existe
        if (predecesores.get(paso) == null) {
            return null;
        }
        camino.add(paso);
        while (predecesores.get(paso) != null) {
            paso = predecesores.get(paso);
            camino.add(paso);
        }
        // Ordena el camino
        Collections.reverse(camino);
        return camino;
    }
}
