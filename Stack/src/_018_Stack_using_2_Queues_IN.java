import java.util.LinkedList;
import java.util.Queue;

public class _018_Stack_using_2_Queues_IN {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push1(10);
        s1.push1(20);
        s1.push1(30);
        s1.push1(40);

        s1.print();
    }
    public static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        public void push1(int val){
            if(q1.isEmpty()){
                q1.add(val);
            }
            else {
                while (!q1.isEmpty()){
                    q2.add(q1.poll());
                }
                q1.add(val);
                while (!q2.isEmpty()){
                    q1.add(q2.poll());
                }
            }
        }
        public void print(){
            while (!q1.isEmpty()){
                System.out.print(q1.poll()+" ");
            }
        }
    }
}
