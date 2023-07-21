package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante
// del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
// Finalmente, mostraremos en cualquier caso: "Demo de código".

public class Ejercicio7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numerador y denominador: ");
        int numerador = scanner.nextInt();
        int denominador = scanner.nextInt();
        dividePorCero(numerador, denominador);
    }
    public static void dividePorCero(int a, int b) throws ArithmeticException{
        int res=0;
        try{
            res =  a/b;
            System.out.println("resultado = " + res);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }

}
