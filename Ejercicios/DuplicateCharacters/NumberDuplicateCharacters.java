import java.util.HashMap;
import java.util.Map;

public class NumberDuplicateCharacters {

    public int duplicateCount(String s) {
        int count = 0;
        if(s.trim() == "") return count;

        Map<Character, Integer> map = new HashMap<>();
        for( char c : s.toCharArray() ) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
                if(map.get(c) == 2) count++;
            } else {
                map.put(c, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberDuplicateCharacters duplicateCharacters = new NumberDuplicateCharacters();
        int count = duplicateCharacters.duplicateCount("Indivisibilities");
        System.out.println(count);
    }
}