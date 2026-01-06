package Stack;

import DoublylinkedKist.DoublyLinkedList;

public class LinkedStack<E> implements Stack<E> {
   // SinglyLinkedList<E> list=new SinglyLinkedList<E>();
    DoublyLinkedList<E> list=new DoublyLinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E data) {
       list.addFirst(data);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E top() {
        return list.getFirst();
    }
    public void display(){
        list.display2();
    }
}
