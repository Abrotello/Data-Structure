import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Un agrama es una palabra creada a partir de la reordenacion de las letras de otra palabra.
 * Dado un array de strings, devolver los anagramas agrupados. Cualquier orden es valido
 * 
 * Ejemplo:
 * Input: words = {"saco", "arresto", "programa", "rastreo", "caso"}
 * Output: [["saco", "caso"], ["arresto", "rastreo"]. ["programa"]].
 * 
 * O(N) O(C)
 * 
 */

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] words) {
        if(words == null || words.length == 0) return Collections.emptyList();
        
        Map<String, List<String>> anagramMap = buildAnagramMap(words);
        return new ArrayList<>(anagramMap.values());
    }

    private Map<String, List<String>> buildAnagramMap(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word : words) {
            String hash = getAnagramHash(word);
            if(!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }

            map.get(hash).add(word);
        }
        System.out.println(map);
        return map;
    }

    //Alfabeto en ingles y solamente palabras en minusculas
    //O(N)
    private String getAnagramHash(String s) {
        int[] letterCount = new int[26];
        for(int c : s.toCharArray()) {
            letterCount[c - 'a']++;
        }

        return Arrays.toString(letterCount);
    }
}
