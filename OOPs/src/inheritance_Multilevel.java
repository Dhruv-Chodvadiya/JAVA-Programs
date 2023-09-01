public class inheritance_Multilevel {
    public static void main(String[] args) {
        professor s2=new professor("Dhruv",21,1,"school");
        System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getRollNo()+" "+s2.getDepartment());
    }
}
class person1{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    person1(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class student6 extends person1{
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    student6(String name, int age, int rollNo){
        super(name,age);
        this.rollNo=rollNo;
    }
}
class professor extends student6{
    private String department;

    public String getDepartment() {
        return department;
    }
    professor(String name, int age, int rollNo,String department){
        super(name,age,rollNo);
        this.department=department;
    }
}