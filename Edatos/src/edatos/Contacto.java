package edatos;

import java.util.Enumeration;
import java.util.Hashtable;

public class Contacto {
  private Hashtable <String,Persona> contactos;

    public Contacto() {
        this.contactos =new Hashtable<String,Persona>();
    }
  
    public void adicionar(Persona p){
        this.contactos.put(p.getCedula(), p);
    
    }
    public boolean eliminar(String cedula){
        if(this.contactos.isEmpty())
            return false;
        else{
            if (this.contactos.containsKey(cedula)){
                this.contactos.remove(cedula);
                return true; 
            }else
                return false;
        }
       
    }
    
  public Persona buscar(String cedula){
        if(this.contactos.isEmpty())
            return null;
        else{
            if (this.contactos.containsKey(cedula)){
                return this.contactos.get(cedula);
            }else
                return null;
        }
       
    }
    
    public void display(){
    
    Enumeration<Persona> elementos = this.contactos.elements();
        while(elementos.hasMoreElements()){
           System.out.println(elementos.nextElement().toString());
        }
    }
    
    
    public void eliminarTodos(){
    
    
    }
    public boolean modificar(String cedula, Persona p){
     return true;
    }
    
}
