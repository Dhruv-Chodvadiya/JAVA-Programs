public class _030_extraNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5};
        int n=6;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        int num=n*(n+1)/2;
        System.out.println(ans-num);
    }
}
