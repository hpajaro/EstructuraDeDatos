package edatos;

public class Vertice {
    final private String id;
    final private String valor;


    public Vertice(String id, String valor) {
        this.id = id;
        this.valor = valor;
    }
    public String getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertice other = (Vertice) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return valor;
    }


}
