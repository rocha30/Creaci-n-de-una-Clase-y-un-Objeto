package Libro;

public class Libro {
    // Atributos
    String titulo;
    String autor;
    String editoial;
    String genero;
    String idioma;
    String ISBN;
    int anioPublicacion;
    int paginas;
    double precio;

    // Constructor con parámetros
    public Libro(String titulo, String autor, String editorial, String genero, String idioma, int anioPublicacion, String ISBN, int paginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editoial = editorial;
        this.genero = genero;
        this.idioma = idioma;
        this.anioPublicacion = anioPublicacion;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo + " autor:" + autor + " editorial:" + editoial + " genero: " + genero + " idioma: " + idioma + " Año de publicación: " + anioPublicacion + " Codigo ISBN: " + ISBN + " Páginas: " + paginas + " Precio : $" + precio);
    }

    public void actualizarPrecio(double nuevoprecio) {
        if (nuevoprecio > 0) {
            this.precio = nuevoprecio;
        } else {
            System.out.println("El precio debe ser mayor a cero. ");
        }
    }
}

