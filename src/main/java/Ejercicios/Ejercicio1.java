package Ejercicios;

public class Ejercicio1 {
//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void main(String[] args) {
        String arrayPlabras[] = new String[]{"bien", "dos", "palabra", "hola", "santi"};
        for(String str : arrayPlabras){
            System.out.println("palabras: " + str);
        }

    }
}
