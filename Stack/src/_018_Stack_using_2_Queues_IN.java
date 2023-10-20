import java.util.LinkedList;
import java.util.Queue;

public class _018_Stack_using_2_Queues_IN {
    public static void main(String[] args) {
        Stack s1=new Stack();
    }
    public static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
    }
}
