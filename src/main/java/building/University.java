package building;

public class University extends EducationalBuilding implements EducationBuildingSpec{
    @Override
    public String building() {
        return super.building() + "University";
    }

    @Override
    public String book() {
        return "Books for educational purposes available";
    }

    @Override
    public String student() {
        return "Students available";
    }
}
