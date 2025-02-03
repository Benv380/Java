package Controller;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author benja
 */

public class Bd_conecction {

        public Bd_conecction() {
        }

        public void conectarMysql(){
            Connection conexion = null;

            try{
                System.out.println("1");
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("2");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Concesionario", "root", "");
                System.out.println("3");
                System.out.println("Conexion exitosa");

            }
            catch( Exception ex){
                System.out.println(ex.getMessage());
            }


        }


    }

