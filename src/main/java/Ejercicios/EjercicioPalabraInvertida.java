package Ejercicios;

import java.util.Scanner;
public class EjercicioPalabraInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa una frase a invertir: ");
        String palabra = scanner.nextLine();
        String palabraInertida = reverse(palabra);
        System.out.println("palabraInertida = " + palabraInertida);
    }
    public  static String reverse(String texto) {
        String palabra2 = "";
        for(int i = texto.length() -1; i >=0; i--){
            palabra2 = palabra2 + String.valueOf((texto.charAt(i)));
        }
        return palabra2;
    }
}
