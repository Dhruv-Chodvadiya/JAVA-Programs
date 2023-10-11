import java.util.Stack;

public class _009_postfix_infix {
    public static void main(String[] args) {
        String postfix="abc*d/ef-*+";
        Stack<String> stack = new Stack<>();

        for (int i =0;i<postfix.length();i++) {
            if (postfix.charAt(i) == '+' || postfix.charAt(i) == '-' || postfix.charAt(i) == '*'
                    || postfix.charAt(i) == '/') {
                String first = stack.pop();
                String second = stack.pop();
                String inx = "(" + second + postfix.charAt(i) + first + ")";
                stack.push(inx);
            } else {
                stack.push(String.valueOf(postfix.charAt(i)));
            }
        }
        System.out.println(stack.pop());
    }
}
