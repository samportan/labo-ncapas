import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    static List<Libro> libros = new ArrayList<>();
    static List<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {

        //Cargo libros iniciales
        Data.insertData(libros);

        //Console menu
        int opcion = 0;

        while (opcion != 7) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarLibro(libros);
                    break;
                case 2:
                    registrarVenta();
                    break;
                case 3:
                    Libro max = Libro.calcularLibroMasVendido(libros);
                    System.out.println("El libro con más ventas es: " + max.getTitulo() + " con " +  max.getVentasTotales() + " ventas.");
                    break;
                case 4:
                    mostarLibroConVentasSuperiores();
                    break;
                case 5:
                    actualizarVentas();
                    break;
                case 6:
                    mostrar();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Gestión de Librería ---");
        System.out.println("1. Registrar un nuevo libro");
        System.out.println("2. Registrar una venta");
        System.out.println("3. Ver el libro más vendido");
        System.out.println("4. Ver libros con más de (N) unidades vendidas");
        System.out.println("5. Actualizar estadísticas de ventas");
        System.out.println("6. Mostrar libros/ventas");
        System.out.println("7. Salir");
        System.out.println("Elige una opción: ");
        System.out.println("---------------------------------------------------");
    }

    public static void registrarLibro(List<Libro> libros) {
        System.out.println("\n--- Registrar Libro ---");

        System.out.print("Id: ");
        String id = sc.nextLine();

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        Libro libro = new Libro(id, titulo, autor, precio, 0);
        Libro.agregarLibro(libros, libro);

    }

    public static void registrarVenta() {

        System.out.println("\n--- Registrar venta ---");
        //select the book
        System.out.print("Libros: ");
        libros.forEach(l -> System.out.print(l.getId() + "." + l.getTitulo() + ", " ));

        System.out.print("\nSeleccione el libro(ej. 1): ");
        String id = sc.nextLine();
        Libro libro = Libro.buscarLibro(libros, id) ;

        //receive the amount
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        //add the sale
        Venta venta = new Venta(libro, cantidad);
        Venta.registrarVenta(ventas, venta);

    }

    public static void mostarLibroConVentasSuperiores() {
        System.out.println("Introduce el número de ventas:");
        int x = sc.nextInt();
        System.out.println("Libros con más de " + x + " ventas:");
        libros.stream()
                .filter(libro -> libro.getVentasTotales() > x)
                .forEach(libro -> System.out.println(libro.getTitulo() + " - ventas: " + libro.getVentasTotales()));
    }

    public static void actualizarVentas() {
        for (Venta venta : ventas) {
            venta.getLibro().actualizarVentas(venta.getCantidadVendida());
        }

        System.out.println("Dato de ventas actualizadas: ");
        for (Libro libro: libros) {
            System.out.println(libro.getTitulo() + " - ventas: " + libro.getVentasTotales());
        }
    }

    public static void mostrar() {
        System.out.println("\n¿Que desea ver? 1.Libros 2.Ventas");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            Libro.mostrarLibros(libros);
        } else Venta.mostrarVenta(ventas);

    }
}