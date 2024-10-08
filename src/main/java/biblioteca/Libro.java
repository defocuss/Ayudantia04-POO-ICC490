package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int cantidadDisponibles;
    private boolean disponible;

    public Libro(String titulo, String autor, String genero, String isbn, int cantidadDisponibles, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.cantidadDisponibles = cantidadDisponibles;
        this.disponible = disponible;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCantidadDisponibles() {
        return cantidadDisponibles;
    }

    public void setCantidadDisponibles(int cantidadDisponibles) {
        this.cantidadDisponibles = cantidadDisponibles;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar(Libro libro) {
        if (cantidadDisponibles >= 1){
            libro.cantidadDisponibles = libro.cantidadDisponibles - 1;
            if (libro.cantidadDisponibles == 0){
                libro.disponible = false;
            }
        }
    }

    public void devolver(Libro libro) {
        libro.cantidadDisponibles = libro.cantidadDisponibles + 1;
        libro.disponible = true;
    }

    public String mostrarInfo() {
        return "Isbn: "+ this.isbn +", Titulo: "+ this.titulo + ", Autor: "+ this.autor + ", Genero: " + this.genero + ", Cantidad disponible: " + this.cantidadDisponibles + ", Dispobible para prestamo: "+ this.disponible;
    }


}
