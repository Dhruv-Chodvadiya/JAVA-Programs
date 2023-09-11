public class _008_OOPs_Assignment3 {
    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.maxGear(2);
        Bike b1=new Bike();
        b1.maxGear(2);
        Car c=new Car();
        c.maxGear(2);
    }
}
interface Vehicles{
    void maxGear(int gear);
}
class Bicycle implements Vehicles{
    static final int MAX_GEAR=2;
    public void maxGear(int gear){
        if(gear < 1 || gear > MAX_GEAR){
            System.out.println("INVALID GEAR");
        }
        else{
            System.out.println("BYCYCLE GEAR CHANGE TO "+ gear );
        }
    }
}
class Bike implements Vehicles{
    static final int MAX_GEAR=5;
    public void maxGear(int gear){
        if(gear < 1 || gear > MAX_GEAR){
            System.out.println("INVALID GEAR");
        }
        else{
            System.out.println("BIKE GEAR CHANGE TO "+ gear );
        }
    }
}
class Car implements Vehicles{
    static final int MAX_GEAR=7;
    public void maxGear(int gear){
        if(gear < 1 || gear > MAX_GEAR){
            System.out.println("INVALID GEAR");
        }
        else{
            System.out.println("CAR GEAR CHANGE TO "+ gear );
        }
    }
}
