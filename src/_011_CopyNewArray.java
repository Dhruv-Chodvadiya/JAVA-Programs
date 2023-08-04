public class _011_CopyNewArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n= arr.length;
        int[] newArr=new int[n];

        for (int i=0;i<n;i++){
            newArr[i]=arr[i];
            System.out.println(newArr[i]);
        }

    }
}
