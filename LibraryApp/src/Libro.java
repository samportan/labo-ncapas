import java.util.Comparator;
import java.util.List;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private double precio;
    private int ventasTotales;

    public Libro(String id, String titulo, String autor, double precio, int ventasTotales) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.ventasTotales = ventasTotales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //best-selling method
    public static Libro calcularLibroMasVendido(List<Libro> libros) {
        return libros.stream()
                .max(Comparator.comparingInt(Libro::getVentasTotales))
                .orElse(null);
    }

    public void actualizarVentas(int cantidad) {
        this.ventasTotales += cantidad;
    }
}
