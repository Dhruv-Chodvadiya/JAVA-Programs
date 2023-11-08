package _006_delete_duplicate;
public class delete {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        list.insert(10);
        list.insert(10);
        list.insert(30);
        list.insert(30);
        list.insert(50);
        list.print();
        list.delete();
        System.out.println();
        list.print();
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
    public void delete() {
        Node c=head;
        while (c != null){
            Node temp=c.next;
            if(temp == null){
                return;
            }else {
                while (temp.data == c.data) {
                    temp = temp.next;
                }
                c.next = temp;
                c = c.next;
            }
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
