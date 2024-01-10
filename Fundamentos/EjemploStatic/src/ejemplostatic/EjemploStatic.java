
package ejemplostatic;

/**
 *
 * @author FernandoCuatro
 */
public class EjemploStatic {

 public static void main(String[] args) {
// Creamos el primer objeto con su argumento
 Persona p1 = new Persona("Estefany");
 System.out.println("Persona1: " + p1.toString());
 
// Creamos el segundo objeto con su argumento
 Persona p2 = new Persona("Elizabeth");
 System.out.println("Persona2: " + p2.toString());
 
 Persona p3 = new Persona("Rodrigo");
 System.out.println("Persona3: " + p3.toString());
 
// Imprimimos el contador personas
System.out.println("No. Personas en total: " + Persona.getContadorPersonas() );
 
 
 }
 
}
