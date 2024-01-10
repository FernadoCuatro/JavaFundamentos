package ejemploherencia;

/**
 *
 * @author FernandoCuatro
 */
public class Persona { // Definicion de la clase padre, porque  no tiene extends de ningun lado.

 //Atributos de la clase padre
 private String nombre;
 private char genero;
 private int edad;
 private String direccion;
 
 //Constructor vacio o por omision
 public Persona(){}
 //Constructor con un argumento
 public Persona(String nombre){
  this.nombre = nombre;
 }
 //Costructor completo
 public Persona(String nombre, char genero, int edad, String direccion){
  this.nombre = nombre;
  this.genero = genero; // M = Masculino, F = Femenino
  this.edad = edad;
  this.direccion = direccion;
 }
 
 //Metodos de modificador de acceso
 public String getNombre(){
  return nombre;
 }
 public void setNombre(String nombre){
 this.nombre = nombre;
 }
 //
 public char getGenero(){
 return genero;
 }
 public void setGenero(char genero){
  this.genero = genero;
 }
 //
 public int getEdad(){
  return edad;
 }
 public void setEdad(int edad){
  this.edad = edad;
 }
 //
 public String getDireccion(){
  return direccion;
 }
 public void setDireccion(String direccion){
 this.direccion = direccion;
 }

 //Sobre escribrimos el metodo toString() de la clase object
 //Para esto utilizamos el @Override
 //Para darle indicaciones que la sobreescribimos
 @Override //Over raid 
 public String toString(){
  return "Persona [nombre: " + nombre + ", genero: " + genero + ", edad: " + edad + ", direccion: " + direccion + "]"; 
 }
 
 
}
