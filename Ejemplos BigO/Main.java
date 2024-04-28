import java.util.Arrays;

// Ejemplos de notaciones BigO

public class Main {

    /* Ejercicio 1
     * Complejidad temporal lineal O(N) 
     * 
     * porque se necesita recorrer la mitad de los elementos del array
     * y si el array crece el tiempo de ejecucion crece tambien.
     */

    static void reverseArray(int[] array) {
        for(int i=0; i<array.length/2; i++) {
            int reversePosition = array.length - 1 - i;
            int tempVal = array[i];
            array[i] = array[reversePosition];
            array[reversePosition] = tempVal;
        }
        System.out.println(Arrays.toString(array));
    }

    /* Ejercicio 2
     * Complejidad cuadratica O(N^2)
     * 
     * porque se tiene que recorrer dos veces el array.
     */

    static void printUnorderedPairs(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                System.out.println(i + "  " + j);
            }
        }
    }

    /* Ejercicio 3
     * Complejidad temporal lineal O(N)
     * 
     * porque cuando b crece, el tiempo crece con b.
     */
    
     static int product(int a, int b) {
        int result = 0;
        for(int i=0; i<b; i++) {
            result+= a;
        }
        System.out.println(result);
        return result;
    }

    /* Ejercicio 4
     * Complejidad cuadratica O(N^2)
     * 
     * porque cada funcion tiene una complejidad lineal O(N),
     * por lo tanto, se multiplican las dos complejidades y nos
     * da un resultado cuadratico.
     */

    public int[] copyArray(int[] array) {
        int[] copy = new int[0];
        for(int val: array) {
            copy = appendToNew(copy, val);
        }
        return copy;
    }

    private int[] appendToNew(int[] array, int val) {
        int[] bigger = new int[array.length + 1];
        for(int i=0; i<array.length; i++) {
            bigger[i] = array[i];
        }
        bigger[bigger.length-1] = val;
        return bigger;
    }

    /* Ejercicio 5
     * Complejidad O(A * B)
     * 
     * porque las dimensiones de los dos arreglos pueden ser muy
     * diferentes.
     */

    static void printPairsTwoArrays(int[] arrayA, int[] arrayB) {
        for(int valA: arrayA) {
            for(int valB: arrayB) {
                System.out.println(valA + " " + valB);
            }
        }
    }

    /* Ejericio 6
     * Complejidad logaritmica O(logN)
     * 
     * porque va dividiendo el valor de entrada entre 2.
     */

     static int intPowerOfTwo(int val) {
        int result = 0;
        while(val > 1) {
            result++;
            val /= 2;
        }
        System.out.println(result);
        return result;
     }

    /* Ejercicio 7
     * Complejidad lineal y cuadratica O(N * N^2)
     * 
     * porque un string es un array de caracteres ('h','o','l','a')
     * y se esta sobreescribiendo cada caracter en la concatenacion de string por lo que
     * nos lleva a recorrer el array multiples veces
     * ademas, el listado de nombres es un array, de tal manera que si
     * el array crece, el tiempo de ejecucion tambien crecera.
     */

    static String commaSeparatedList(String[] names) {
        String nameList = "";

        for(String name: names) {
            nameList += name + ",";
        }

        return nameList.substring(0, nameList.length() -1);
    }

    public static void main(String[] args) {
        
    }
}