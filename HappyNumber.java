public class HappyNumber {
    public static int  count = 0;
    public static boolean isHappy(int n){
        if(count > 10000){
            return false;
        }
        String texto = String.valueOf(n);
        int[] numeros = new int[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int numero = Character.getNumericValue(c); 
            numeros[i] = numero;
        }
        int res = 0;
        for (int numero : numeros) {
            res += (int)(Math.pow(numero,2));
        }
        if(res != 1){
            count++;
            return isHappy(res);
        }else{
            return true;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(isHappy(16));
    }
    
}
