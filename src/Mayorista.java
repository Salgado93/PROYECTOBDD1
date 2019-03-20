
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Mayorista extends Comercio {
    private double porcentaje;
    private Date fecha;

    public Mayorista() {
    }

    public Mayorista(int id_comercio, String zona, float cant_pagar, String tipo, float recaudacion,float porcentaje, Date fecha) {
        super(id_comercio, zona, cant_pagar, tipo, recaudacion);
        this.porcentaje = porcentaje;
        this.fecha = fecha;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ID Comercio: " +super.getId_comercio()
                +" ZONA: " +super.getZona()
                +" Cantida a Pagar: " +super.getCant_pagar()
                +" Tipo: " +super.getTipo()
                +" Recaudacion: " +super.getRecaudacion()
                +" Porcentaje: " +porcentaje
                +" Fecha: " +fecha;
    }
}
