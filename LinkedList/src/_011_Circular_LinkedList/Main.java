package _011_Circular_LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

//        System.out.println(list.countLoop(list.head));

//        list.Chack();

//        list.Exchange();

        list.print();
    }
}
class LinkedList{
    Node head;
    Node temp;
    //Node tail;
    LinkedList(){
        head = null;
        temp = null;
        //tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            temp = node;
            //tail = node;
        }else {
            temp.next = node;
            temp = node;
            temp.next = head;
            //tail.next = node;
            //tail = node;
            //tail.next = head;
        }
    }
    public int countLoop(Node p){
        Node fast = p;
        Node slow = p;
        Boolean check = false;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                check = true;
                break;
            }
        }
        int count = 1;
        if(check){
            slow = slow.next;
            while (slow != head){
                slow = slow.next;
                count++;
            }
        }else {
            return 0;
        }
        return count;
    }
    public void print() {
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != head);
    }

    public void Chack() {
        Node fast = head;
        Node slow = head;
        Boolean check = false;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Circular LinkedList");
        }else {
            System.out.println("Singly LinkedList");
        }
    }
    public void Exchange() {
        int first = head.data;
        head.data = temp.data;
        temp.data = first;
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}