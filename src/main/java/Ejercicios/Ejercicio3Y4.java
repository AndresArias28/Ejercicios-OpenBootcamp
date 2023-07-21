package Ejercicios;

import java.util.Vector;

public class Ejercicio3Y4 {
    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er
    // elemento y muestra el resultado final.
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(5);
        vector.add("hola");
        vector.add("camisa");
        vector.add("patinetas");
        vector.add("estadio");
        vector.add("reloj");
        
        //borrar elemnto
        vector.remove(1);
        vector.remove(1);
        for(String element : vector){
            System.out.println("element = " + element);
        }
    }
    /*
        4.Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si
        tuviésemos 1000 elementos para ser añadidos al mismo.

        RESPUESTA:  - seria una tarea muy dispendiosa agregar 1000 elementos manualmente
                        Otro problema es el rendimiento ya que el vector  se debe redminedionar cada que se quede
                         sin espacio, lo que resulta es alto consumo de tiempo y recursos.
                    -
     */


}
