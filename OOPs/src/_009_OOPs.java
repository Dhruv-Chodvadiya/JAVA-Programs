public class _009_OOPs {
    public static void main(String[] args) {
        Dog D=new Dog("max","Brown");
        System.out.println(D.name+" "+D.color);
        D.setName("Bull");
        D.setColor("Black");
        System.out.println(D.getName()+" "+D.getColor());
    }
}
class Dog{
    String name;
    String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
}
