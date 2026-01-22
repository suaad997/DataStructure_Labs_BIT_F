package Queue;

import DoublylinkedKist.DoublyLinkedList;

public class DLinkedQueue<E> implements Queue<E> {
    DoublyLinkedList<E> dlist =new DoublyLinkedList<>();
    @Override
    public boolean isEmpty() {
        return dlist.isEmpty();
    }
    @Override
    public int size() {
        return dlist.size();
    }
    @Override
    public void enqueue(E data) {
        dlist.addLast(data);
    }
    @Override
    public E dequeue() {
        return dlist.removeFirst();
    }

    @Override
    public E front() {
        return dlist.getFirst();
    }
}
