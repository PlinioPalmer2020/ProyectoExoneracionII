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
    private String  Genero;
    private boolean Estado;

    public Persona() {
    }
    
    
    public Persona(String cedula, String nombre, String genero, boolean estado){
        this.Genero = genero;
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Estado = estado;
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
