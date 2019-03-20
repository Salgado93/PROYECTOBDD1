
/*
1.Load and registrer driver.
2. Create Connection.
3. Create Statement
4. Execute the query
5. Process the results
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBAConexión {
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String myDB="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con = DriverManager.getConnection(myDB,"system","Contrasena1");
            System.out.println("Conexión Exitosa!");
            return con;
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("No hubo conexión!");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DBAConexión.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hay errores!");
        }
        return null;       
    }
}
