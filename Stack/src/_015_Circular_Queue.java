import java.util.Arrays;

public class _015_Circular_Queue {
    static int[] queue=new int[5];
    static int rear=-1,front=-1;
    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        remove();
        add(60);
        remove();
        System.out.println(Arrays.toString(queue));


        int i=front;
        int j=rear;
        while (i != j){
            System.out.print(queue[i]+" ");
            i=(i+1)% queue.length;
            if(i == queue.length-1){
                j=j+1;
            }
        }

    }
    public static void add(int val){
        if((rear+1)% queue.length==front){
            System.out.println("Full");
            return;
        }
        if(front==-1){
            front++;
        }
        rear=(rear+1)% queue.length;
        queue[rear]=val;
    }
    public static void remove(){
        if(front==-1 && rear==-1){
            System.out.println("Empty");
            return;
        }
        if(rear==front){
            rear = front = -1;
        }else {
            front = ( front + 1 ) % queue.length;
        }
    }
}
