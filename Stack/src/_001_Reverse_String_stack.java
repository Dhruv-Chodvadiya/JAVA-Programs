import java.util.Stack;

public class _001_Reverse_String_stack {
    public static void main(String[] args) {
        String s = "Hello";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length();i++){
            stack.push(s.charAt(i));
        }
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.pop());
        }
    }
}
