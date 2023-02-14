import java.util.ArrayList;

public class RemoveIf {
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers.toString());

        numbers.removeIf(number -> number % 2 == 1);

        System.out.println(numbers.toString());
    }

}
