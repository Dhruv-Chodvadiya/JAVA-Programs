import java.util.PrimitiveIterator;
public class Relation_HAS_A {
    public static void main(String[] args) {
        empolyee emp=new empolyee("dhruv",12,"Surat");
        System.out.println(emp.getName()+" "+ emp.address.gethNo()+" "+emp.address.getCity());
    }
}
class empolyee{
    private String name;
    public String getName() {
        return name;
    }
    Address address;
    empolyee(String name,int hNo,String city){
        this.name=name;
        this.address=new Address(hNo,city);
    }
}
class Address{
    private int hNo;
    private String city;
    public int gethNo() {
        return hNo;
    }
    public String getCity() {
        return city;
    }
    Address(int hno, String city){
        this.hNo=hno;
        this.city=city;
    }
}
