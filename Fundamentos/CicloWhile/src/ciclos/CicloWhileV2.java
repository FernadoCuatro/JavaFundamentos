package ciclos;

import java.util.Scanner;

/**
 *
 * @author Fernando Cuatro
 */
public class CicloWhileV2 {
    
    public static void main(String[] args) {
        System.out.println("Por favor introduce el Numer de elementos a Iterar: ");
        int MaxElementos;
        Scanner entradaEscaner = new Scanner(System.in); //Creamos el objeto Scanner para ller datos
        MaxElementos = entradaEscaner.nextInt(); //Leremos el valor proporcionado por el usuario
        int contador = 1; //Inicializamos el contador 
        
        while (contador <= MaxElementos) { 
            System.out.println("Contador = " + contador);
            contador++;
        }
        
    }
    
}
