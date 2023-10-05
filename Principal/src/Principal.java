public class Principal {
    //i)Complejidadtemporal:O(1)Tiempoconstante.
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        //se dan las caracteristicas de los libros para registrarlos, y asi iniciar con el programa principal

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

        bibliotecaKonradLorenz.mostrarLibrosDisponibles();

        // Ejemplo de búsqueda de un libro por título
        String tituloABuscar = "1984";
        Libro libroEncontrado = bibliotecaKonradLorenz.buscarLibro(tituloABuscar);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println("Título: " + libroEncontrado.getTitulo());
            System.out.println("Autor: " + libroEncontrado.getAutor());
            System.out.println("Número de páginas: " + libroEncontrado.getNumeroPaginas());
        } else {
            System.out.println("El libro con título '" + tituloABuscar + "' no se encuentra en la biblioteca.");
        }
    }
}