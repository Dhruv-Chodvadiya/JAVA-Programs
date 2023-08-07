public class _028_oddLeft {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l=0;
        int r=arr.length-1;
        while (l<r){
            if(arr[l]%2==1){
                l++;
            }else if(arr[r]%2==0){
                r--;
            }else{
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
