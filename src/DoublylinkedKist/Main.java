package DoublylinkedKist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<>();
        dlist.addFirst(3);
        dlist.addFirst(4);
        dlist.addFirst(2);
        dlist.addLast(5);
        dlist.addLast(6);
        dlist.removeFirst();
        dlist.removeLast();
        dlist.dislpay();

    }
}
