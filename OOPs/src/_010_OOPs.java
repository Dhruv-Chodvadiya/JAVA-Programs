public class _010_OOPs {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"A",JobTitle.HOD,100000);
        Employee e2 = new Employee(2,"B",JobTitle.Peon,30000);
        Employee e3 = new Employee(3,"C",JobTitle.Principal,1500000);
        Employee e4 = new Employee(4,"D",JobTitle.Prof,70000);
        Employee e5 = new Employee(5,"E",JobTitle.HOD,100000);
        Employee e6 = new Employee(6,"F",JobTitle.Peon,30000);
        Employee e7 = new Employee(7,"G",JobTitle.Prof,70000);
        Employee e8 = new Employee(8,"H",JobTitle.Prof,70000);
        Employee e9 = new Employee(9,"I",JobTitle.HOD,100000);
        Employee e10 = new Employee(10,"J",JobTitle.Peon,30000);

        Employee[] emp = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};

        Employee.getTotalSatary(emp);
    }
}
enum JobTitle{
    Peon, Prof, HOD, Principal;
}
class Employee{
    int empId;
    String name;
    JobTitle Jobtitle;
    int salary;
    public Employee(int empId, String name, JobTitle Jobtitle, int salary) {
        this.empId=empId;
        this.name=name;
        this.Jobtitle=Jobtitle;
        this.salary=salary;
    }
    public static void getTotalSatary(Employee[] emp) {
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        for(int i=0;i<emp.length;i++){
            if(emp[i].Jobtitle.equals(JobTitle.Peon)) {
                sum1+=emp[i].salary;
            }else if(emp[i].Jobtitle.equals(JobTitle.Prof)) {
                sum2+=emp[i].salary;
            }else if(emp[i].Jobtitle.equals(JobTitle.HOD)) {
                sum3+=emp[i].salary;
            }else if(emp[i].Jobtitle.equals(JobTitle.Principal)) {
                sum4+=emp[i].salary;
            }
        }
        System.out.println("Peon: " + sum1);
        System.out.println("Prof: " + sum2);
        System.out.println("HOD: " + sum3);
        System.out.println("Principal: " + sum4);
    }
}