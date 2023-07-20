public class NewBigArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int n= arr.length;
        int[] NewArr=new int[n*2];
        for(int i=0;i<n;i++){
            NewArr[i]=arr[i];
            NewArr[i+n]=arr[i];
        }
        for(int i=0;i<n*2;i++){
            System.out.println(NewArr[i]);
        }
    }
}
