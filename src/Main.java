
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Main {
     public static void main(String[] args) {
         //Listar Elementos de TABLA MAQUINAS
         /*try {
             Connection con = DBAConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM MAQUINAS");
             while(rs.next()){
                 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
             }
             rs.close();
             st.close();
         } catch (Exception e) {
         }*/
         //Listar Maquinas Desde Clase Administradora
         /*AdministrarDBA base = new AdministrarDBA();
         base.listarMaquinas();
         for (Maquina m : base.getListMaquinas()) {
             System.out.println("Maquina: " +m);
         }*/
         //INSERTA MAQUINAS A LA BASE
         /*AdministrarDBA base = new AdministrarDBA();
         try {
             base.insertarMaquinas(10,"MALA",8);
         } catch (Exception e) {
         }*/
         AdministrarDBA base = new AdministrarDBA();
         /*try {
            System.out.println("Entro ");
            base.insertarComercios(10, "Centro", 300.00, "Mayorista",10.00);
            base.insertarMayoristas(10, "Centro", 300.00, "Mayorista", 10.00, 5, null);
            System.out.println("Agregado");
         } catch (Exception e) {
             System.out.println("e = " + e);
         }*/
         /*base.listarMaquinas();
         try {
             for (Maquina m : base.getListMaquinas()) {
                 System.out.println("maquina = " + m);
             }
         } catch (Exception e) {
         }*/
         //base.insertMaquina(8, "F", 0);
         //base.insertComercio(8, "Centro", 0,"Mino", 0, 0, null);
         //base.insertTecnico(8, 3, 0);
         //base.insertProveedor(8, "Salgado");


         
         
         
    }
}
