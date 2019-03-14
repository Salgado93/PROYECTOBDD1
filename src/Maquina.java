/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsalg
 */
public class Maquina {
    int codigo;
    String estado;
    int num_fallas;

    public Maquina() {
    }
    public Maquina(int codigo, String estado, int num_fallas) {
        this.codigo = codigo;
        this.estado = estado;
        this.num_fallas = num_fallas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNum_fallas() {
        return num_fallas;
    }

    public void setNum_fallas(int num_fallas) {
        this.num_fallas = num_fallas;
    }

    @Override
    public String toString() {
        return "Maquina{" + "codigo=" + codigo + ", estado=" + estado + ", num_fallas=" + num_fallas + '}';
    }
    
    
    
}
