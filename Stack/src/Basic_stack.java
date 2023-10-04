public class Basic_stack {
    public static void main(String[] args) {
        int[] stack=new int[5];
        int top=-1;

        top=push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,30);
        top = push(stack,top,40);
        top = push(stack,top,50);
        print(stack,top);
        top = pop(stack,top);
        System.out.println();
        print(stack, top);
        System.out.println();
        top = push(stack,top,50);
        print(stack,top);
        peek(stack,top);
        System.out.println("is empty: " + isEmpty(top));
        System.out.println("Size: " + size(top));
    }
    public static void print(int [] stack,int top){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }
    public static int push(int[] stack,int top,int val){
        if(stack.length-1==top){
            System.out.println("Stack is full");
            return top;
        }
        top++;
        stack[top]=val;
        return top;
    }
    public static int pop(int[] stack,int top){
        if(top==-1){
            System.out.println("Stack is empty");
            return top;
        }
        top--;
        return top;
    }
    public static void peek(int[] stack,int top){
        System.out.println("peek value = "+stack[top]);
    }
    public static boolean isEmpty(int top){
        if(top == -1) {
            return true;
        }
        return false;
    }

    public static int size(int top){
        return top+1;
    }


}
