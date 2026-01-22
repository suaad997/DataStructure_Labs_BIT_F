package Queue;

public class ArrayQueue<E> implements Queue<E> {
     private E arr[];
     private static final int CAPICITY=1000;
     private int f;
     private int size;

    public ArrayQueue() {
     this(CAPICITY);

    }
    public ArrayQueue(int c) {
        arr=(E[])new Object[c];
        f=0;
        size=0;

    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E data) {
        if(size()==arr.length){
           // System.out.println("Can't add more, Queue is full");
            throw new IllegalStateException("Can't add more, Queue is full");
        }
        else {
            int av=(f+size)% arr.length;
            arr[av]=data;
            size++;
        }
    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E delete=arr[f];
        size--;
        arr[f]=null;
        f=f+1;
        return delete;
    }

    @Override
    public E front() {
        if (isEmpty())return null;
        return arr[f];
    }
}
