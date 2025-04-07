import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Venta {

    private Libro libro;
    private int cantidadVendida;
    private Date fechaVenta;

    public Venta(Libro libro, Integer cantidadVendida) {
        this.libro = libro;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = new Date();
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
    public static void registrarVenta(List<Venta> ventas, Venta venta) {
        ventas.add(venta);
    }
    //show sale method
    public static void mostrarVenta(List<Venta> ventas) {
        ventas.forEach(v ->
                System.out.println("Libro: " + v.getLibro().getTitulo() +
                        ", Cantidad: " + v.getCantidadVendida() +
                        ", Fecha: " + v.getFechaVenta())
                );
    }
}