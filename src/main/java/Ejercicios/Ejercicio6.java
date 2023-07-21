package Ejercicios;

import java.util.ArrayList;
import java.util.List;
//Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        for(int i = 1; i < 11 ; i++){
            lista.add(i);
        }
        for(int i = 1; i < lista.size() ; i++){
            if(lista.get(i)%2 == 0){
                lista.remove(i);
            }
        }
        System.out.println(lista);
    }

}
