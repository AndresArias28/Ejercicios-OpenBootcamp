package Ejercicios;

import java.io.*;

//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro
// "fileIn" al fichero dado en "fileOut".
public class Ejercicio8 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            InputStream in = new FileInputStream("src/main/java/archivoIN.txt");
            PrintStream out = new PrintStream("src/main/java/archivoOUT.txt");
            copiarFichero(in, out);

        }catch(FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void copiarFichero(InputStream fileIn, PrintStream fileOut) throws IOException {

            byte []datos = fileIn.readAllBytes();
            fileIn.close();

            fileOut.write(datos);
            fileOut.close();



    }
}

