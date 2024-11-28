import java.util.*;
public class code1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /*
        // Array of primitives:
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 64;
        arr[3] = 52;
        arr[4] = 22;
        System.out.println("enter the arr:");
        
        //using for loop:
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
        }*/


        //Array of objects:
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
