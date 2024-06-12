/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexoneraconii;

import Entidades.TipoCompra;
import Entidades.Vendedor;
import InterfaceGrafico.JFClienteCRUD;
import InterfaceGrafico.JFMenuInicio;
import InterfaceGrafico.JFPrincipal;
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
        //JFPrincipal principal = new JFPrincipal();
        //JFClienteCRUD principal = new JFClienteCRUD();
        JFMenuInicio principal = new JFMenuInicio();
        principal.setVisible(true);
    }
    
}
