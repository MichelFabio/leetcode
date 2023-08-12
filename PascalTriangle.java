/**
 * representar en una lista el triangulo de pascal
 *
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> valor = new ArrayList<>();
        for (int i = 1; i <= numRows; i++){
            List<Integer> lista = new ArrayList<>();

            for (int j = 0 ; j < i; j++){
                if (j == 0 || j == i-1){
                    lista.add(1);
                }else{
                    lista.add(valor.get(i-2).get(j-1) + valor.get(i-2).get(j));
                }
            }
            valor.add(lista);
        }
        return valor;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> prueba = pascalTriangle.generate(5);
        for (List<Integer> a: prueba){
            for (Integer b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
