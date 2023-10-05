class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //Constructor de la clase Libro.
    //Complejidadtemporal:O(1)Tiempo constante.
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
// se utiliza el metodo set y get para cada atributo
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
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
//Complejidadtemporal:O(1)Tiempo constante.