/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexoneraconii;

import InterfaceGrafico.JFMenuInicio;


public class ProyectoExoneraconII {


    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
   if (i % 2 == 0) {
       continue;
   }
   System.out.println(i);
}
        JFMenuInicio principal = new JFMenuInicio();
        principal.setVisible(true);
    }
    
}
