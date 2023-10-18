import java.util.LinkedList;
import java.util.Queue;

public class _016_Stack_using_2_Queues {
    public static void main(String[] args) {
        Stack s = new Stack();
    }
    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
    }
}
