/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

/**
 *
 * @author plini
 */
public class Persona {
    private String  Cedula;
    private String  Nombre;
    private String  Direccion;
    private String  Genero;
    private boolean Estado;

    public Persona() {
    }

    public Persona(String Cedula, String Nombre, String Direccion, String Genero, boolean Estado) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Genero = Genero;
        this.Estado = Estado;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
   
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public boolean isEstado() {
        return Estado;
    }
    
    
}
