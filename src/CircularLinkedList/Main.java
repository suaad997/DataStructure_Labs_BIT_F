package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        CircularLinkedList<Integer> list2=new CircularLinkedList<Integer>();
        list.addFirst("Jawaher");
        list.addFirst("Safia");
        list.addLast("Manal");
        list.addLast("Ali");
        list.addFirst("Asala");
        list.removeFirst();
        list.removeLast();
        list.display();




    }
}
