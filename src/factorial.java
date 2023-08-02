public class factorial {
    public static void main(String[] args) {
        int n=5;
        int factorial=fac(n);
        System.out.println(factorial);
    }
    public static int fac(int n){
        if(n==1||n==0){
            return 1;
        }
        int num=fac(n-1);
        int factorial = n*num;
        return factorial;
    }
}
