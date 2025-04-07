import java.util.List;

public class Data {

    public static void insertData (List<Libro> libros) {
        //Insertando libros iniciales
        libros.add(new Libro("1", "El Alquimista", "Paulo Coelho", 10.99, 99));
        libros.add(new Libro("2", "Cien años de soledad", "Gabriel García Márquez", 12.50, 200));
        libros.add(new Libro("3", "1984", "George Orwell", 15.00, 150));
        libros.add(new Libro("4", "El Principito", "Antoine de Saint-Exupéry", 8.99, 50));
        libros.add(new Libro("5", "El Hobbit", "J.R.R. Tolkien", 20.00, 300));
        libros.add(new Libro("6", "Crónica de una muerte anunciada", "Gabriel García Márquez", 10.00, 120));
        libros.add(new Libro("7", "El amor en los tiempos del cólera", "Gabriel García Márquez", 14.99, 80));
        libros.add(new Libro("8", "El túnel", "Ernesto Sabato", 9.99, 60));
        libros.add(new Libro("9", "Rayuela", "Julio Cortázar", 11.50, 90));
        libros.add(new Libro("10", "La casa de los espíritus", "Isabel Allende", 13.50, 110));

    }

}
