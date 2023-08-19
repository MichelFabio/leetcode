/*
Dado un arreglo de enteros enviar todos los zeros al final del arreglo manteniendo el orden relativo de
los valores diferentes de zero
*/
public class MoveZeroes{
    public void moveZeroes (int [] nums){
    	int valor = 0;
        for(int i = 0; i < nums.length;i++){
            for(int j = i;j < nums.length; j++){
                if(nums[j] != 0){
                    valor = nums[i];
                    nums[i] = nums[j];
                    nums[j] = valor;
                    break;
                }
            }
        }
    }
