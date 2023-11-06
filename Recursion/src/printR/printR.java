package printR;

public class printR {
    public static void main(String[] args) {
        print(5,1);
    }
    public static void print(int n,int i){
        if(n<i){
            System.out.println("NULL");
            return;
        }
        System.out.print(n+"->");
        print(n-1,i);
    }
}
