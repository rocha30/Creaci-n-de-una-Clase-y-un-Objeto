package Libro;

public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("El seños de los anillos", "J.R.R. Tolkien", "Minotauro", "Fantasía épica ", "Español", 1954, "978-8445071414", 476, 19.99 );
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", "Realismo mágico", "Español", 1967, "978-8437614657", 476, 19.99);
        libro1.mostrarDetalles();
        System.out.println("------------------------------");
        libro2.mostrarDetalles();
        libro1.actualizarPrecio(20.99);
        libro2.actualizarPrecio(16.99);
        System.out.println("------------------------------");
        libro1.mostrarDetalles();
        System.out.println("------------------------------");
        libro2.mostrarDetalles();
        
    
        
    }
}
