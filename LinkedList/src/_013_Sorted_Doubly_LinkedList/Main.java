package _013_Sorted_Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(15);
        list.insert(24);
        list.insert(30);
        list.insert(50);

//        list.head = list.sortedInsert(list.head,35);
//        list.head = list.sortedInsert(list.head,35);

//        list.deleteDuplicate();

        list.deleteNodePointer(list.head.next);

        list.print();
        list.printRev();
    }
}
class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printRev(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public Node sortedInsert(Node head, int value) {
        Node node = new Node(value);
        Node temp = head;

        if(temp == null || temp.data >= node.data){
            node.next = temp;
            temp.prev = node;
            return node;
        }
        while (temp.next != null && temp.next.data < node.data){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev=temp;

        return head;
    }
    public void deleteDuplicate() {
        Node c=head;
        while (c != null){
            Node temp=c.next;
            if(temp == null){
                return;
            }else {
                while (temp.data == c.data) {
                    temp = temp.next;
                }
                temp.prev = c;
                c.next = temp;
                c = c.next;
            }
        }
    }

    public void deleteNodePointer(Node p) {
        Node temp = p.next;
        temp.prev = p.prev;
        temp.prev.next = temp;
    }
}
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }
}
