package ejemploherencia;

/**
 *
 * @author FernandoCuatro
 */
public class EjemploHerencia {

 public static void main(String[] args) {
 //Objeto de la clase Empleado
 Empleado e1 = new Empleado("Ana", 3500);
 System.out.println("Imprimos el objeto del Empleado 1");
 System.out.println(e1);
 
 //Objeto 2 de la clase empleado asociado con objetos de la clase Persona
 Empleado e2 = new Empleado("Estefany", 1500);
 e2.setEdad(23);
 e2.setGenero('F'); //Los char se pasan por comillas simples
 e2.setDireccion("Cuidad Barrios, San Salvador");
 System.out.println("\nImprimimos el objeto Empleado 2");
 System.out.println(e2);
 
 //Al crear un nuevo objeto de java.util.Date nos regresa la fecha actual
 //Objeto de la clase Cliente
 //Creamos el tipo objeto Date y la enviamos por parametros para rescatar la date actual
 Cliente c1 = new Cliente(new java.util.Date(), false);
 System.out.println("\nImprimimos el objeto de cliente 1");
 System.out.println(c1);

 //el mismo objeto c1 de la clase Cliente asociado con objetos de la clase Persona
 c1.setNombre("Fernando");
 c1.setEdad(20);
 c1.setGenero('M');
 c1.setDireccion("Lourdes Colon, La Libertad");
 System.out.println("\nVolvemos a imprimir el objeto cliente 1");
 System.out.println(c1); 
 
 }
}
