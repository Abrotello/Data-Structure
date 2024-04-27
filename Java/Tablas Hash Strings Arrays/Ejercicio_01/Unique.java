import java.util.HashSet;
import java.util.Set;

    /*
     * Dado un metodo que recibe un String, comprobar si todos los caracteres son
     * unicos o no
     * 
     * isUnique("abcde") => true;
     * isUnique("abcded") => false;
     * 
     * Dos bucles for anidados O(N^2)
     * a: b c d e
     * b: c d e
     * c: d e
     * d: e
     * 
     * Tabla Hash un for O(N)
     * add(a) add(b) add(c) add(d) add(e) 'd' ya existe y no se agrega
     * 
     * Consulta en la tabla O(1)
     */

public class Unique {
    
    //Tomando en cuenta la longitud de caracteres del codigo ASCII
    private static final int NUMBERS_OF_CHARS = 128;
    
    public static boolean isUnique(String s) {
        //Complejidad constante O(1)
        if(s.length() > NUMBERS_OF_CHARS ) return false;

        //Tabla HashSet complejidad lineal O(N)
        Set<Character> characters = new HashSet<>();
        for(Character c : s.toCharArray())  {
            if(characters.contains(c)) return false;
            characters.add(c);
        }
        System.out.println(characters);
        return true;
    }
}
