/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Comercio {
    private int id_comercio;
    private String zona;
    private double cant_pagar;
    private String tipo;
    private double recaudacion;

    public Comercio() {
    }

    public Comercio(int id_comercio, String zona, double cant_pagar, String tipo, double recaudacion) {
        this.id_comercio = id_comercio;
        this.zona = zona;
        this.cant_pagar = cant_pagar;
        this.tipo = tipo;
        this.recaudacion = recaudacion;
    }
    public int getId_comercio() {
        return id_comercio;
    }

    public void setId_comercio(int id_comercio) {
        this.id_comercio = id_comercio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getCant_pagar() {
        return cant_pagar;
    }

    public void setCant_pagar(double cant_pagar) {
        this.cant_pagar = cant_pagar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    @Override
    public String toString() {
        return "Comercio{" + "id_comercio=" + id_comercio + ", zona=" + zona + ", cant_pagar=" + cant_pagar + ", tipo=" + tipo + ", recaudacion=" + recaudacion + '}';
    } 
}
