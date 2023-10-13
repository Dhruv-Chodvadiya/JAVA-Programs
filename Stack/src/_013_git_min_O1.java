import java.nio.charset.IllegalCharsetNameException;
import java.util.Stack;

public class _013_git_min_O1 {
    static Stack<Integer> stack=new Stack<>();
    static int min;
    public static void main(String[] args) {
        push(8);
        push(5);
        push(7);

        pop();

        System.out.println(min);
    }
    public static void push(int val){
        if(stack.isEmpty()){
            stack.push(val);
            min=val;
        }
        else if (min > val) {
            stack.push(2*val-min);
            min=val;
        }
        else {
            stack.push(val);
        }
    }
    public static void pop(){
        if(stack.isEmpty()){
            System.out.println("empty");
            return;
        }
        else if (min>stack.peek()) {
            min=2*min-stack.peek();
            stack.pop();
        }else {
            stack.pop();
        }
    }
}
