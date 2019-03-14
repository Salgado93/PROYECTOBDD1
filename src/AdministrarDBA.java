
import java.sql.Connection;
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
        try {
            con.commit();
        } catch (Exception e) {
            System.out.println("Error En Commit! " +e);
        }
        try {
            con.close();
        } catch (Exception e) {
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
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    
}
