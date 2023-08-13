import java.util.Arrays;

/**
 * Dado un arreglo de enteros los cuales todos se repiten x cantidad de veces excepto por uno que solo aparece una vez
 * Determine cual es el numero
 */
public class SingleNumber {
    //Acá modificamos la firma del método para ingresar el par+ametro de cuantas veces se repiten los numeros (x)
    public  int singleNumber(int [] nums,int x){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i += x){
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

}
