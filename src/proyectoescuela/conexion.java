package proyectoescuela;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    
  public conexion() {
      
  }
  public static Connection abrir_conexion() throws Exception{
    try{
        Connection coneccion=null;
        Class.forName ("com.mysql.jdbc.Driver").newInstance();
        String url="jdbc:mysql://localhost/escuela";
        String login = "root";
        String password = "root";
        coneccion = DriverManager.getConnection(url,login,password);
        return coneccion;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        throw e;
    }
    }
}