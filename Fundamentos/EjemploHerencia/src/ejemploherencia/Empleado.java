package ejemploherencia;

/**
 *
 * @author FernandoCuatro
 */
public class Empleado extends Persona { //Clase de segunda, porque extendemos de la clase Persona que es la padre
                                        //Estamos heredando los atributos y los metodos de la calse persona, los que sean public
//Atributos de la clase
 private int idEmpleado;
 private double sueldo;
 private static int contadorEmpleados;

//Constructor personalizado con nombre y sueldo
 public Empleado(String nombre, double sueldo){
  super(nombre); //Siempre super debe de ir en la primera linea, con este Super mandamos a traer al constructor que recibe una cadena 
  //traemos el dato del nombre que obtenemos delclase padre que seria persona
  this.idEmpleado = ++contadorEmpleados; //A la variable de idEmpleado le damos un valor automatico autoincrementable
// Operador de pre incremento con el ++, ahora mismo esta en 0
  //Pero con la primera ves que se manda a llamar estara en uno automaticamente, de ahi 2, 3, N.
  this.sueldo = sueldo;
 }
 
//Metodos accesores
 public int getIdEmpleado(){
  return idEmpleado;
 }
 //No tenemos set porque le estamos estableciendo un valor por defecto 
 //Por esa misma razon queremos obtenerla, no establecerla 
 
 public double getSueldo(){
  return sueldo;
 }
 public void setSueldo(double sueldo){
  this.sueldo = sueldo;
 }
 
//Sobre escribimos con @Override, y si es Over raid 
@Override
 public String toString(){
 // Primero mandamos a llamar el metodo toString de la clase persona, lo hacemos con super 
 // para que podamos observar los valores de la clase padre
 // y despues concatenamos e imprimimos los valores de la clase hija
 return super.toString() + " Empleado(Identificador Empleado: " + idEmpleado + ", sueldo: " + sueldo +")";
 
 }

}
