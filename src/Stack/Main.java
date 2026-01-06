package Stack;

public class Main {
    public static void main(String[] args) {
      //  LinkedStack<Integer> sList=new LinkedStack<Integer>();
        ArrayStack<Integer> sList=new ArrayStack<Integer>(5);

        sList.push(10);
        sList.push(20);
        sList.push(30);
        sList.push(40);
        sList.push(50);
        sList.push(60);
        System.out.println("top is :"+sList.top());
      //  sList.display();
        while (!sList.isEmpty()){
            System.out.println("element removerd:"+sList.pop());
        }






    }
}
