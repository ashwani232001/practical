package Array;
import java.util.Arrays;


public class SortArray {
    public static void main(String[] args) {
        int num_array[] = {2,4,9,1,3,7,8,5,6};
        String str_array[] = {"A","S","H","W","A","N","I"};

        System.out.println("Original values = " + Arrays.toString(num_array));
        Arrays.sort(num_array);
        System.out.println("Sorted Values = " + Arrays.toString(num_array));

        System.out.println("Original Strings = " +Arrays.toString(str_array));
        Arrays.sort(str_array);
        System.out.println("Sorted Strings = " + Arrays.toString(str_array));
    }
}
