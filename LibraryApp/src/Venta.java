import java.util.Date;

public class Venta {

    private Libro libro; //cambiar por tipo libro
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

    //metodo para registrar venta
    public void registrarVenta() {}

    //metodo paar mostrar venta
    public void mostrarVenta() {}
}