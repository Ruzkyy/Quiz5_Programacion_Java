import java.util.ArrayList;
class Biblioteca {
    private ArrayList<Libro> librosDisponibles;
    //Constructor de la clase Biblioteca. Inicializa la lista de libros disponibles.
    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
    }
    //Registra un libro en la biblioteca.
    //Complejidadtemporal:O(1)Tiempo constante.
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }
    //Busca un libro a travez de su título en la biblioteca.
    // Complejidad temporal: O(N) - Tiempo lineal
    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
    //Muestra la lista de libros disponibles en la biblioteca.
    // Complejidad temporal: O(N) - Tiempo lineal
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Número de páginas: " + libro.getNumeroPaginas());
            System.out.println("---------------------------");
        }
    }
}


