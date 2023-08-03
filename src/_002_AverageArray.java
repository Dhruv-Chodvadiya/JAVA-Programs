public class _002_AverageArray {
    public static void main(String[] args) {
        System.out.println("Print average of array");

        int[] arr={10,20,30,40,50};
        int ans=0,len;

        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        len = ans/arr.length;
//        System.out.println("Sum of Array = "+ans);
        System.out.println("Average Array = "+ len);

    }
}
