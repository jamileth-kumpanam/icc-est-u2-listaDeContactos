package Controller;

import Model.NodeGeneric;
import Model.Contact;

public class ContactManager {
    private NodeGeneric<Contact> head;
    private int size;

    public ContactManager() {
        this.head = null;
        this.size = 0;
    }

    public void addContact(Contact contact) {
        NodeGeneric<Contact> newNode = new NodeGeneric<>(contact, null);
        if (head == null) {
            head = newNode;
        } else {
            NodeGeneric<Contact> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public Contact findContactByName(String name) {
        NodeGeneric<Contact> current = head;
        while (current != null) {
            if (current.getData().getName().equalsIgnoreCase(name)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteContactByName(String name) {
        NodeGeneric<Contact> current = head;
        NodeGeneric<Contact> prev = null;

        while (current != null) {
            if (current.getData().getName().equalsIgnoreCase(name)) {
                if (prev == null) {
                    head = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                size--;
                return;
            }
            prev = current;
            current = current.getNext();
        }
    }

    public void printList() {
        NodeGeneric<Contact> current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public NodeGeneric<Contact> getHead() {
        return head;
    }
}

