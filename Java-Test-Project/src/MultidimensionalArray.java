import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {
        int medicineRoutine[][] = {
            {1,2,3,4,5,6,7},
            {0,1,1,0,1,1,0},
            {1,0,1,0,1,0,0},
            {0,0,1,1,0,1,0},
        };
        System.out.println(Arrays.deepToString(medicineRoutine).replace("],", "]\n"));
    }
    
}
