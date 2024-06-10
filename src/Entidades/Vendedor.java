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

    public Vendedor(String cedula, String nombre, String genero, boolean estado, String rol, String pass) {
        super(cedula, nombre, genero, estado);
        Pass = pass;
        Rol = rol;
    }

    public Vendedor(String cedula, String nombre, String genero, boolean estado, String rol) {
        super(cedula, nombre, genero, estado);

        Rol = rol;
    }

    public Vendedor(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
