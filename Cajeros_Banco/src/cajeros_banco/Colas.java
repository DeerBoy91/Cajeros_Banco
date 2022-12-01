
package cajeros_banco;

/**
 *
 * @author vikhu
 */
public class Colas {

//Declara atributos
 private static final int tope = 10;
 private Nodo inicio;
 private Nodo fin;
 private static int frente;
 private static int ultimo;
 private int []cola;

 //Agrega constructor
 public Colas()
 {
 inicio=null;
 fin=null;
 frente = 0;
 ultimo = -1;
 cola = new int [tope];
 
 }
 
 //Metodo para insertar
 public void insertar(int dato)
 {
 Nodo i=new Nodo(dato);
 i.setNext(null);
 if(inicio==null & fin==null)
 {
 inicio=i;
 fin=i;
 }
 fin.setNext(i);
 fin=fin.getNext();
 }
 
 //Metodo para extraer datos
 public int extraer()
 {
 int dato=inicio.getDato();
 inicio=inicio.getNext();
 return dato;
 }
 
 //Metodo para ver si la cola no esta vacia
 public boolean estaVacia()
 {
 boolean cola=false;
 if(inicio==null & fin==null)
 {
 cola=true;
 System.out.println("La cola esta vacia");
 }
 else
 {
 System.out.println("La cola no esta vacia");
 cola=false;
 }
 return cola;
 }
 
 public boolean Estallena()
 {
   return frente == tope - 1;
 }
 
 //Metodo para contador
 public int contar()
 {
 int contador=0;
 Nodo c=this.inicio;
 while(c!=null)
 {
 contador++;
 c=c.getNext();
 }
 System.out.println("Numero de datos en la cola: "+contador);
 return contador;
 }
 
    /**
     *
     * @return
     * @throws Exception
     */
    public int eliminadato()throws Exception
 {
     if (!estaVacia())
       return cola[frente++];
    else
      throw new Exception("Cola Vacia");
 }
 
   public void EliminaTodo()
  {
     frente = 0;
     ultimo = -1;
  }
 
 //Metodo toString para pasar los datos
 public String toString()
 {
 Nodo c=this.inicio;
 String s="";
 while(c!=null)
 {
 s=s+c.toString();
 c=c.getNext();
 }
 return s;
 } 
    
}
