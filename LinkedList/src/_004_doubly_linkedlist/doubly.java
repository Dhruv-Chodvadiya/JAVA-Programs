package _004_doubly_linkedlist;

public class doubly {
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
}

