package vehicle;

public class Vehicle {
    public String vehicle(){
        return "I am a vehicle - ";
    }

    public static void main(String[] args) {
        Vehicle vehicleT = new Truck();
        Vehicle vehicleC = new Car();
        Car sc = new Sport();
        Car hb = new Hatchback();

        System.out.println(vehicleC.vehicle());
        System.out.println("-----if you are a Vehicle and a CAR you can be-------------");
        System.out.println(sc.vehicle());
        System.out.println(hb.vehicle());

        Truck fb = new FlatBed();
        Truck gt = new Garbage();

        System.out.println(vehicleT.vehicle());
        System.out.println("-----if you are a Vehicle and a Truck you can be-------------");
        System.out.println(fb.vehicle());
        System.out.println(gt.vehicle());
        System.out.println(fb.diesel());
        System.out.println(fb.sound());

    }
}
