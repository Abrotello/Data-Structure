package sevenBoom;

public class SevenBoom {

    public String sevenBoom(int[] array) {
        for(int i=0; i<array.length; i++) {
            boolean hasSeven = hasNumberSeven(array[i]);
            if(hasSeven) return new String("Boom!");
        }
        return new String("There is no 7 in the array");
    }

    private boolean hasNumberSeven(int number) {
        return String.valueOf(number).contains("7");
    }

    public static void main(String[] args) {
        SevenBoom sevenBoom = new SevenBoom();
        System.out.println(sevenBoom.sevenBoom(new int[]{1,1,3,47}));
    }
}