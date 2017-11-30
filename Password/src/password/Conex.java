/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package password;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author HAROLD
 */
public class Conex {
    
    public Conex(String login,String password){
    
     String CONTROLADOR="com.mysql.jdbc.Driver";
     String URL_BASEDATOS="jdbc:mysql://localhost/interfaz";
     
    String Usuario="root";
    String Contrase="";
    Connection conexion=null;
    Statement Instruccion=null;
    
    try{
    
 Class.forName(CONTROLADOR);
conexion=DriverManager.getConnection(URL_BASEDATOS,"root","");
if(conexion!= null){

     JOptionPane.showMessageDialog(null,"conexion exitosa");
     


}
 Instruccion=conexion.createStatement();
 Instruccion.execute("INSERT INTO usuario VALUES(null,'"+login+"','"+password+"')");
 
 JOptionPane.showMessageDialog(null,"insercion exitosa");
    
    }
    catch (ClassNotFoundException| SQLException e){   
        e.printStackTrace();
    
    
    }finally{
        
        try{
            Instruccion.close();
           conexion.close();
           }catch (Exception e){
               
            JOptionPane.showMessageDialog(null,"Por favor encienda la base de datos");
           e.printStackTrace();
}

}
    }
}