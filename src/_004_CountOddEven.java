
public class _004_CountOddEven {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int odd=0,even=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2==1){
                odd++;
            }else {
                even++;
            }
        }
        System.out.println("odd  = "+odd+"\n"+"Even = "+even);
    }
}