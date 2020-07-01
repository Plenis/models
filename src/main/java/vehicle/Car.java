package vehicle;

public class Car extends Vehicle{
    @Override
    public String vehicle() {
        return super.vehicle() + " that's a Car!";
    }
}
