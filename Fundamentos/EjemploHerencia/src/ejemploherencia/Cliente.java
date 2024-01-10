package ejemploherencia;
import java.util.Date;
/**
 *
 * @author FernandoCuatro
 */
public class Cliente extends Persona{ //Clase de segunda de la clase Persona, estamos heredando los atributos y los metodos

//Atributos de la clase
 public int idCliente;
 private java.util.Date fechaRegistro; //es del tipo Date para el manejo de fechas en java
 private boolean vip;
 private static int contadorClientes;
 
 //Constructor de la clase
 public Cliente(Date fechaRegistro, boolean vip){
 this.idCliente = ++contadorClientes;
 this.fechaRegistro = fechaRegistro;
 this.vip = vip;
 }
 
 //Metodos accesores para las variables privadas
 public int getIdCliente(){
  return idCliente;
 }
 
 public Date getFechaRegistro(){
  return fechaRegistro;
 }
 
 public boolean isVip(){
  return vip;
 }
 public void setVip(boolean vip){
  this.vip = vip;
 }
 
 //Sobre escribimos con @Override, y si es Over raid 
 @Override
 public String toString(){
 //Primero mandamos a llamar el metodo toString de la clase Persona
 //para  que podamos observar los valores de la clase padre
 //y despues imprimimos los valore sde la case hija
 return super.toString() + " cliente(Identificador Cliente: " + idCliente + ", fecha de registro: " + fechaRegistro + ", vip: " + vip + ")";
 }
 
}
