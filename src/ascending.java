import java.util.*;

public class ascending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size]; //Checks for input size
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        //Checks if array is sorted in ascending order
        boolean isAscending = true;
        for (int i = 1; i < size && isAscending; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
            }
        }

        //prints results
        System.out.println(isAscending);
    }
}