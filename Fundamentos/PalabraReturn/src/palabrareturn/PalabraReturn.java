package palabrareturn;

/**
 *
 * @author user
 */
public class PalabraReturn {

  public static void main(String[] args) {
    int resultado = suma(4,123);
    System.out.println("Resultado: " + resultado);
  }
  
  public static int suma(int a, int b) {
  if (a==0 && b==0) {
    System.out.println("Puede proporcionar valores distintos a Cero");
    return 0;
  }
  return a + b;
  }
  
}
