package personas;

/**
 *
 * @author user
 */
public class PersonaPrueba {
    public static void main(String[] args) {
    //Creamos el primer objeto
    Persona p1 = new Persona();
    // La primera y la ultima, son el mismo nombre de la clase plantilla que estamos tomando.
    // Y tambien sabemos que 'p1' es la variable donde la vamos a almacenar.

    //Llamamos al metodo del objeto creado
    System.out.println("Valores por default del objeto persona:");
    p1.desplegarNombre();
    
    //Modificamos lo valores
    p1.nombre = "Ana";
    p1.aprellidoPaterno = "Avendanio";
    p1.apellidoMaterno = "Rivera";
    
    //Volvemos a llamar al objeto ya con los valores modificados
    System.out.println("\nNuevos valosres del objeto persona");
    p1.desplegarNombre();
    }
    
}
