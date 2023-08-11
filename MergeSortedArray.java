import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Si n no tiene elementos no hay nada que modificar
        if(n == 0){
            return;
        }
        //Todos los elementos de nums1 hasta m son válidos, los demás son ceros, por lo tanto se les pasa el valor de  nums2
        for(int i = m;i < m+n; i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int [] nums1 = {1,2,4,5,20,0,0,0,0,0};
        int m = nums1.length;
        int [] nums2 = {20,5,4,2,1};
        int n = nums2.length;
        mergeSortedArray.merge(nums1,n,nums2,n);
        for (int a: nums1){
            System.out.print(a + " ");
        }
    }
}
