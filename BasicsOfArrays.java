public class BasicsOfArrays {
    public static void main(String[] args){
        // Q: store a roll number
        int a = 19;
        //Q: store a person's name
        String name = "Siya Kalia";

        //Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 34;
        int rno3 = 45;


        /*
        //syntax:
        // datatype[] variable_name = new datatype[size];
        int[] rnos = new int[5];

        int[] rnos2 = {23,24,25,26,27};
         */

        int[] ros;//declaration of an array
        ros = new int[5];//initialization of an array (actually here the object is created in the memory(heap)
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
