import java.util.Arrays;

public class _038_2_Array_marge_sorted_array {
    public static void main(String[] args) {
        int[] arr1={1,3,4,6,7};
        int[] arr2={2,5,8,9,10};
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3=new int[arr1.length+arr2.length];

        int i=0,k=0,j=0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while (j<m){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
