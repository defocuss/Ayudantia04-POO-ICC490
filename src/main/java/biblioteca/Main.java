package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca de david");

        Libro libro1 = new Libro("El camino de los reyes","Brandon Sanderson","Fantasia epica","1",2,true);
        Libro libro2 = new Libro("Juramentada","Brandon Sanderson","Fantasia epica","2",1,true);
        Libro libro3 = new Libro("Amanecer rojo","Pierce Brown","Ciencia ficcion","3",0,false);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarLibrosDispobibles();

        System.out.println("\nPrestar libro:");
        biblioteca.prestarLibro("Juramentada");
        biblioteca.mostrarLibrosDispobibles();

        System.out.println("\nDevolver libro:");
        biblioteca.devolverLibro("Amanecer rojo");
        biblioteca.mostrarLibrosDispobibles();

        System.out.println("\nLibros por autor:");
        biblioteca.imprimirLibrosDispobiblesAutor("Pierce Brown");

        System.out.println("\nEliminar libro:");
        biblioteca.eliminarLibro("El camino de los reyes");//No lo elimina ya que la cantidad disponible es distinta de cero.
        biblioteca.mostrarLibrosDispobibles();

    }
}