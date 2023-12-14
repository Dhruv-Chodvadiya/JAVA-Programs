package _012_Doubly_LinkedList;

public class MainD {
    public static void main(String[] args) {
        LinkedListt list = new LinkedListt();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

//        list.delete(20);

//        list.paris(70);

        list.Reverse();

        list.print();
        list.printRev();
    }
}
class LinkedListt{
    Nod head;
    Nod tail;

    public void insert(int data) {
        Nod node = new Nod(data);
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
        Nod temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void printRev(){
        Nod temp = tail;
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
            Nod temp = tail.prev;
            temp.next = null;
            tail = temp;
        }else {
            Nod temp = head;
            while (temp.data != data){
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
    }

    public void paris(int sum) {
        Nod left = head;
        Nod right = tail;

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

class Nod {
    int data;
    Nod prev;
    Nod next;

    public Nod(int data){
        this.data = data;
    }
}
