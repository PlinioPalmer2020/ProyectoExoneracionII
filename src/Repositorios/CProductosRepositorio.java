/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Producto;
import Interfaces.ICRUDDB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author plini
 */
public class CProductosRepositorio implements ICRUDDB<Producto> {

    CConexion _conexion = null;

    public CProductosRepositorio() {
        _conexion = new CConexion();
    }

    @Override
    public int Crear(Producto entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto Get(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> Get() {
        ArrayList<Producto> listProducto = new ArrayList<>();

        String Sql = "SELECT * FROM Producto WHERE Estado = 'true';";

        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                Producto producto;
                //String cedula, String nombre, String genero, boolean estado, String rol
                producto = new Producto(
                        rs.getString("Nombre"),
                        rs.getDouble("PrecioUnitario"),
                        rs.getBoolean("Estado")
                );
                listProducto.add(producto);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista Producto: " + e.getMessage());
        }
        return listProducto;
    }

    @Override
    public int Eliminar(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Modificar(Producto entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
