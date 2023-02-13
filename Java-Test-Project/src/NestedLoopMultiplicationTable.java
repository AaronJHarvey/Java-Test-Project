public class NestedLoopMultiplicationTable {

    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            System.out.println(String.format("\nmultiplication table of %d", number));
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(String.format("%d * %d = %d", number, multiplier, number * multiplier));
            }
        }
    }  
}
