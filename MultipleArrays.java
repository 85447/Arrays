import java.util.*;
public class MultipleArrays {
    public static void main(String[] args){
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        int [][] arr = new int[3][2];
        Scanner in = new Scanner(System.in);
        /*int [][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };*/

        /*
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }*/
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));

        }


    }
}
