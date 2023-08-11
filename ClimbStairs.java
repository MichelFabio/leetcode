/**
 * Dada una escalera con n escalones , cuantos formas de subir hay, siendo que cada vwz puedo subir 1 o 2 escalones
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        //Al haber 1 escalon solo hay una forma de subirlo
        //n = 0 aunque no tiene sentido físico, se declara para ayudar a los cálculos, el enfoque se basa en la serie de Fibonnachi
        //en esa serie el valor de n = 0 corresponde 1
        if (n == 1 || n==0){
            return 1;
        }
        int a = 1, b = 1;
        for(int i = 2; i <= n; i++){
            int buf = a;
            a = a + b;
            b = buf;
        }
        return a;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(45));
        long b = System.currentTimeMillis();
        System.out.println(b-a);
    }
}
