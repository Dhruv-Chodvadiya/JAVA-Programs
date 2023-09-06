public class Method_Overloading {
    public static void main(String[] args) {
        helper h=new helper();
        h.multiply(2,2);
        h.multiply(2,2,2);
    }
}
class helper{
    void multiply(int a,int b){
        System.out.println(a*b);
    }
    void multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }
}

// 1 Same name
// 2 Same class
// 3 Different argument - Number of arg. , Sequence if arg. , type of arg.
