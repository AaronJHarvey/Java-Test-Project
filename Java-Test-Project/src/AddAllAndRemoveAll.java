import java.util.ArrayList;

public class AddAllAndRemoveAll {

    public static void main(String[] args) {
        
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);

        ArrayList<Integer> moreOddNumbers = new ArrayList<>();

        moreOddNumbers.add(7);
        moreOddNumbers.add(9);
        moreOddNumbers.add(11);

        oddNumbers.addAll(moreOddNumbers);

        System.out.println(oddNumbers.toString());

        oddNumbers.removeAll(moreOddNumbers);
        System.out.println(oddNumbers.toString());
    }
    
}
