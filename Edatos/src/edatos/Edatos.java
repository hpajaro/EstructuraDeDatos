package edatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Edatos {

   
    public static void main(String[] args) {
      /* Pila<String> miPila = new Pila();
       miPila.push("Embappe");
       miPila.push("Jerry");
       miPila.push("Modrick");
       miPila.push("Lukakus");
       miPila.display();
       
       System.out.println("En el tope esta :"+miPila.peek().getValor());
       Nodo<String> nodo= miPila.pull();     
       System.out.println("Elimine a  :"+nodo.getValor().toString());
        miPila.display();*/
        
      /*  String cadena=getString("datos.txt");
        System.out.println("La expresion es: "+cadena);
        if (validarExpresion(cadena))
             System.out.println("La expresion es corresta");
        else
            System.out.println("La expresion no es corresta");*/
        
     /* Cola<String> cola = new Cola();
      cola.enqueue("E20");
      cola.enqueue("E22");
      cola.enqueue("F10");
      cola.enqueue("F20");
      cola.enqueue("E25");
      cola.display();
      Nodo<String> nodo=cola.dequeue();
     System.out.println( "Se atendió el nodo: "+nodo.getValor());
     cola.display();*/
        
      Persona p1=new Persona("72135240","Hernan Enrique","Pajaro Torres","hpajaro@gmail.com","3003456789");  
      Persona p2=new Persona("22222","James","Rodriguez","james@gmail.com","3003232789");    
      Persona p3=new Persona("3333","Pablo Maria ","Perez zapata","pperez@gmail.com","303343671");    
      Persona p4=new Persona("44444","Hernan Enrique","Pajaro Torres","hpajaro@gmail.com","3053456789");  
      
      Contacto miscontactos = new Contacto();
      miscontactos.adicionar(p1);
      miscontactos.adicionar(p2);
      miscontactos.adicionar(p3);
      miscontactos.adicionar(p4);
      
      miscontactos.display();
      Persona p99=miscontactos.buscar("999");
      if (p99 != null)
           System.out.println("Contacto encontrado y es: "+p99.toString());
      else 
        System.out.println("Fulano no encontrado o no hay contactos");
    }
    
      public static String getString(String archivo) {
        String cadena="";
        FileReader file =null;
        try {
            file = new FileReader(archivo);
            BufferedReader br = new BufferedReader(file);
            try {     
                cadena = br.readLine();
                br.close();
                file.close();
               
            } catch (IOException ex) {
                System.out.println("Error de lectura de archivo");
            }              
        
        }catch(FileNotFoundException e){
           System.out.println("No se ha encontrado el archivo");
        } 
        return cadena;
    }  
    
    public static boolean validarExpresion (String cadena){
        
         Pila<Character> pila=new Pila();
         char actual, anterior;
       for (int i=0;i < cadena.length();i++){         
            actual = cadena.charAt(i);
          if (actual == '(' || actual == '{' || actual =='['){         
                pila.push(actual);
           }else{
              if (actual == ')' || actual == '}' || actual ==']') {
                if (pila.isEmpty()){
                    return false;
                }else{
                  anterior =(char)pila.peek().getValor();                 
                  if(actual == ')' && anterior == '(' || actual == '}' && anterior == '{' || actual == ']' && anterior =='[' ){
                    pila.pull();
                  }
                }
              }
          }
        }
       if (pila.isEmpty())
           return true;
       else 
         return  false;    
    }
    
}

    

