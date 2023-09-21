public class _011_remove_Digits {
    public static void main(String[] args) {
        String name="Dhruv12345";

        System.out.println(name.replaceAll("\\d",""));

        String ans = "";

        for(int i=0; i<name.length(); i++){
            if(!Character.isDigit(name.charAt(i))){
                ans += name.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
