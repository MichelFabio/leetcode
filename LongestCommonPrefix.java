import java.util.Arrays;

public class LongestCommonPrefix {
    public static String comun(String [] arr){
        Arrays.sort(arr);
        int x = 0;
        String a = arr[0];
        String b = arr[arr.length-1];
        while (x < a.length() &&  x < b.length()){
            if (a.charAt(x) == b.charAt(x)){
                x++;
            }else break;
        }
        return a.substring(0,x);
    }

    public static void main(String[] args) {
        System.out.println(comun(new String[]{"magic","magician","magiver","magallanes"}));
    }
}
