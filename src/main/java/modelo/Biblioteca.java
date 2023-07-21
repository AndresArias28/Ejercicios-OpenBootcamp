package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    private HashMap<String, Libro> biblioteca;
    private ArrayList<String> prestamos;

    public Biblioteca() {
        biblioteca = new HashMap<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor){
        Libro libro = new Libro(titulo, autor);
        biblioteca.put(titulo, libro);
    }
    public void prestarLibro(String titulo) throws Exception {
        if (!biblioteca.containsKey(titulo)){
            throw new Exception("El libro no está disponible en la biblioteca.");
        }

        Libro libro = biblioteca.get(titulo);
        if(libro.isPrestado()){
            throw new Exception("El libro ya esta prestado en la biblioteca.");
        }
        libro.setPrestado(true);
        prestamos.add(titulo);
    }

    public void devuelveLibro(String titulo) throws Exception {
        if (!biblioteca.containsKey(titulo)) {
            throw new Exception("El libro no está registrado en la biblioteca.");
        }

        Libro libro = biblioteca.get(titulo);
        if (!libro.isPrestado()) {
            throw new Exception("El libro no está prestado actualmente.");
        }

        libro.setPrestado(false);
        prestamos.remove(titulo);
    }
    public void mostrarBiblioteca(){
        System.out.println("Catalago de la biblioteca");
        for(Libro libro : biblioteca.values()){
            System.out.println("- " + libro);
        }
    }
    public void mostrarPrestamos() {
        System.out.println("Libros prestados:");
        if (prestamos.isEmpty()) {
            System.out.println("Ningún libro ha sido prestado.");
        } else {
            for (String titulo : prestamos) {
                System.out.println("- " + biblioteca.get(titulo));
            }
        }
    }


}
