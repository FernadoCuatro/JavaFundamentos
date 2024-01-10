package aritmetica;

/**
 *
 * @author user
 */
public class Aritmetica {
//  Atributos de la clase
int a, b; 

//  Constructor vacio
//  Recordar que si agregamos un constructor distinto al vacio 
//  Ya no se crea este constructor y nosotros debemos crearlo si necesitamos
Aritmetica(){}

//Constructor con dos argumentos 
Aritmetica(int a, int b) {
//Usamos el operador this

// Si notamos, es el mismo identificador de las variables de clases y las variables locales
// Con el this hacemos referencia a la variables de clase, pero con el = a
// estamos declarando que tiene que utilizar las varibales locales del constructor

  this.a = a;
  this.b = b;
}

//  Este metodo toma los atributos de la clase para hacer sumams
int sumar(){
  return a + b;
}

//  Metodo restar 
int restar(){
  return a - b;
}

// Metodo multiplicar
int multiplicar(){
  return a * b;
}

//Metodo dividir
int dividir(){
  return a / b;
}


}
