package _010_MainLinkedList;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        list l=new list();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
//        l.insert(40);
        l.insert(50);
        l.insert(60);
        l.insert(70);
        l.insert(80);

//        l.update(40,400);

//        l.find(400);

//        l.size();

//        l.printReverse();

//        l.getNNode(4);

//        l.length();

//        l.getEndNode(5);

//        l.deleteNodePointer(l.head.next);

        l.mid();

//        l.tail.next = l.head.next;
//        System.out.println(l.loopDetect());

//        l.tail.next = l.head.next;
//        System.out.println(l.loopNodeCount());

//        l.deleteDuplicate();

//        l.revers();

        l.print();
    }
}
class list{
    Node head,tail;
    int totalNode = 0;
    public void insert(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else {

            tail.next=newNode;
            tail=tail.next;
        }
    }
    public void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void update(int oldv,int newv){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;

        while (temp != null){
            if(temp.data==oldv){
                temp.data=newv;
            }
            temp=temp.next;
        }
    }

    public void find(int val) {
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while (temp != null){
            if(temp.data==val){
                System.out.println(temp.data+" = find val");
                return;
            }
            temp=temp.next;
        }
        System.out.println(temp.data+" Not find");
    }

    public void size() {
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        int count=0;
        while (temp != null){
            count++;
            temp=temp.next;
        }
        System.out.println("LinkedList size = "+count);
    }
    public void mid() {
        Node slove=head;
        Node fast=head;
        while (fast.next != null && fast.next.next != null){
            slove=slove.next;
            fast=fast.next.next;
        }
        System.out.println("Mid = "+slove.data);
    }

    public void length() {
        Node temp = head;

        while (temp != null){
            totalNode++;
            temp = temp.next;
        }
        System.out.println("Total Nodes In LinkedList is: " + totalNode);
    }

    public void printReverse() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

//        Node current = tail;
//        do{
//            System.out.print(current.data + " ");
//            Node temp = head;
//            while (temp.next != current){
//                temp = temp.next;
//            }
//            current = temp;
//        }while (current != head);
//        System.out.print(head.data + " ");

        System.out.println();
    }

    public void getNNode(int value) {
        Node temp = head;
        int count = 0;

        while (temp != null){
            count++;
            if(count == value){
                System.out.print("Get nth node in linked list: " + temp.data + " ");
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void getEndNode(int value) {
        Node L = head;

        while (L != null){
            totalNode++;
            L = L.next;
        }

        if(value > totalNode){
            System.out.println("Enter Correct Position..!!");
            return;
        }
        Node temp = head;
        for (int i=0;i<totalNode-value;i++){
            temp = temp.next;
        }
        System.out.println("Get nth node from end in linked linked list: " + temp.data);
    }

    public void deleteNodePointer(Node p) {
        Node temp = p;
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }

    public boolean loopDetect() {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public int loopNodeCount() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        int count = 1;
        fast = fast.next;
        while (fast != slow){
            count++;
            fast = fast.next;
        }
        return count;
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
                c.next = temp;
                c = c.next;
            }
        }
    }

    public void revers(){
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node curr = temp;
            temp = temp.next;
            curr.next = prev;
            prev = curr;
        }
        head = prev;
    }

}
class Node {
    int data;
    Node next;
    Node(int val) {
        this.data = val;
    }
}
