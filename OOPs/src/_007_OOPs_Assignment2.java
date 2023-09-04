import java.util.Arrays;
import java.util.Scanner;

public class _007_OOPs_Assignment2 {
    public static void main(String[] args) {
        Student0 s=new Student0();

        //Student Details show
        s.Show();

        //Input Student Details
        s.input();

        //Totol marks
        System.out.println("Total marks : "+s.TotalMarks());

        //Highest mark
        System.out.println("Highest Mark of Subject : "+s.getHighest());

        //Lowest mark
        System.out.println("Lowest Mark of Subject : "+s.getLowest());

        //Average mark
        System.out.println("Average marks of student : "+s.getAverage());

        //
        System.out.println("A student is passed Subject : "+s.getPassCount());

        //Total Student
        s.TotalStudents();
    }
}
class Student0{
    private static int number;
    private int rollNo;
    private String name;
    private int[] marks=new int[5];
    Student0(){
        Student0.number+=1;
        this.rollNo=Student0.number;
        this.name=null;
        this.marks=marks;
    }
    public void Show(){
        System.out.println("--------Details of student--------\nRoll No : " + this.rollNo + "\nStudent Name : "+this.name+"\nMarks : "+ Arrays.toString(this.marks));
    }
    public void input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name : ");
        this.name=sc.next();
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks subject " + (i + 1) +" : ");
                this.marks[i] = sc.nextInt();
            }
    }
    public void TotalStudents(){
        System.out.println("Total Studnets : "+Student0.number);
    }

    public int TotalMarks() {
        int total=0;
        for(int i=0;i< marks.length;i++){
            total+=marks[i];
        }
        return total;
    }

    public int getHighest() {
        int max=Integer.MIN_VALUE;
        for(int i=0;i< marks.length;i++){
            if(max<marks[i]){
                max=marks[i];
            }
        }
        return max;
    }

    public int getLowest() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i< marks.length;i++){
            if(min>marks[i]){
                min=marks[i];
            }
        }
        return min;
    }

    public int getAverage() {
        return TotalMarks() / marks.length;
    }

    public int getPassCount() {
        int count=0;
        for(int i=0;i<this.marks.length;i++){
            if(this.marks[i] >= 50) {
                count++;
            }
        }
        return count;
    }
}
