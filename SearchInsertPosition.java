/**
 * Dado un arreglo nums [] sin valores repetidos y ordenados ascendentemente
 * y un entero target , devolver un entero con la posicion en el arreglo del valor que sea igual a target
 * en caso de no existir devolver la posicion donde deberia ir ordenado
 */
public class SearchInsertPosition {
    public int searchinsert(int [] nums, int target){
        //Se asigna un valor negativo para evitar sobreeescribir un valor positivo
        int indice = -1;
        for (int i = 0; i < nums.length; i++){
            /*
            Como el arreglo es ascendente al primer elemento que sea mayor que target implica que target debe ir en esa posicion
            apenas lo encuentre break
             */

            if (nums[i] >= target){
                indice = i;
                break;
            }
        }
        //Si no encuentra ningun valor o igual a target asignele el tamaño del arreglo
        //Esto indica que la posicion asignada a target esta por fuera de nums
        indice = indice == -1 ? nums.length : indice;
        return indice;
    }
}
