
package pilaz;

public class PilaZ {

   
    public static void main(String[] args) {
       Pila<String> miPila = new Pila();
       miPila.push("Embappe");
       miPila.push("Jerry");
       miPila.push("Modrick");
       miPila.push("Lukakus");
       miPila.display();
       
       System.out.println("En el tope esta :"+miPila.peek().getValor());
       Nodo<String> nodo= miPila.pull();     
       System.out.println("Elimine a  :"+nodo.getValor().toString());
        miPila.display();
    }
    
}
