package vehicle;

public class Truck extends Vehicle implements TruckSpec{
    @Override
    public String vehicle() {
        return super.vehicle() + " that's a Truck!";
    }

    @Override
    public String diesel() {
        return "Use diesel";
    }

    @Override
    public String sound() {
        return "Loud engine sound...";
    }
}
