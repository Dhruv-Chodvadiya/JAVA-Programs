public class _004_equals_String {
    public static void main(String[] args) {
        String name="dhruv";
        String name1="Dhruv";

        if(name.length()!=name1.length()){
            System.out.println("False");
            return;
        }
        for(int i=0;i<name.length();i++){
            int asci=name.charAt(i);
            int ascii=name1.charAt(i);
            int diff=Math.abs(ascii-asci);
            if(diff !=0 && diff != 32){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
