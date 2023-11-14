package _009_count_loop_Node;

public class count_loop {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.addloop();
        System.out.println();
        list.checkloop();
    }
}

class LinkedL {
    Node head;
    Node tail;
    LinkedL() {
        head = null;
        tail = null;
    }
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void addloop() {
        tail.next=head.next;
    }
    public void checkloop() {
        Node slow=head;
        Node fast=head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                System.out.println("loop");
                return ;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}