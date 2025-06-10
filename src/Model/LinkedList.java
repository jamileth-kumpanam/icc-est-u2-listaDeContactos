package Model;

public class LinkedList<T> {

    public NodeGeneric<T> head;
    private int size = 0;

    public void appendToTail(T data){
        if (head == null){
            head = new NodeGeneric<>(data);
            size++;
            return;
        }
    }

    NodeGeneric<T> current = head;
    while(current.getNext() != null){
        current = current.getNext();
    }

}
