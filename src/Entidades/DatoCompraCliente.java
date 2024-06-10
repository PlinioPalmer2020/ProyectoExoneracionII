
package Entidades;


public class DatoCompraCliente {
    private String Cedula;
    private String Fecha;
    private String Vendedor;
    private String TipoCompra;
    private String Artículo;
    private int    Cantidad;
    private double PrecioUnitario;
    private float  Monto;

    public DatoCompraCliente(String Cedula, String Fecha, String Vendedor, String TipoCompra, String Artículo, int Cantidad, double PrecioUnitario, float Monto) {
        this.Cedula = Cedula;
        this.Fecha = Fecha;
        this.Vendedor = Vendedor;
        this.TipoCompra = TipoCompra;
        this.Artículo = Artículo;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.Monto = Monto;
    }

    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getTipoCompra() {
        return TipoCompra;
    }

    public void setTipoCompra(String TipoCompra) {
        this.TipoCompra = TipoCompra;
    }

    public String getArtículo() {
        return Artículo;
    }

    public void setArtículo(String Artículo) {
        this.Artículo = Artículo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public float getMonto() {
        return Monto;
    }

    public void setMonto(float Monto) {
        this.Monto = Monto;
    }
    
    
}
