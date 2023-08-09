/**
 * Dado un arreglo de enteros que contiene un numero y en cada posicion se guardan sus dígitos
 * ordenado de cifra mas significativa de izquierda a derecha, sumar 1 y devolver un arreglo con el resultado
 */
public class PlusOne {
    public int [] plusOne(int [] digits){
        //Como algunas veces al sumar uno se obtiene un numero con una cifra adicional, es necesario declarar un arreglo
        //para que pueda almacenar ese digito adicional

        //Recorre de manera inversa el arreglo , si encuentra un 9 establece el arreglo en esa posición en 0
        //y pasa al siguiente dígito(de derecha a izquierda) si no encuentra un 9 establece el arreglo en esa posicion en el digito +1 y retorna

        //Si sale del for implica que hay un 0 en el primer index esto indica que se debe añadir un digito nuevo al arreglo
        //específicamente el 1

        int [] addedDigits;
        int x = digits.length;

        for (int i = 0; i < x; i++){
            int suma = digits[x - i -1] + 1;
            if (suma > 9){
                digits[x - i -1] = 0;
            }else {
                digits[x - i -1] = suma;
                return digits;
            }
        }

        x = digits.length + 1;
        addedDigits = new int[x];
        addedDigits[0] = 1;
        for (int i =1; i < x ; i++){
            addedDigits[i] = digits[i-1];
        }

        return addedDigits;

    }

    public static void main(String[] args) {
        int [] a= {9,9};
        PlusOne plusOne = new PlusOne();
        int [] suma = plusOne.plusOne(a);
        for (int b : suma){
            System.out.print(b);
        }
    }
}
