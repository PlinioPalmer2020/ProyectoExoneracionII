/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexoneraconii;

import Entidades.Vendedor;
import Repositorios.CVendedorRepositorio;
import java.util.ArrayList;

/**
 *
 * @author plini
 */
public class ProyectoExoneraconII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CVendedorRepositorio repo = new CVendedorRepositorio();
        
        //CREAR VENDEDOR
        //String cedula, String nombre, String genero, boolean estado, String rol, String pass
        //Vendedor ven = new Vendedor("00000000000","Maxwell M","Masculino",true,"ADMIN","123456");
        
        System.out.println(repo.Eliminar("00000000000")); 
        
        //System.out.println(repo.Crear(ven));
        //Vendedor persona = repo.Get("40238830059");
        //System.out.println(persona.getNombre());
        
        //ArrayList<Vendedor> lista = repo.Get(); 
        
        //for (Vendedor persona : lista) {
         //   System.out.println(persona.getCedula());
       // }
 
    }
    
}
