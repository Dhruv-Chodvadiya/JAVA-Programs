import java.util.Scanner;

public class function {
    public static void myName(String n){
        System.out.println(n);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        myName(name1);
    }
}
