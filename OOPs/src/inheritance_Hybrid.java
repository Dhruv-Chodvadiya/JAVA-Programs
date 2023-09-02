public class inheritance_Hybrid {
    public static void main(String[] args) {
        studenntt s=new studenntt("Dhruv",21,1);
        staf t=new staf("meet",49,"sic.",50000);
        System.out.println(s.getName()+" "+s.getAge()+" "+s.getRollNo());
        System.out.println(t.getName()+" "+t.getAge()+" "+t.getDepartment()+" "+t.getSalary());
    }
}
class personn{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    personn(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class studenntt extends personn{
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    studenntt(String name, int age, int rollNo){
        super(name,age);
        this.rollNo=rollNo;
    }
}
class professor3 extends personn{
    private String department;

    public String getDepartment() {
        return department;
    }
    professor3(String name, int age,String department){
        super(name,age);
        this.department=department;
    }
}
class staf extends professor3{
    private int salary;

    public int getSalary() {
        return salary;
    }
    staf(String name, int age,String department,int salary){
        super(name,age,department);
        this.salary=salary;
    }
}
