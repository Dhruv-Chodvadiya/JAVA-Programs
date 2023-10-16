import java.util.Stack;

public class _014_Queue {
    static int[] queue=new int[10];
    static int front=-1,rear=-1;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        print();
        dequeue();
        print();
    }
    public static void enqueue(int val){
        if(rear== queue.length-1){
            System.out.println("Full");
            return;
        }
        rear++;
        queue[rear]=val;
    }
    public static void dequeue(){
        if(front==rear){
            System.out.println("Empty");
            return;
        }
        front++;
        System.out.println(queue[front]+" DELETE");
        if(front==rear){
            front=-1;
            rear=-1;
        }
    }
    public static void print(){
        if(front==rear){
            System.out.println("Empty");
            return;
        }
        for(int i=front+1;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
