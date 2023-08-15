public class _039_largest_sum {
    public static void main(String[] args) {
        int[] arr={1,-2,3,-1,4,5,-2,2};
        int sum=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=arr[i];
            if(c>sum){
                sum=c;
            }
            else if(c<0){
                c=0;
            }
        }
        System.out.println(sum);
    }
}
