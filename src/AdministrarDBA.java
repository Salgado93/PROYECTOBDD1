
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class AdministrarDBA {
    Connection con = DBAConexión.getConnection();
    private ArrayList<Maquina> listMaquinas = new ArrayList();

    public AdministrarDBA() {
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public ArrayList<Maquina> getListMaquinas() {
        return listMaquinas;
    }

    public void setListMaquinas(ArrayList<Maquina> listMaquinas) {
        this.listMaquinas = listMaquinas;
    }
    
    public void insertarMaquinas(int codigo_maquina,String estado_maquina, int cant_fallas) throws SQLException{
        try {
            String query = "INSERT INTO MAQUINAS"
                +"(codigo_m,estado,num_fallas)"
                +"VALUES(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, codigo_maquina);
            pst.setString(2, estado_maquina);
            pst.setInt(3, cant_fallas);
            pst.executeUpdate();
            System.out.println("Insert Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error On Insert! " + e);
        }
    }
    public void insertarComercios(int id,String zona,double cant_pago, String tipo, double recaudacion) throws SQLException{
        try {
            String query = "INSERT INTO COMERCIOS"
                +"(id_comercio,zona,cant_pagar,tipo,recaudacion)"
                +"VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, zona);
            pst.setDouble(3, cant_pago);
            pst.setString(4, tipo);
            pst.setDouble(5, recaudacion);
            pst.executeUpdate();
            System.out.println("Insert Comercio Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error On Insert! " + e);
        }
    }
    public void insertarMayoristas(int id,String zona,double cant_pago, String tipo, double recaudacion, double porcentaje, Date fecha) throws SQLException{
        try {
            String query = "INSERT INTO MAYORISTAS"
                +"(id_comercio,zona,cant_pagar,tipo,recaudacion,procentaje,fecha)"
                +"VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, zona);
            pst.setDouble(3, cant_pago);
            pst.setString(4, tipo);
            pst.setDouble(5, recaudacion);
            pst.setDouble(6, porcentaje);
            pst.setDate(7, fecha);
            pst.executeUpdate();
            System.out.println("Insert Mayorista Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error On Insert! " + e);
        }
    }
    public void insertarMinoristas(int id,String zona,double cant_pago, String tipo, double recaudacion) throws SQLException{
        try {
            String query = "INSERT INTO MINORISTAS"
                +"(id_comercio,zona,cant_pagar,tipo,recaudacion)"
                +"VALUES(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, zona);
            pst.setDouble(3, cant_pago);
            pst.setString(4, tipo);
            pst.setDouble(5, recaudacion);
            pst.executeUpdate();
            System.out.println("Insert Minorista Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error On Insert! " + e);
        }
    }  
    public void listarMaquinas(){
        try {
            Maquina maquina; 
            Statement  st = con.createStatement();
            String query = "SELECT codigo_m, estado, num_fallas FROM MAQUINAS";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                maquina = new Maquina(rs.getInt("codigo_m"),
                        rs.getString("estado"),
                        rs.getInt("num_fallas"));
                listMaquinas.add(maquina);
            }
            rs.close();
            System.out.println("Listar Exitoso!");
        } catch (Exception e) {
            System.out.println("Error en Select! "+e);
        }
    }
    
}
