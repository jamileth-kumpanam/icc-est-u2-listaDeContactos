package Model;

public class NodeGeneric<T> {

    private T value;
    private NodeGeneric<T> next;

    public NodeGeneric(T value, NodeGeneric<T> next) {
        this.value = value;
        this.next = null;
    }

    public T getData() {
        return value;
    }

    public void setData(T data) {
        this.value = data;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    } gatbdnbfdnbdndbnd

    
}
