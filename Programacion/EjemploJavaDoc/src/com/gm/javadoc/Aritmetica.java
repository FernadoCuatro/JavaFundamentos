package com.gm.javadoc;

/**
 *
 * @author: Fernando Cuatro
 * @version 1.0
 */
public class Aritmetica {
 /**
  * Primer Operando
  */
 int operandoA;

 /**
  * Segundo operando
  */
 int operandoB;

 /**
  * Constructor de la clase
  * @param a Recibe el valor para el operando A
  * @param b Reciboe el valor para el operando B
  */
 public Aritmetica(int a, int b) {
     this.operandoA = a;
     this.operandoB = b;
 }

 /**
  * Este metodo realiza la suma de dos operandos enteros
  * @return int resultado de la suma 
  */
 public int sumar(){
     return operandoA + operandoB;
 }

 // @autor: Nombre del autor del programa 
 // @deprecated: Indica que el elemento es obsoleto, pertenece a versiones anterioes y no se recomienda su uso.
 // @param: Definicion de un parametro de un metodo
 // @return: Descrpcion de lo que devuelve el metodo, no se usa en contruscotres o metodos void 
 // @see: Indica que se asocia con tro metodo o clase
 // @version: Version dl metodo o clase
}
