public class _013_palindrome {
    public static void main(String[] args) {
        String name="naman";
        char[] chars=name.toCharArray();

        int l=0,r=0;

        for(int i=0;i< chars.length;i++){
            if(chars[i]==' '){
                r=i-1;
                check(chars,l,r);
                l=i+1;
            }
        }
        r=chars.length-1;
        check(chars,l,r);
    }
    public static void check(char[] chars,int l,int r){
        while (l<r){
            if(chars[l]!=chars[r]){
                System.out.println("Not plaindrome");
                return;
            }
            else {
                l++;
                r--;
            }
        }
        System.out.println("Palindrome");
    }
}
