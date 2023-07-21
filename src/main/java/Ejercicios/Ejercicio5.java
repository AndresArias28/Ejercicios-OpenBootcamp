package Ejercicios;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio5 {
    //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre
    // ambos mostrando únicamente el valor de cada elemento.
    public static void main(String[] args) {
        String array[] = new String[]{"hola", "bien", "chao", "adios"};

        List list = new LinkedList(List.of(array));

        for(int i = 0; i < 3; i++){
            System.out.println("array = " + array[i]);
            System.out.println("lista enlazada: "+list.get(i));
        }

    }

}
