/**
 * Dado un String s que contiene frases (palabras separadas por espacios)
 * retornar el tamaño del ultimo string
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String [] palabras = s.split(" ");
        return palabras[palabras.length -1].length();

    }
}
