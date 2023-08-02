public class factorial_2 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int sum=0;
        fac(i,n,sum);
    }
    public static void fac(int i,int n,int sum){
        if(i==n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        fac(i+1,n,sum);
    }
}
