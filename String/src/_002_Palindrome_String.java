public class _002_Palindrome_String {
    public static void main(String[] args) {
        String name = "ABCBA";
        int left = 0;
        int right = name.length()-1;

        while (left < right){
            if(name.charAt(left)!=name.charAt(right)){
                System.out.println("String is not palindrome");
                return;
            }
            else {
                right--;
                left++;
            }
        }
        System.out.println("String is Palindrome");
    }
}
