/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Minorista extends Comercio {

    public Minorista() {
    }

    public Minorista(int id_comercio, String zona, double cant_pagar, String tipo, double recaudacion) {
        super(id_comercio, zona, cant_pagar, tipo, recaudacion);
    }

    @Override
    public String toString() {
        return "ID Mayorista: "+super.getId_comercio()
                +" Zona: "+super.getZona()
                +" Cantida de Pago: "+super.getCant_pagar()
                +" Tipo: "+super.getTipo()
                +" Recaudacion: "+super.getRecaudacion();
    }
    
}
