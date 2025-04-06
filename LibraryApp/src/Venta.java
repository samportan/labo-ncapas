import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Venta {

    private Libro libro;
    private int cantidadVendida;
    private Date fechaVenta;

    public Venta(Libro libro, Integer cantidadVendida, Date fechaVenta) {
        this.libro = libro;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = fechaVenta;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    //add sale method
    public static Venta registrarVenta() { return null;}

    //show sale method
    public void mostrarVenta() {}
}