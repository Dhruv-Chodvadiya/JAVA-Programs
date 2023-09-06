public class Method_Overriding {
    public static void main(String[] args) {
        Bank b;
        boolean flag=false;
        if(flag==true){
            b=new SBI();
        }else {
            b=new Kotak();
        }
        b.Rate();
    }
}
class Bank{
    void Rate(){
        System.out.println("4%");
    }
}
class SBI extends Bank{
    void Rate(){
        System.out.println("6%");
    }
}
class Kotak extends Bank{

}
// 1 Same name
// 2 Different class
// 3 Same argument - Number of arg. , Sequence if arg. , type of arg.
// 4 Inheritance
