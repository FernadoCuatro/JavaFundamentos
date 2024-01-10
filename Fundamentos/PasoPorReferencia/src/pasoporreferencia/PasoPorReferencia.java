package pasoporreferencia;

/**
 *
 * @author user
 */
public class PasoPorReferencia {

  public static void main(String[] args) {
    Persona p = new Persona();
    p.cambiarNombre("Estefany");
    imprimirNombre(p); //Imprime Estefany
    modificarPersona(p);
    imprimirNombre(p); //Imprime Elizabeth
    
  }
  
  public static void modificarPersona(Persona arg) {
    arg.cambiarNombre("Elizabeth");
  }
  
  public static void imprimirNombre(Persona p) {
    System.out.println("Valor recibido: " + p.obtenerNombre() );
  }
  
}
