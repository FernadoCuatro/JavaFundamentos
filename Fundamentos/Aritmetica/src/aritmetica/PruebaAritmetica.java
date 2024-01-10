package aritmetica;

/**
 *
 * @author user
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
    //Creamos el objeto de la clase aritmetica, creamos el objeto de tipo aritmetica
    Aritmetica a = new Aritmetica();
    
    //Llamamos el metodo sumar y recibimos el valor devuelto
    int resultado = a.sumar(4, 4);
    
    //Imprimimos los datos de los valores a sumar
    System.out.println("Los resultados: " + resultado);
    }
    
}
