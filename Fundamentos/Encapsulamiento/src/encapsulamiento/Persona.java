package encapsulamiento;

/**
 *
 * @author FernandoCuatro
 */
public class Persona {
// Constructor Vacio
 public Persona(){}
 
// Constructor con 3 argumentos
 public Persona(String nombre, String apellido, boolean borrado){
  this.nombre = nombre;
  this.apellido = apellido;
  this.borrado = borrado;
 }
 
// Atributos de la clase
 private String nombre;
 private String apellido;
 private boolean borrado;
 
// Metodos publicos para acceder y/o modificar los atributos
 public String getNombre(){
  return nombre;
 }
 public void setNombre(String nombre){
  this.nombre = nombre;
 }
 
 public String getApellido(){
  return apellido;
 }
 public void setApellido(String apellido){
  this.apellido = apellido;
 }
 
 public boolean isBorrado(){
  return borrado;
 }
 public void setBorrado(boolean borrado){
  this.borrado = borrado;
 }
 
// Metodo que imprime el estado del objeto
 @Override // Significa sobre escritura
 // Con la toString nos ahorramos de mandar a llamar este objeto, que seria asi:
 // print(p.toString());
 // Si no que seria automaticamente con solo mandar a llamar la variable del
 // objeto que seria print(p);
 public String toString(){
  return "Persona[nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado + "]";
 }
 
}
