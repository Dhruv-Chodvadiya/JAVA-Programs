public class inheritance_hierarchical {
    public static void main(String[] args) {
        professorr s2=new professorr("Dhruv",21,"school");
        studentt s=new studentt("Dip",22,5);
        System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getDepartment());
        System.out.println(s.getName()+" "+s.getAge()+" "+s.getRollNo());
    }
}
class person2{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    person2(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class studentt extends person2{
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    studentt(String name, int age, int rollNo){
        super(name,age);
        this.rollNo=rollNo;
    }
}
class professorr extends person2{
    private String department;

    public String getDepartment() {
        return department;
    }
    professorr(String name, int age,String department){
        super(name,age);
        this.department=department;
    }
}
