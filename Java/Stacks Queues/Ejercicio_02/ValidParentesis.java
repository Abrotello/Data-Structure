package Ejercicio_02;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Dado un String que solamente contiene los caracteres (), {}, [],
 * implementa un algoritmo para determinar si es valido.
 * 
 * Ejemplo 1:
 *  Input: "([]){}"
 *  Output: true
 * 
 * Ejemplo 2:
 *  Input: "({)}"
 *  Output: false
 */

public class ValidParentesis {
    
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[' ) {
                stack.push(getOpossite(c));
            } else {
                if( stack.isEmpty() || stack.pop() != c) return false;
            }
        }

        return stack.isEmpty();
    }

    private Character getOpossite(char c) {
        if(c == '(') return ')';
        if(c == '{') return '}';
        if(c == '[') return ']';

        return '0';
    }
    public static void main(String[] args) {
        String cadena = "({[]}[])";
        String cadena2 = "[{)]";

        ValidParentesis valid = new ValidParentesis();
        System.out.println(valid.isValid(cadena));
        System.out.println(valid.isValid(cadena2));
    }
}
