class Motor {
    void running(){
        System.out.println("running mode on");
    }
}
class Car extends Motor{
    void run(){
        System.out.println("car run mode on");
    }
}
class Bike extends Motor {
    void speed(){
        System.out.println("speed is very high");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Bike sc = new Bike();
        sc.speed();
        sc.running();
        Car dc = new Car();
        dc.run();
    }
}
