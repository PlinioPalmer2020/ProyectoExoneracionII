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
public class Cliente extends Persona {
    
    public Cliente(String cedula, String nombre, String genero, boolean estado) {
        super(cedula, nombre, genero, estado);
    }
    
}
