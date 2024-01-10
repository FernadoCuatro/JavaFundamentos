package palabrathis;

/**
 *
 * @author FernandoCuatro
 */
public class PalabraThis {

// Creamos el metodo main
 public static void main(String[] args) {
// Creamos un objeto llamado persona que apunta a la clase persona
  Persona p = new Persona("Estefany");
 }

}

class Persona{
 String nombre; // Atributo de la clase
 
 Persona(String nombre){
  this.nombre = nombre; // this es el objeto Persona (El actual)
  
// Imprimimos el objeto perosa
// Creamos un nuevo objeto con otra clase
 Imprimir i = new Imprimir();
 i.imprimir(this); // this es el objeto Persona (actual, el de arriba)
 }
 
}

class Imprimir{
 
// Creamos un metodo para imprimir el objeto persona
 public void imprimir(Object o){ // El parametro se declara como Object | Object o = p
  // la clase Object nos sirve como una calse comodin para recibir cualquier tipo de 
  // java como argumento, por eso podemos utilizar el tipo Object
  // para recibir como argumento cualquier objeto en java
  System.out.println("Imprimir parametro: " + o); // El parametro es el objeto persona
  System.out.println("Imprimimos el objeto actual (this): " + this); //this es el objeto a escribir
 }
 
}
