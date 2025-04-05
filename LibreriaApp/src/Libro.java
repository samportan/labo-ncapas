public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private double precio;
    private int ventasTotales;

    public Libro(int ventasTotales, double precio, String autor, String titulo, String id) {
        this.ventasTotales = ventasTotales;
        this.precio = precio;
        this.autor = autor;
        this.titulo = titulo;
        this.id = id;
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


}
