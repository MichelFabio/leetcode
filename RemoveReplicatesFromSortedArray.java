import java.util.ArrayList;

public class RemoveReplicatesFromSortedArray {
    public static int remove(int [] arr, int k){
        ArrayList<Integer> arr1 = new ArrayList();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                arr[i] = -1;
            }
            if (arr[i] != -1){
                arr1.add(arr[i]);
            }
        }
        int count = 0;
        while (arr1.size() < arr.length){
            arr1.add(-1);
            count++;

        }
        for(int i = 0; i < arr1.size();i++){
            arr[i] = arr1.get(i);
        }

        return arr.length - count;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,3,5};
        System.out.println(remove(a,3));
        System.out.println(a.toString());
    }
}
