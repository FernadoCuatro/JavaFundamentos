package encapsulamiento;

/**
 *
 * @author FernandoCuatro
 */
public class Encapsulamiento {

 public static void main(String[] args) {
// Creamos el objeto
 Persona p1 = new Persona("Estefany", "Ramirez", false);
// Accedemos al atributo nombre
  System.out.println("Nombre de p1: " + p1.getNombre() );

// Creamos el segundo objeto
 Persona p2 = new Persona("Fernado", "Cuatro", false);
// Imprimiemos el estado completo deo objeto
 System.out.println("Estado objeto p2: " + p2); //Aca se manda a llamar el metodo toString que sobre escribimos

// Marcamos como elimiada a la persona
 p2.setBorrado(true);
// Imprimimos el estado completo del  objeto
 System.out.println("Estado objeto p2: " + p2);

// Creamos un tercer objeto vacio
 Persona p3 = new Persona();
// Imprimimos el estado completo del objeto
 System.out.println("Estado del objeto p3: " + p3);
 }
 
}
