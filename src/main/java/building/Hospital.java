package building;

public class Hospital extends BusinessBuilding{
    @Override
    public String building() {
        return super.building() + "Hospital";
    }
}
