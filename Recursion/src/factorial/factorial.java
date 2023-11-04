package factorial;

public class factorial {
    static void printFactorial(int i,int multiply) {
        if(i < 1){
            System.out.println(multiply);
            return;
        }
        printFactorial(i-1,multiply*i);
    }
    public static void main(String[] args) {
        int n=5;
        int factorial=1;
         printFactorial(n,factorial);
    }
}
