/**
 * Dado un entero n, verificar si n es potencia de 2
 * esto se cumple si n = 2^x
 * -2³¹ < n < 2³¹ - 1
 */

package leetcode.leetcode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        boolean flag = false;
        //el for recorre 0- 31 porque sabemos que n no puede ser mas grande que eso
        for (int i= 0; i < 32; i++){
            double d = Math.pow(2,i);
            if (d == n){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2147483647));

    }
}
