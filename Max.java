import java.util.Arrays;

public class Max {
    public static void main(String[] args){
        int[] arr = {1,3,23,9,18};
        //System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }
     /*static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }*/

    // work on edge cases here, like array being null

    static int maxRange(int[] arr, int start, int end){

        if(end > start){
            return -1;
        }

        int maxVal = arr[0];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
