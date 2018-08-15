package edatos;


public class Cola <E> {
    
    private Nodo top,end;
    private int size;
    
    public Cola(){
        this.top=this.end=null;
        this.size=0;              
    }
    
    public void enqueue(E valor){
        Nodo <E> nodo = new Nodo(valor);
        if (top == null){ // Cola vacia?
          this.top= this.end = nodo;          
        }else{
          this.end.setLink(nodo);
          this.end=nodo;
        }        
        this.size++;
    }
    
    public Nodo<E> dequeue(){
         if (top == null)  // cola esta vacia?
             return null;
         else {
             Nodo<E> nodo = this.top;
             this.top = this.top.getLink();
             this.size --;
             return nodo;
         }    
    }
    
    public Nodo<E> peek(){        
        return this.top;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean isEmpty(){    
     return top == null;
    }
    
    
    public Nodo<E> getEnd(){
       return this.end;
    }
    
     public void display(){
       Nodo<E> nodo =this.top;
       System.out.println("La Cola de tamaño "+this.getSize()+ " es la siguiente:");
       while (nodo != null){
           System.out.println(nodo.getValor().toString());
           nodo=nodo.getLink();
       }
       
    }
    
}
