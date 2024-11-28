import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args){
        int[] arr = {1,3,23,9,18};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;

    }
}
