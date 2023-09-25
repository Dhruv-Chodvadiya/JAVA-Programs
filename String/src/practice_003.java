import java.util.Arrays;

public class practice_003 {
    public static void main(String[] args) {
        String s="abac";
        String s1="aabc";


        char ch1[] = s.toCharArray();
        char ch2[] = s1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(s.length()!=s1.length()){
            System.out.println("false");
            return;
        }

        int n=s.length();

        for(int i=0;i<n;i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
