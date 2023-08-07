public class _026_sum_short {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int n=10;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if((arr1[i]+arr2[j])==n){
                    System.out.print(arr1[i]+" "+arr2[j]);
                }
            }
        }
    }
}
