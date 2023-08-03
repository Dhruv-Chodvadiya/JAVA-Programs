public class _009_oddEven {
    public static void main(String[] args) {
        System.out.println("Print Even and Odd ");
        System.out.print("Even = ");
        for (int i = 1; i <= 10; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Odd = ");
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
