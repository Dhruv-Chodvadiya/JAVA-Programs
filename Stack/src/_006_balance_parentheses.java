import java.util.Stack;

public class _006_balance_parentheses {
    public static void main(String[] args) {
        String s = "(()())(())";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }
                if (stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '[' && s.charAt(i) == ']'
                        || stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
