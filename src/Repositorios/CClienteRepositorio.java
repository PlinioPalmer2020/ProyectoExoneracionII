
package Repositorios;

import Entidades.Cliente;
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
public class CClienteRepositorio implements ICRUDDB<Cliente> {

    CConexion _conexion = null;

    public CClienteRepositorio() {
        _conexion = new CConexion();
    }

    @Override
    public int Crear(Cliente entidad) {

        String Sql = "INSERT INTO [dbo].[Cliente]([Cedula],[Nombre],[Direccion],[Genero],[Estado])VALUES(?,?,?,?,?)";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(1, entidad.getCedula());
            cs.setString(2, entidad.getNombre());
            cs.setString(3, entidad.getDireccion());
            cs.setString(4, entidad.getGenero());
            cs.setBoolean(5, entidad.isEstado());

            cs.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a insertar: "+ e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public Cliente Get(String x) {

        Cliente cliente = null;
        String Sql = "SELECT * FROM Cliente WHERE Cedula = '" + x + "' and Estado = 'true'";
        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {

                cliente = new Cliente(rs.getString("Cedula"),
                        rs.getString("Nombre"),
                        rs.getString("Direccion"),
                        rs.getString("Genero"),
                        rs.getBoolean("Estado")
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista: " + e.getMessage());
        }

        return cliente;
    }

    @Override
    public ArrayList<Cliente> Get() {

        ArrayList<Cliente> listCliente = new ArrayList<>();

        String Sql = "SELECT * FROM Cliente WHERE Estado = 'true';";

        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                Cliente cliente;
                //String cedula, String nombre, String genero, boolean estado, String rol
                cliente = new Cliente(rs.getString("Cedula"),
                        rs.getString("Nombre"),
                        rs.getString("Direccion"),
                        rs.getString("Genero"),
                        rs.getBoolean("Estado")
                );
                listCliente.add(cliente);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista");
        }
        return listCliente;
    }

    @Override
    public int Eliminar(String x) {
                String Sql = "UPDATE [dbo].[Cliente] SET  [Estado] = 0 WHERE [Cedula] = ?";

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
    public int Modificar(Cliente entidad) {
        
        String Sql = "UPDATE [dbo].[Cliente] SET [Nombre] = ?, [Direccion] = ?, [Genero] = ?, [Estado] = ? WHERE [Cedula] = ?";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(5, entidad.getCedula());
            cs.setString(1, entidad.getNombre());
            cs.setString(2, entidad.getDireccion());
            cs.setString(3, entidad.getGenero());
            cs.setBoolean(4, entidad.isEstado());

            cs.execute();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar: "+ e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public ArrayList<Cliente> GetAll() {
        ArrayList<Cliente> listCliente = new ArrayList<>();

        String Sql = "SELECT * FROM Cliente ";

        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                Cliente cliente;
                //String cedula, String nombre, String genero, boolean estado, String rol
                cliente = new Cliente(rs.getString("Cedula"),
                        rs.getString("Nombre"),
                        rs.getString("Direccion"),
                        rs.getString("Genero"),
                        rs.getBoolean("Estado")
                );
                listCliente.add(cliente);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista");
        }
        return listCliente;
    }

}
