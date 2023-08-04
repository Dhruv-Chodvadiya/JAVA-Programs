public class _015_copyArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;
        int[] newArr=new int[n*2];

        for (int i=0;i<n;i++){
            newArr[i]=arr[i];
            newArr[n+i]=arr[i];
        }
        for(int i=0;i< newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
