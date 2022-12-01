
package cajeros_banco;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cajeros_Banco {

   static int opcion  = 0;
   static int elemento = 0;
    public static void main(String[] args) {
     Colas cola = new Colas();
      Colas cajero1 = new Colas();
      Colas cajero2 = new Colas();
      Colas cajero3 = new Colas();
      Colas cajero4 = new Colas();
      BufferedReader leer = new BufferedReader
        (new InputStreamReader(System.in));      
      
        do {
          try {
              System.out.println("**** Elija una opcion ****");
              System.out.println("1. Ingresar datos");
              System.out.println("2. Eliminar datos");
              System.out.println("3. Verificar si la cola esta vacia");
              System.out.println("4. Ver valor del frente");
              System.out.println("5. Vaciar Cola");
              System.out.println("6. Verificar si la cola esta llena");
              System.out.println("7. Cerrar");
              opcion = Integer.parseInt(leer.readLine());
              
              if (opcion==1) {
                  if (cola.Estallena()) {
                      System.out.println("Cola llena, por favor espere.");
                  } else
                  {
                      System.err.print("Digite un elemento: ");
                      elemento = Integer.parseInt(leer.readLine());
                      try {
                          cola.insertar(elemento);
                      } catch (Exception ex) {
                          Logger.getLogger(Cajeros_Banco.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
              }
          } catch (IOException ex) {
              Logger.getLogger(Cajeros_Banco.class.getName()).log(Level.SEVERE, null, ex);
          }
            
            if (opcion==2) {
                if (cola.estaVacia()) {
                    System.err.println("No se pueden eliminar elementos.");
                } else
                {   try {
                    System.out.println(Colas.eliminar());
                    } catch (Exception ex) {
                        Logger.getLogger(Cajeros_Banco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if (opcion==3) {
                if (cola.estaVacia()) 
                    System.err.println("Cola Vacia");
                 else
                    System.err.println("Cola con elementos");
            }
            
            if (opcion == 4) {
                if (cola.estaVacia()) {
                    System.err.println("Cola Vacia");
                } else
                {
                    try {
                        System.out.println("El frente es: " + cola.inicio());
                    } catch (Exception ex) {
                        Logger.getLogger(Cajeros_Banco.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if (opcion == 5) {
                cola.EliminaTodo();
            }
            
            if (opcion == 6) {
                if (cola.Estallena())
                    System.err.println("Cola llena");
                   else
                    System.err.println("Cola con elementos");
            }
            
        } while (opcion!=7);

    }

}