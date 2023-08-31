public class _001_OOPs {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudDetails(101,"Dhruv",90,90,90);
        s1.calculateTotal();
        s1.displayStudDetails();
        Student s2=new Student();
        s2.setStudDetails(102,"Dip",95,82,85);
        s2.calculateTotal();
        s2.displayStudDetails();
    }
}
class Student{
    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;
    public void setStudDetails(int rollNum,String studName,int mark1,int mark2,int mark3){
        this.rollNum=rollNum;
        this.studName=studName;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public void calculateTotal(){
        this.totalMarks=mark1+mark2+mark3;
    }
    public void displayStudDetails(){
        System.out.println("Roll No. = "+rollNum+"\nStudent Name = "+studName+"\nTotal Marks = "+totalMarks);
    }
}
