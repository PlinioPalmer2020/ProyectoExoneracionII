/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author plini
 */
public class Producto {

    public Producto(String Nombre, double PrecioUnitario, boolean Estado) {
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
        this.Estado = Estado;
    }
    private String  Nombre;
    private double PrecioUnitario;
    private boolean Estado;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
