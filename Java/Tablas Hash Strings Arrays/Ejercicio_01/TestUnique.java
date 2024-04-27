public class TestUnique {
    public static void main(String[] args) {
        String cadena1 = "abcdefghi";
        String cadena2 = "AcBNmloa";
        String cadena3 = "aabbccddee";
        String cadena4 = "12345678910abcdefghijklmnopqrstuvwxyzABCDE";
    
        Unique.isUnique(cadena1);
        Unique.isUnique(cadena2);
        Unique.isUnique(cadena3);
        Unique.isUnique(cadena4);
    }
}
