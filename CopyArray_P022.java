package Assignment;

import java.util.Arrays;

public class CopyArray_P022 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4,};
        int[] array2 = Arrays.copyOf(array1, array1.length);

        System.out.println("Copied array: " + Arrays.toString(array2));
    }


}
