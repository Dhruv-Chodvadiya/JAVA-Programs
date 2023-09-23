import java.util.Arrays;

public class practice_002 {
    public static void main(String[] args) {
        String name="123";
        int i = 0, number = 0;
        int len = name.length();
        while( i < len ){
          number *= 10;
          number += ( name.charAt(i++) - '0' );
        }
        System.out.println(number);
    }
}
