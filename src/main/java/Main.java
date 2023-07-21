import modelo.Biblioteca;

public class Main {
   // Vamos a crear una aplicación para gestionar una biblioteca. Utilizaremos un HashMap para almacenar los
   // libros y un ArrayList para llevar un registro de los préstamos. También implementaremos excepciones para
   // manejar situaciones como préstamos no válidos o libros no encontrados.
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("El Alquimista", "Paulo Coelho");
        biblioteca.agregarLibro("la Vorágine", "José Eustasio Rivera");
        biblioteca.agregarLibro("Don Quijote de la Mancha", "Miguel de Cervantes");

        try {
            biblioteca.prestarLibro("El Alquimista");
            biblioteca.prestarLibro("Cien años de soledad");

            biblioteca.mostrarBiblioteca();
            biblioteca.mostrarPrestamos();

            biblioteca.devuelveLibro("Cien años de soledad");

            biblioteca.mostrarBiblioteca();
            biblioteca.mostrarPrestamos();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
