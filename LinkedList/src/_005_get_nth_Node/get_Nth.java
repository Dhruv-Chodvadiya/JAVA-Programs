package _005_get_nth_Node;
public class get_Nth {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.nth(5);
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
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void nth(int i) {

        int count=0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        int n=0;
        Node temp1 = head;
        while (temp1 != null){
            n++;
            if(n == i){
                System.out.println("Nth Value = "+temp1.data);
                return;
            }
            temp1 = temp1.next;
        }
        System.out.println("No Data");
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}