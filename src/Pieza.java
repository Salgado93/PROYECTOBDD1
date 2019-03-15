/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Pieza {
    private int id_pieza;
    private int codigo_m;

    public Pieza() {
    }

    public Pieza(int id_pieza, int codigo_m) {
        this.id_pieza = id_pieza;
        this.codigo_m = codigo_m;
    }

    public int getId_pieza() {
        return id_pieza;
    }

    public void setId_pieza(int id_pieza) {
        this.id_pieza = id_pieza;
    }

    public int getCodigo_m() {
        return codigo_m;
    }

    public void setCodigo_m(int codigo_m) {
        this.codigo_m = codigo_m;
    }

    @Override
    public String toString() {
        return "Pieza{" + "id_pieza=" + id_pieza + ", codigo_m=" + codigo_m + '}';
    }
}
