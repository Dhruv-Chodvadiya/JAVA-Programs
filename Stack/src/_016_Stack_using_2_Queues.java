import java.util.LinkedList;
import java.util.Queue;

public class _016_Stack_using_2_Queues {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

    }
    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int value) {
            if (!q1.isEmpty()) {
                q1.add(value);
            } else {
                q2.add(value);
            }
        }
    }
}
