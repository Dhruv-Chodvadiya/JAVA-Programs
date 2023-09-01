public class inheritance_Single {
    public static void main(String[] args) {
        student5 s1=new student5("Dhruv",21,1);
        System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getRollNo());
    }
}
class person{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class student5 extends person{
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    student5(String name, int age, int rollNo){
        super(name,age);
        this.rollNo=rollNo;
    }
}
