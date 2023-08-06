public class _025_binary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int l=0;
        int r=arr.length-1;
        int val=10;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==val){
                System.out.println(arr[mid]);
                return;
            } else if (val>arr[mid]) {
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
    }
}
