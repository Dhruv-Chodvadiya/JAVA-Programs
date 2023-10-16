import java.util.Stack;

public class _014_Queue {
    static int[] queue=new int[10];
    static int front=-1,rear=-1;
    public static void main(String[] args) {
        enqueue(10);
    }
    public static void enqueue(int val){
        if(rear== queue.length-1){
            System.out.println("Full");
            return;
        }
    }
}
