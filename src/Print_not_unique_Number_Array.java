public class Print_not_unique_Number_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<0){
                continue;
            }
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=arr[j]*-1;
                }
            }
            if(count>=1){
                System.out.println(arr[i]);
            }
        }
    }
}
