import java.util.Stack;

public class _017_Queue_using_2_Stacks {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);

        q1.remove();

        q1.print();
    }
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public void add(int val){
            s1.add(val);
        }

        public void remove() {
            int top=-1;
            if (!s1.isEmpty()) {
                while (!s1.isEmpty()) {
                    top=s1.pop();
                    if (s1.isEmpty()) {
                        break;
                    }
                    s2.add(top);
                }
                while (!s2.isEmpty()){
                    s1.push(s2.pop());
                }
            }
        }

        public void print(){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            while (!s2.isEmpty()){
                System.out.print(s2.pop()+" ");
            }
        }


    }
}
