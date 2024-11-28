import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        /*
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8567);
        System.out.println(list);
         */
        for(int  i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));//pass index here
        }
        System.out.println(list);



    }
}
