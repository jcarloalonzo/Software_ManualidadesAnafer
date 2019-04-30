
package Proyecto;
import java.sql.*;

public class Conexion {
    private Connection conexion;
     
public Connection getConexion(){
       return conexion;
   }
public void setConexion(Connection conexion){
       this.conexion=conexion;
   }
public Conexion conectar(){
    String usuario="system";
    String password="oracle";
    String ssid="bbdd01";
    String host="localhost";
    int puerto=1521;
    String cadenaDeConexion;
    cadenaDeConexion="jdbc:oracle:thin:@"+host+":"+puerto+":"+ssid;
    try(
            Connection miConexion=DriverManager.getConnection(cadenaDeConexion,usuario,password);
            ){
        System.out.println("conexion realidad bien");
    }
    catch(SQLException e)
    {
        System.out.println("Se a encontado un error:  "+e);   
    }
return this;
}
}
