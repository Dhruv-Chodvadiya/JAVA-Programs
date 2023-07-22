import java.util.Scanner;

public class FunctionTable {
    public static void myTable(int n){
        int num=n;
        for(int i =1;i<=10;i++){
            System.out.println(num+ " * " +i + " = " + i*num);
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int table=sc.nextInt();

        myTable(table);
    }
}
