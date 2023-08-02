public class factorial_1 {
    public static void main(String[] args) {
        int n=1;
        fac(n);
//        System.out.println(val);
    }
    public static void fac(int n){
        if(n==11){
            return;
        }
        System.out.println(n);
        fac(n+1);
    }
}
