public class practice_001 {
    public static void main(String[] args) {
        String str1="Good";
        String str2="Morning";

        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());
        System.out.println("1 = "+str1);
        System.out.println("2 = "+str2);
    }
}

