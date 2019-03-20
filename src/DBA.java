/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class DBA {

    public static Connection cn;
    public static Statement st;
    public static ResultSet rs;

    public Statement conectar() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String driver = "jdbc:oracle:thin:@localhost:1521:orcl";
            cn = DriverManager.getConnection(driver, "SYSTEM", "Contrasena1");
            st = cn.createStatement();
            return st;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public LinkedList<String> query(String from) {
        try {
            st = conectar();
            rs = st.executeQuery(from);
            LinkedList result=new LinkedList();
            while(rs.next()){
                for (int i = 1; i <rs.getMetaData().getColumnCount() ; i++) {
                     result.add(rs.getString(i));
                }
            }
            return result;
        } catch (Exception e) {
            return null;
        }

    }

    public void desconectar() {
        try {
            st.close();
            cn.close();
        } catch (Exception e) {
        }
    }

    public void commit() {
        try {
            try {
                cn.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
     
  
}
