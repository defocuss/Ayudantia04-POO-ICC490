package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public boolean agregarLibro(Libro libro) {
        if (buscarLibroISBN(libro.getIsbn()) == null) {
            this.libros.add(libro);
            return true;
        }else {libro.devolver(libro);return true;}
    }

    public Libro buscarLibroISBN(String isbn) {
        for (Libro libro : this.libros) {
            if(libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibrosDispobibles() {
        System.out.println("-Libros disponibles-");
        for (Libro libro : this.libros) {
            if (libro.isDisponible()) {
                System.out.println(libro.mostrarInfo());
            }
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void imprimirLibrosDispobiblesAutor(String autor) {
        System.out.println("-Libros disponibles por autor-");
        for (Libro libro : this.libros) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro.mostrarInfo());
            }
        }
    }

    public Libro buscarLibroPorAutor(String autor) {
        for (Libro libro : this.libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String titulo) {
        if (buscarLibroPorTitulo(titulo) != null && buscarLibroPorTitulo(titulo).getCantidadDisponibles() == 0) {
            this.libros.remove(buscarLibroPorTitulo(titulo));
            return true;
        }else {return false;}
    }

    public boolean prestarLibro(String titulo) {
        if (buscarLibroPorTitulo(titulo) != null) {
            buscarLibroPorTitulo(titulo).prestar(buscarLibroPorTitulo(titulo));
            return true;
        }else {return false;}
    }

    public boolean devolverLibro(String titulo) {
        if (buscarLibroPorTitulo(titulo) != null) {
            buscarLibroPorTitulo(titulo).devolver(buscarLibroPorTitulo(titulo));
            return true;
        }else {return false;}
    }
}
