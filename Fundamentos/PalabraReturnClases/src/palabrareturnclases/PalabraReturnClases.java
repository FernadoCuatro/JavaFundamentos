package palabrareturnclases;

/**
 *
 * @author user
 */
public class PalabraReturnClases {
  
  //Creamos un metodo main
  public static void main(String[] args) {
  //Creamos el objeto del metodo creaObjetoSuma();
  Suma s = creaObjetoSuma();
  //Por medio del objeto accedemos a la clse Suma para obtener a y b
  int resultado = s.a + s.b;
  System.out.println("Resultado: " + resultado);
  }
  
  //Creamos un objeto que llame a la clase Suma, que tiene un constructor
  //Y este mismo objeto devuelve la respuesta
  //Por la palabra return
  public static Suma creaObjetoSuma() {
    Suma s = new Suma(3,4);
    return s;
  }
  
}

  //Creamos la clase Suma
  //Es como que estemos en otro archivo, no lleva public
  //Porque esta clase esta dentro del archivo donde ya
  //Ya hay una clase publica
  class Suma{
    //Inicializamos las variables
    int a;
    int b;
    
    //Creamos un costructor dentro de la clase
    Suma(int a, int b){
      this.a = a;
      this.b = b;
    }
    
  }
