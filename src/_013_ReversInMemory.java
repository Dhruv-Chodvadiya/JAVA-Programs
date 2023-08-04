public class _013_ReversInMemory {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n = arr.length;
        int l=0,r=n-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
}
