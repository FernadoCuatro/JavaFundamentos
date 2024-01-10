package aritmetica;

/**
 *
 * @author user
 */
public class PruebaAritmetica {
  public static void main(String[] args) {
//Variables locales o de la clase
int OperadorA = 6;
int OperadorB = 2;

//Creamos un objeto de la clase Aritmetica, enviando argumentos
Aritmetica objeto1 = new Aritmetica(OperadorA, OperadorB);

//Imprimir operandos 
System.out.println("OperadorA: "+ OperadorA + " y operadorB: " + OperadorB);

//Resultado de la suma
System.out.println("\nResultado suma: " + objeto1.sumar() );

//Resultado de la resta
System.out.println("\nResultado resta: " + objeto1.restar() );

//Resultado de la multiplicacion
System.out.println("\nResultado multiplicacion: " + objeto1.multiplicar() );

//Resultado de la division
System.out.println("\nResultado division: " + objeto1.dividir() );

  }

//void otroMetodo(){
//  No se puede acceder a una variable local declarada en otro metodo
//System.out.println("Valor Operador A" + OperadorA);
//}
 
}