public class _001_All_Recursion {
        static int rev=0;
        static int SumD=0;
        static int larg=0;
        public static void main(String[] args) {
            int n = 55656;

            //Infinity recursion
//        System.out.println(Infinity(n));

            //Factorial
//        System.out.println(Facto(n));

            //Sum 1 to N
//        System.out.println(Sum(n));

            //Print Array
//        int[] arr={1,2,3,4,5};
//        PrintArray(arr,arr.length-1);

            //Count Digit
//        System.out.println(CountD(n));

            //Reverse Digit
//        System.out.println(Reverse(n));

            //Product 2 Number
//        int a=2,b=4;
//        System.out.println(Product(a,b));

            //Sum Digit
//        System.out.println(SumDigit(n));

            //Largest IN Array
//        int[] arr={1,2,3,4,5};
//        System.out.println(Lagest(arr,arr.length-1));

            //Prime Number
//        System.out.println(Prime(n,2));


        }

        private static Boolean Prime(int n,int i) {

            if (n <= 2)
                return (n == 2);
            if (n % i == 0)
                return false;
            if (i * i > n)
                return true;

            return Prime(n, i + 1);

        }

        private static int Lagest(int[] arr,int l) {
            if(l == -1){
                return larg;
            }
            if(arr[l] > larg){
                larg = arr[l];
            }
            return Lagest(arr,l-1);
        }

        private static int SumDigit(int n) {
            if(n == 0){
                return SumD;
            }
            SumD = SumD + n % 10;
            return SumDigit(n/10);
        }

        private static int Product(int a, int b) {
            if(b == 0){
                return 0;
            }
            return a + Product(a,b-1);
        }

        public static int Reverse(int n) {
            if(n == 0){
                return rev;
            }
            rev = rev * 10 + n % 10;
            return Reverse(n/10);
        }

        private static int CountD(int n) {
            if(n == 0){
                return 0;
            }
            return 1 + CountD(n/10);
        }

        private static void PrintArray(int[] arr,int l) {
            if(l == -1){
                return;
            }

            PrintArray(arr,l-1);
            System.out.print(arr[l] + " ");
        }

        private static int Sum(int n) {
            if(n==1){
                return 1;
            }
            return n + Sum(n-1);
        }

        private static int Infinity(int n) {
            return Infinity(n);
        }
        private static int Facto(int n){
            if(n==1){
                return 1;
            }
            return n * Facto(n-1);
        }
    }
