package Queue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> aqueue=new ArrayQueue<Integer>(3);
        aqueue.enqueue(1);
        aqueue.enqueue(2);
        aqueue.enqueue(3);
        aqueue.enqueue(4);
        System.out.println("the first element is:"+aqueue.front());
        while (!aqueue.isEmpty()){
            System.out.println("element removed:"+aqueue.dequeue());
        }


    }
}
