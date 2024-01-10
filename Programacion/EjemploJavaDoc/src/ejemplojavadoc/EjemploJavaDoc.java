package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;
/**
 * Clase para porbar el concepto de JavaDoc
 * @author Fernando
 * @version 1.0
 */
public class EjemploJavaDoc {

/**
 * Metodo que ejecuta la peuva de la calse aritmetica 
 * @param args argumentos de la linea de comandos
 */
public static void main(String[] args) {
 int resultado = new Aritmetica(3, 2).sumar();

 System.out.println("Resultado: " + resultado);
 
 // Snippers
 System.out.println("");

}


}
