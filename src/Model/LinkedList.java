package Model;

public class LinkedList<T> {
    private NodeGeneric<T> head;

    public void appendToTail(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data, null);
        if (head == null) {
            head = newNode;
        } else {
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void deleteByValue(T data) {
        if (head == null) return;

        if (head.getData().equals(data)) {
            head = head.getNext();
            return;
        }

        NodeGeneric<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(data)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void printAll() {
        NodeGeneric<T> current = head;
        while (current != null) {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
    }
}
