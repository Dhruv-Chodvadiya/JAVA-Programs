public class _018_duplicate {
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,5};
        int n=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
        }
        if(count==1){
            System.out.println("Not duplicate");
        }
        else {
            System.out.println("Duplicate");
        }
    }
}
