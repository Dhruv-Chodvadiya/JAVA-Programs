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
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> " );
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void deletefirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deletelast(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node nextNode = head.next;
        while(nextNode != null) {
            nextNode = nextNode.next;
            currNode = currNode.next;
        }
        currNode.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverseIterate() {
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head) {
        Node newHead = reverseRecursive(head.next);
        return newHead;
    }
}

