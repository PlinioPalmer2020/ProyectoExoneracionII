package Repositorios;


import Entidades.Producto;
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
public class CProductoRepositorio implements ICRUDDB<Producto> {

    CConexion _conexion = null;

    public CProductoRepositorio() {
        _conexion = new CConexion();
    }

    @Override
    public int Crear(Producto entidad) {

        String Sql = "INSERT INTO [dbo].[Producto] ([Nombre] ,[PrecioUnitario] ,[Estado]) VALUES(?,?,?)";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);
            cs.setString(1, entidad.getNombre());
            cs.setDouble(2, entidad.getPrecioUnitario());
            cs.setBoolean(3, entidad.isEstado());

            cs.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a insertar: " + e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public Producto Get(String x) {

        Producto producto = null;
        String Sql = "SELECT * FROM Producto WHERE Nombre = '" + x + "' and Estado = 'true'";
        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                //String Nombre, double PrecioUnitario, boolean Estado
                producto = new Producto(
                        rs.getString("Nombre"),
                        rs.getDouble("PrecioUnitario"),
                        rs.getBoolean("Estado")
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista: " + e.getMessage());
        }

        return producto;
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
                producto = new Producto(
                        rs.getString("Nombre"),
                        rs.getDouble("PrecioUnitario"),
                        rs.getBoolean("Estado")
                );
                listProducto.add(producto);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista");
        }
        return listProducto;
    }

    @Override
    public int Eliminar(String x) {
        String Sql = "UPDATE [dbo].[Producto] SET  [Estado] = 0 WHERE [Nombre] = ?";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(1, x);
            cs.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar: " + e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public int Modificar(Producto entidad) {

        String Sql = "UPDATE [dbo].[Producto] SET [Nombre] = ? ,[PrecioUnitario] = ? ,[Estado] = ? WHERE [Nombre] = ?";

        try {
            String[] partes = entidad.getNombre().split("-");
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);
            String aux = partes[0];
            cs.setString(4, aux);
            cs.setString(1, partes[1]);
            cs.setDouble(2, entidad.getPrecioUnitario());
            cs.setBoolean(3, entidad.isEstado());

            cs.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar: " + e.getMessage());
            return 0;
        }
        return 1;
    }

    @Override
    public ArrayList<Producto> GetAll() {
        ArrayList<Producto> listProducto = new ArrayList<>();

        String Sql = "SELECT * FROM Producto ";

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
            JOptionPane.showMessageDialog(null, "Error al obtener la lista");
        }
        return listProducto;
    }

    @Override
    public Producto GetAllEstado(String x) {

        Producto producto = null;
        String Sql = "SELECT * FROM Producto WHERE Nombre = '" + x + "' ";
        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {

                producto = new Producto(
                        rs.getString("Nombre"),
                        rs.getDouble("PrecioUnitario"),
                        rs.getBoolean("Estado")
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista: " + e.getMessage());
        }

        return producto;
    }

}
