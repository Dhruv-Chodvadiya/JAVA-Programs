public class _012_CopyReversNewArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int[] newArr=new int[n];
        int j=n;
        for (int i=0;i<n;i++){
            newArr[j-1]=arr[i];
            j=j-1;
        }
        for(int k=0;k<n;k++){
            System.out.println(newArr[k]);
        }
    }
}
