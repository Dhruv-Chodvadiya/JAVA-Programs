import java.util.Arrays;

public class _009_oddEven {
    public static void main(String[] args) {
        System.out.println("Print Even and Odd ");
//        System.out.print("Even = ");
//        for (int i = 1; i <= 10; i++) {
//            if(i%2==0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println(" ");
//        System.out.print("Odd = ");
//        for (int i = 1; i <= 10; i++) {
//            if(i%2!=0) {
//                System.out.print(i + " ");
//            }
//        }
        int[] arr={1,2,3,4,5};
        int l=0,r=arr.length-1;
        for(int i=0;i<arr.length;i++) {
            while (l <= r) {
                if (arr[l] % 2 == 1) {
                    l++;
                } else if (arr[r] % 2 == 0) {
                    r--;
                } else {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    r--;
                    l++;
                }
            }
            System.out.print(arr[i]+" ");
        }
//        System.out.println(Arrays.toString(arr));
    }
}
