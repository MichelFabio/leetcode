/**
 * Dado un arreglo de enteros donde hay x elementos que no se repiten devolver un arreglo con los valores que no se repiten
 */

import java.util.Arrays;

public class SingleNumberGeneral {
    public int[] singleNumber(int[] nums, int x) {
        if(nums.length == x-1) return nums;

        Arrays.sort(nums);

        int count = 0;
        int [] arr = new int[x];

        for(int i = 0; i < nums.length-1; i += 2){
            if(count ==x) break;
            if(nums[i] != nums[i+1]){
                arr[count] = nums[i];
                count++;
                if(i+2 < nums.length-1 &&  nums[i+1] != nums[i+2]){
                    arr[count] = nums[i+1];
                    count++;
                }else{
                    i++;
                }
            }
        }
        if(count ==x-1) arr[x-1] = nums[nums.length-1];
        return arr;

    }
}
