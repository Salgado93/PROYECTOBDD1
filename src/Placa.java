/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Placa extends Pieza {

    public Placa() {
    }

    public Placa(int id_pieza, int codigo_m) {
        super(id_pieza, codigo_m);
    }

    @Override
    public String toString() {
        return "ID Placa: "+super.getId_pieza();
    }
}
