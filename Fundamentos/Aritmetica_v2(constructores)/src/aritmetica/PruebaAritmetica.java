package aritmetica;

/**
 *
 * @author FernandoCuatro
 */
public class PruebaAritmetica {
    public static void main(String[] args) {

    //Creamos el objeto de la clase aritmetica, creamos el objeto de tipo aritmetica con el constructor vacio
    Aritmetica obj1 = new Aritmetica();
    
    //Llamamos el metodo sumar y recibimos el valor devuelto
    int resultado = obj1.sumar(5,4);
    
    System.out.println("Resultado de la suma directa obj1: " + resultado);
    
    //Si llamamos directamente el metodo sumar sin argumentos
    //El valor es cero, ya que los atributos del objeto nunca se inicializaron 
    //Ya que no se uso el constructor con argumentos, si no el constructor vacio
    System.out.println("Resultado suma atributos obj1: " + obj1.sumar() );
    
    //Ahora creamos un objeto con el constructor con dos argumentos
    Aritmetica obj2 = new Aritmetica(2,1);
    
    //Imprimimos directamente el resultado
    //Al llenar directamente al metodo suma, nos regresa el valor de la suma
    System.out.println("\nResultado suma atributos obj2: " + obj2.sumar() );
    
    }
    
}