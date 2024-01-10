
package ejemplostatic;

/**
 *
 * @author FernandoCuatro
 */
public class Persona {
// Atributos de la clase, todos privados solo un static
 private String nombre;
 private int idPersona;
// Esta variable se asocia a la clase y no a los objetos que se creeen de esta clase
 private static int contadorPersonas;
 
// Definimos el constructor de la clase
 public Persona(String nombre){
// Cada que creamos un objeto persona incrementamos el contador
// Para obtener un nuevo idPersona;
 contadorPersonas++;
 
// Asignamos el nuevo valor al idPersona
 idPersona = contadorPersonas;

// Asignamos el nombre recibido
 this.nombre = nombre;
 }

// Metodo para mostrar los datos
 public String toString(){
  return "Persona[idPersona: "+ idPersona + ", nombre: "+ nombre +"]";
 }
 
// Metodo Static que nos muestra el numero de personas en total
 public static int getContadorPersonas(){
  return contadorPersonas;
 }
 
}