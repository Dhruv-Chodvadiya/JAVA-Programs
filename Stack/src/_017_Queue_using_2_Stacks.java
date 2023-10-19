import java.util.Stack;

public class _017_Queue_using_2_Stacks {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
    }
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public void add(int val){
            s1.add(val);
        }

    }
}
