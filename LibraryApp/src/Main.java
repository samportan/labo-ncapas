import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    static List<Libro> libros = new ArrayList<>();
    static List<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {


        // Agregar libros a la lista
        libros.add(new Libro("1", "El Alquimista", "Paulo Coelho", 10.99, 99));
        libros.add(new Libro("2", "Cien años de soledad", "Gabriel García Márquez", 12.50, 200));
        libros.add(new Libro("3", "1984", "George Orwell", 15.00, 150));

        //TODO: Create Ventas

        //Console menu
        int opcion = 0;

        while (opcion != 6) {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    registrarVenta();
                    break;
                case 3:
                    Libro max = Libro.calcularLibroMasVendido(libros);
                    System.out.println("El libro con más ventas es: " + max.getTitulo() + " con " +  max.getVentasTotales() + " ventas.");
                    break;
                case 4:
                    mostarLibroConVentasSuperores();
                    break;
                case 5:
                    actualizarVentas();
                    break;
                case 6:
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
        System.out.println("6. Salir");
        System.out.println("Elige una opción: ");
        System.out.println("---------------------------------------------------");
    }

    public static void registrarLibro() {

    }

    public static void registrarVenta() {

    }

    public static void mostarLibroConVentasSuperores() {
        System.out.println("Introduce el número de ventas:");
        int x = sc.nextInt();
        System.out.println("Libros con más de " + x + " ventas:");
        libros.stream()
                .filter(libro -> libro.getVentasTotales() > x)
                .forEach(libro -> System.out.println(libro.getTitulo() + " - ventas: " + libro.getVentasTotales()));
    }

    public static void actualizarVentas() {}
}