/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import AbstractClasses.Persona;

/**
 *
 * @author plini
 */
public class Vendedor extends Persona {

    private String Rol;
    private String Pass;

    public Vendedor() {

    }

    public Vendedor(String Rol, String Cedula, String Nombre, String Direccion, String Genero, boolean Estado) {
        super(Cedula, Nombre, Direccion, Genero, Estado);
        this.Rol = Rol;
    }

    public Vendedor(String Rol, String Pass, String Cedula, String Nombre, String Direccion, String Genero, boolean Estado) {
        super(Cedula, Nombre, Direccion, Genero, Estado);
        this.Rol = Rol;
        this.Pass = Pass;
    }

    public Vendedor(String Cedula, String Nombre, String Direccion, String Genero, boolean Estado) {
        super(Cedula, Nombre, Direccion, Genero, Estado);
    }

   
    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

}
