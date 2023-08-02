public class Recursion_power {
    public static void main(String[] args) {
        int n=5,x=2;
        int ans=power(x,n);
        System.out.println(ans);
    }
    public static int power(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpow=power(x,n-1);
        int power=x*xpow;
        return power;
    }
}
