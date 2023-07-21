package Ejercicios;

public class Ejercicio2 {
//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void main(String[] args) {
        int[][] arregloEnteros = new int[3][3];
        arregloEnteros[0][0] = 8;
        arregloEnteros[0][1] = 14;
        arregloEnteros[0][2] = 23;
        arregloEnteros[1][0] = 44;
        arregloEnteros[1][1] = 12;
        arregloEnteros[1][2] = 54;
        arregloEnteros[2][0] = 55;
        arregloEnteros[2][1] = 88;
        arregloEnteros[2][2] = 2;

        for (int i = 0; i < arregloEnteros.length; i++) {
            for(int j = 0; j < arregloEnteros.length; j++){
                System.out.println("En la posicion: "+ i +","+ j+ " se encuentra el valor: "
                        + arregloEnteros[i][j]);
            }
        }

    }
}
