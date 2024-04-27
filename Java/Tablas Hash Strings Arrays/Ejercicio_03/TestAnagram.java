import java.util.List;

public class TestAnagram {
    public static void main(String[] args) {
        
        Anagrams anagramas = new Anagrams();
        List<List<String>> anagrams = anagramas.groupAnagrams(new String[]{"saco", "arresto", "programa", "rastreo", "caso"});

        System.out.println(anagrams);
    }    
}
