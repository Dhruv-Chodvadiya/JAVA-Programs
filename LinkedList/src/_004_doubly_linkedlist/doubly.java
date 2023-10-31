package _004_doubly_linkedlist;

public class doubly {
    Node head;
    private int size;

    doubly() {
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
    }
}

