public class SingleMultiplicationTable {

    public static void main(String[] args) {
        int number = 5;

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(String.format("%d * %d = %d", number, multiplier, number * multiplier));
        
        }
    }
    
}
