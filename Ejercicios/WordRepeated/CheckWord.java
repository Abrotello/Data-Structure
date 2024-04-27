/*
 * Crear un programa que cuente cuantas veces se repite una palabra
 * 
 * Ejemplo:
 * Este texto es un ejemplo de cuantas palabras se repiten en un texto. Este texto tiene como finalidad
 * representar la cantidad de veces que se repite una palabra en este texto.
 * 
 * Input: texto
 * Output: 4
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckWord {

    
    public int countWord(String text, String word) {
        int counter = 0;
        if(word.equals(text)) return counter+=1;
        if(word.length() > text.length()) return counter;

        String[] words = text.split("[\\s+\\.\\,\\;]");
        Set<String> map = new HashSet<>();
        map.add(word);

        for(String w : words) {
            w = w.toLowerCase();
            if(map.contains(w)) counter++;
        }

        return counter;
    }

    public Map<String, Integer> wordsCounter(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split("[\\s+\\.\\,\\;]");

        for(String word : words) {
            if(!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        return map;
    }
    
    public static void main(String[] args) {
        CheckWord checkWord = new CheckWord();
        String text = "Tres tristes tigres tragaban trigo en un Trigal. En un trigal, tres tristes tigres tragaban trigo. trigo";
        
        String word = "trigo";

        System.out.println(checkWord.countWord(text, word));
        System.out.println(checkWord.wordsCounter(text));
    }
}