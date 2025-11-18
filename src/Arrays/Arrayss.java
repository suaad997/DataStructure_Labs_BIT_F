package Arrays;

import java.util.Scanner;

public class Arrayss {
Scanner scanner =new Scanner(System.in);


    public void Traversal(int []a){
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public void Traversal2(int []a){
        for(int e:a)
            System.out.println(e);
    }

    public void input(int []a){
    System.out.println("Please enter "+a.length+" elements:");
        for(int i=0 ; i<a.length;i++)
         a[i]=scanner.nextInt();
}

}
