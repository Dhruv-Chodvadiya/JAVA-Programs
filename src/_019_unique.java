public class _019_unique {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,5};
        int n=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (n==arr[i]) {
                count++;
            }
        }
        if(count==1){
            System.out.println("unique");
        }
        else {
            System.out.println("Not Unique");
        }
    }
}
