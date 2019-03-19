
import java.sql.CallableStatement;
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
    
    /*public void insertarMaquinas(int codigo_maquina,String estado_maquina, int cant_fallas) throws SQLException{
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
    }*/
    public void insertDistribucion(int codigo_m, int id_comercio){
        try {
            String query = "INSERT INTO DISTRIBUCION"
                +"(codigo_m,id_comercio)"
                +"VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, codigo_m);
            pst.setInt(2, id_comercio);
            pst.execute();
            System.out.println("Distribucion Agregada ");
        } catch (Exception e) {
            System.out.println("Error en Insertar Distribucion!" + e);
        }
    }
    public void insertSuministra(int id_pieza, int id_proveedor){
        try {
            String query = "INSERT INTO SUMINISTRA"
                +"(id_pieza,id_proveedor)"
                +"VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id_pieza);
            pst.setInt(2, id_proveedor);
            pst.execute();
            System.out.println("Suministra Agregado!");
        } catch (Exception e) {
            System.out.println("Error en Insertar Suministra!" + e);
        }
    }
    public void insertMaquina(int codigo_maquina,String estado_maquina, int cant_fallas){
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call insertMaquina(?,?,?)}");
            cst.setInt(1, codigo_maquina);
            cst.setString(2, estado_maquina);
            cst.setInt(3, cant_fallas);
            cst.execute();
            System.out.println("Insert Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error en Procedimiento insertarMaquina! " +e);
        }
    }
    /*public void insertarComercios(int id,String zona,double cant_pago, String tipo, double recaudacion) throws SQLException{
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
    }*/
    public void insertComercio(int id,String zona,double cant_pago, String tipo, double recaudacion, double porcentaje2, Date Fecha){
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call insertComercio(?,?,?,?,?,?,?)}");
            cst.setInt(1,id);
            cst.setString(2, zona);
            cst.setDouble(3, cant_pago);
            cst.setString(4, tipo);
            cst.setDouble(5, recaudacion);
            cst.setDouble(6, porcentaje2);
            cst.setDate(7, Fecha);
            cst.execute();
            System.out.println("Insert Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error en Procedimeinto insertComercio! " +e);
        }
    }
    /*public void insertarMayoristas(int id,String zona,double cant_pago, String tipo, double recaudacion, double porcentaje, Date fecha) throws SQLException{
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
    }*/
    /*public void insertarMinoristas(int id,String zona,double cant_pago, String tipo, double recaudacion) throws SQLException{
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
    }*/
    /*public void insertarProveedores(int id_proveedor, String nombre_proveedor){
        try {
            String query = "INSERT INTO PROVEEDORES"
                +"(id_proveedor,nombre_proveedor)"
                +"VALUES(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id_proveedor);
            pst.setString(2, nombre_proveedor );
            pst.executeUpdate();
            System.out.println("Insert Proveedor Exitoso!");
        } catch (Exception e) {
            System.out.println("Error On Insert: " +e);
        }
    }*/
    public void insertProveedor(int id_proveedor, String nombre_proveedor){
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call insertProveedor(?,?)}");
            cst.setInt(1, id_proveedor);
            cst.setString(2, nombre_proveedor);
            cst.execute();
            System.out.println("Insert Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error en Procedimiento insertProveedor! "+e);
        }
    }
    /*public void insertarTecnicos(int id_tecnico, int codigo_m, int reparaciones){
        try {
            String query = "INSERT INTO TECNICOS"
                +"(id_tecnico,codigo_m,num_reparaciones)"
                +"VALUES(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id_tecnico);
            pst.setInt(2,codigo_m);
            pst.setInt(3, reparaciones);
            pst.executeUpdate();
            System.out.println("Insert Tecnico Exitoso!");
        } catch (Exception e) {
            System.out.println("Error On Insert: " +e);
        }
    }*/
    public void insertTecnico(int id_tecnico, int codigo_m, int reparaciones){
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call insertTecnico(?,?,?)}");
            cst.setInt(1, id_tecnico);
            cst.setInt(2, codigo_m);
            cst.setInt(3, reparaciones);
            cst.execute();
            System.out.println("Insert Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error en Procedimiento insertTecnico! "+e);
        }
    }
    public void insertPieza(int id_pieza, int cod_maquina, String tipo_pieza,int numero_placa, int numero_carcasa){
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call insertPieza(?,?,?,?,?)}");
            cst.setInt(1, id_pieza);
            cst.setInt(2, cod_maquina);
            cst.setString(3, tipo_pieza);
            cst.setInt(4, numero_placa);
            cst.setInt(5, numero_carcasa);
            cst.execute();
            System.out.println("Insert Exitoso! ");
        } catch (Exception e) {
            System.out.println("Error en Procedimiento insertarPieza! "+e);
        }
    }
    public void listarMaquinas(){
        try {
            Maquina maquina; 
            listMaquinas=new ArrayList();
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
