package personas;
/**
 *
 * @author Fernando Cuatro
 */

// Una clase es una plantilla
//No hay un objeto Main para 
//Y se necesira crear un objeto de esta clase para ejecutarlo

public class Persona {
    //Atributos de una clase
    //No es necesario asignar valores
    String nombre;
    String aprellidoPaterno;
    String apellidoMaterno;
    
    //Metodos de la clase
    //Los usaran los objetivos de esta clase
    public void desplegarNombre(){
        System.out.println("Nombre = " + nombre); //Este es un atributo que ya esta declara arriba en la linea 16
        System.out.println("Apellido Paterno = " + aprellidoPaterno);
        System.out.println("Apellido Materno = " + apellidoMaterno);
    }
}
