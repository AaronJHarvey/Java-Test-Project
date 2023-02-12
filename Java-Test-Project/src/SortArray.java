import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        char vowels[] = { 'e', 'u', 'o', 'a', 'i' };

        Arrays.sort(vowels);

        System.out.println("The sorted array: " + Arrays.toString(vowels));
    }
    
}
