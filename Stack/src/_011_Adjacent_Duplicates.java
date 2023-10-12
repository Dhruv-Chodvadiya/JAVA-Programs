import java.util.Stack;

public class _011_Adjacent_Duplicates {
    public static void main(String[] args) {
        String s="abbaca";
        Stack<Character> stack =new Stack<>();

        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            } else if (stack.peek()==s.charAt(i)) {
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.get(i));
        }
    }
}
