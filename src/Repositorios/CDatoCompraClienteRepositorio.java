package Repositorios;

import Entidades.DatoCompraCliente;
import Interfaces.ICRUDDB;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CDatoCompraClienteRepositorio implements ICRUDDB<DatoCompraCliente> {

    CConexion _conexion = null;

    public CDatoCompraClienteRepositorio() {
        _conexion = new CConexion();
    }

    @Override
    public int Crear(DatoCompraCliente entidad) {
        String Sql = "INSERT INTO [dbo].[DatoCompraCliente] ([Cedula] ,[Fecha] ,[Vendedor] ,[TipoCompra] ,[Articulo] ,[Cantidad] ,[PrecioUnitario] ,[Monto]) VALUES (? ,? ,? ,? ,? ,? ,? ,?)";

        try {
            CallableStatement cs = _conexion.establecerConexion().prepareCall(Sql);

            cs.setString(1, entidad.getCedula());
            cs.setString(2, entidad.getFecha());
            cs.setString(3, entidad.getVendedor());
            cs.setString(4, entidad.getTipoCompra());
            cs.setString(5, entidad.getArtículo());
            cs.setInt(6, entidad.getCantidad());
            cs.setDouble(7, entidad.getPrecioUnitario());
            cs.setDouble(8, entidad.getMonto());

            cs.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a insertar: " + e.getMessage());
            return 0;
        }
        return 1;

    }

    @Override
    public DatoCompraCliente Get(String x) {
        DatoCompraCliente datoCompracliente = null;
        String Sql = "SELECT * FROM DatoCompraCliente WHERE Cedula = '" + x + "'";
        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
//     
                datoCompracliente = new DatoCompraCliente(rs.getString("Cedula"),
                        rs.getString("Fecha"),
                        rs.getString("Vendedor"),
                        rs.getString("TipoCompra"),
                        rs.getString("Articulo"),
                        rs.getInt("Cantidad"),
                        rs.getDouble("PrecioUnitario"),
                        rs.getFloat("Monto")
                );
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista: " + e.getMessage());
        }

        return datoCompracliente;
    }

    @Override
    public ArrayList<DatoCompraCliente> Get() {
         
        ArrayList<DatoCompraCliente> listDatoCompraCliente = new ArrayList<>();

        String Sql = "SELECT * FROM DatoCompraCliente;";

        Statement st;

        try {
            st = _conexion.establecerConexion().createStatement();

            ResultSet rs = st.executeQuery(Sql);

            while (rs.next()) {
                DatoCompraCliente datoCompraCliente;
                //String Cedula, String Fecha, String Vendedor, String TipoCompra, String Artículo, int Cantidad, double PrecioUnitario, float Monto
                datoCompraCliente = new DatoCompraCliente(rs.getString("Cedula"),
                        rs.getString("Fecha"),
                        rs.getString("Vendedor"),
                        rs.getString("TipoCompra"),
                        rs.getString("Articulo"),
                        rs.getInt("Cantidad"),
                        rs.getDouble("PrecioUnitario"),
                        rs.getFloat("Monto")
                );
                listDatoCompraCliente.add(datoCompraCliente);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la lista: " + e.getMessage() );
        }
        return listDatoCompraCliente;
    }

    @Override
    public int Eliminar(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Modificar(DatoCompraCliente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DatoCompraCliente> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DatoCompraCliente GetAllEstado(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
