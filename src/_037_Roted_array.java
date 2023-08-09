import java.lang.reflect.Array;
import java.util.Arrays;

public class _037_Roted_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=2;
        for(int i=0;i<n;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
