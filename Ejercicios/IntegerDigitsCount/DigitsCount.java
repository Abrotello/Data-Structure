package IntegerDigitsCount;

public class DigitsCount {

    public int count(int number) {
        if(Math.abs(number) < 10) return 1;
        return 1 + count(number/10);
    }

    public static void main(String[] args) {
        DigitsCount digitsCount = new DigitsCount();
        System.out.println(digitsCount.count(999999));
    }
}
