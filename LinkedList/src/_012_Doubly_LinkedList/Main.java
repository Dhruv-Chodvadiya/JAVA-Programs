package _012_Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

//        list.delete(20);

        list.paris(70);

        list.Reverse();

        list.print();
        list.printRev();
    }
}
class LinkedList{
    Node head;
    Node tail;

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
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
    public void delete(int data){
        if(head.data == data){
            head = head.next;
            if(head != null){
                head.prev = null;
            }else {
                head = null;
                tail = null;
            }
        } else if (tail.data == data) {
            Node temp = tail.prev;
            temp.next = null;
            tail = temp;
        }else {
            Node temp = head;
            while (temp.data != data){
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
    }

    public void paris(int sum) {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right){
            if(left.data + right.data == sum){
                System.out.print(left.data + " + " + right.data + " = " + sum);
                System.out.println();
                return;
            } else if (left.data + right.data < sum) {
                left = left.next;
            }else {
                right = right.prev;
            }
        }
        System.out.print("Pairs is not found..");
    }

    public void Reverse() {
    }


}

class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
