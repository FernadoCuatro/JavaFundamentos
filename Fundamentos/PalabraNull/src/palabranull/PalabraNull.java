package palabranull;

/**
 *
 * @author FernandoCuatro
 */
public class PalabraNull {

 public static void main(String[] args) {
 Persona p1 = new Persona("Elizabeth");
 System.out.println("Nombre p1: " + p1.obtenerNombre());
  
 Persona p2 = p1; // p2 apunta al mismo objeto que p1
 System.out.println("Nombre p2: " + p2.obtenerNombre());

 // Hacemos que p1 ya no apunte al objeto p1
 // La palabra null la utilizamos solo en las variables tipo object 
 p1 = null;
 
// Comprobamos que el p2 sigue accediendo al objeto
System.out.println("Nombre p2: " + p2.obtenerNombre());

// La siguiente line marca error de tipo NullPointerException
//System.out.println("Nombre p1: " + p1.obtenerNombre());
// Solo en caso de que no sea nulo podemos utilizae este metodo en esta variable

  if (p1 != null) {
   System.out.println("Nombre p1: " + p1.obtenerNombre());
  }

 }
 
}

class Persona{
 String nombre; // Atributo de la clase persona
 
 //Constructor de la clase
 public Persona(String nombre){
  this.nombre = nombre;
 }

 // Metodo para obtener el valor del nombre
 public String obtenerNombre(){
  return this.nombre; // Utilizamos el this, es opcional
 }
 
}