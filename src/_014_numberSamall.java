public class _014_numberSamall {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(n>arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
