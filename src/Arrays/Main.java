package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr =new Arrayss();
        // int []numbers=new int[5];
         int []numbers={1,7,3,4,2,6,5,8};
         Arrays.sort(numbers);
         arr.Traversal(numbers);
       //  int result= arr.LinearSearch(numbers,8);
        int result= arr.binarySearch(numbers,7,0, numbers.length-1);

         if(result!=-1)
             System.out.println("Value found at index :"+result);
         else
             System.out.println("Value not found");
        // System.out.println(Arrays.toString(numbers));

       // arr.input(numbers);

      //   arr.Traversal(numbers);
       // arr.Reverse_Traversal(numbers);

       // arr.update(numbers,2,7);


        //arr.Traversal(numbers);











    }

}
