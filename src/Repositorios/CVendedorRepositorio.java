/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.Vendedor;
import Interfaces.ICRUDDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author plini
 */
public class CVendedorRepositorio implements ICRUDDB<Vendedor> {

    CConexion _conexion = null;

    public CVendedorRepositorio() {
        _conexion = new CConexion();
    }

    @Override
    public int Crear(Vendedor entidad) {

        String Sql = "INSERT INTO [dbo].[Vendedor]([Cedula],[Nombre],[Genero],[Rol],[Pass],[Estado])VALUES(?,?,?,?,?,?)";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(1, entidad.getCedula());
            cs.setString(2, entidad.getNombre());
            cs.setString(3, entidad.getGenero());
            cs.setString(4, entidad.getRol());
            cs.setString(5, entidad.getPass());
            cs.setBoolean(6, entidad.isEstado());

            cs.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a insertar: "+ e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public Vendedor Get(String x) {
        Vendedor a = new Vendedor();

        Vendedor vendedor = null;
        String Sql = "SELECT * FROM Vendedor WHERE Cedula = '" + x + "'";
        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                //String cedula, String nombre, String genero, boolean estado, String rol
                vendedor = new Vendedor(rs.getString("Cedula"),
                        rs.getString("Nombre"),
                        rs.getString("Genero"),
                        rs.getBoolean("Estado"),
                        rs.getString("Rol")
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista: " + e.getMessage());
        }

        return vendedor;
    }

    @Override
    public ArrayList<Vendedor> Get() {

        ArrayList<Vendedor> listVendedor = new ArrayList<>();

        String Sql = "SELECT * FROM Vendedor WHERE Estado;";

        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                Vendedor vendedor;
                //String cedula, String nombre, String genero, boolean estado, String rol
                vendedor = new Vendedor(rs.getString("Cedula"),
                        rs.getString("Nombre"),
                        rs.getString("Genero"),
                        rs.getBoolean("Estado"),
                        rs.getString("Rol")
                );
                listVendedor.add(vendedor);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista");
        }
        return listVendedor;
    }

    @Override
    public int Eliminar(String x) {
                String Sql = "UPDATE [dbo].[Vendedor] SET  [Estado] = 0 WHERE [Cedula] = ?";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(1, x);
            cs.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar: "+ e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public int Modificar(Vendedor entidad) {
        
        String Sql = "UPDATE [dbo].[Vendedor] SET [Nombre] = ?, [Genero] = ?, [Rol] = ?, [Pass] = ?, [Estado] = ? WHERE [Cedula] = ?";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(6, entidad.getCedula());
            cs.setString(1, entidad.getNombre());
            cs.setString(2, entidad.getGenero());
            cs.setString(3, entidad.getRol());
            cs.setString(4, entidad.getPass());
            cs.setBoolean(5, entidad.isEstado());

            cs.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar: "+ e.getMessage());
            return 0;
        }
        return 1;
    }

}
