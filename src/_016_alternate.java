public class _016_alternate {
    public static void main(String[] args){
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] arr3=new int[arr1.length+arr2.length];
        int j=0;

        for(int i=0;i<arr1.length;i++){
            arr3[j]=arr1[i];
            arr3[j+1]=arr2[i];
            j+=2;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
