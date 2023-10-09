import java.util.Stack;

public class _003_palindrome_string {
    public static void main(String[] args) {
        String s = "naman";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char i : s.toCharArray()){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(s.equals(sb.toString()));
    }
}
