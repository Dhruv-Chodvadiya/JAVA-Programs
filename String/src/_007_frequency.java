public class _007_frequency {
    public static void main(String[] args) {
        String name="Dhruv";
        int arr[] =new int[128];

        for(int i=0;i<name.length();i++){
            int ascii =(int) name.charAt(i);
            arr[ascii]=arr[ascii]+1;
        }
        for(char i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(i + " - " +arr[i]);
            }
        }
    }
}
