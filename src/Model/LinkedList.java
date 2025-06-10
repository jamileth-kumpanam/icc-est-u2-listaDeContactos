package Model;

public class LinkedList {

    public Node head;
    private int size;

    public LinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    

    public void appendToTail(int value){
        if (head == null){
            head = new Node (value);
            size++;
            return;
        }
    }
    
}
