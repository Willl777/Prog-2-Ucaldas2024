
import java.util.Date;


public class Venta {
    private Producto producto;
    private int cantidad;
    private Date fechaVenta;

    public Venta(Producto producto, int cantidad, Date fechaVenta) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public String toString() {
        return "Venta de " + cantidad + " unidades del producto " + producto.getNombre() + " realizada el " + fechaVenta;
    }
}
    
