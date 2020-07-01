package building;

public class Building {

    public String  building(){
        return null;
    }
    public static void main(String[] args) {
        BusinessBuilding bank = new Bank();
        BusinessBuilding hospital = new Hospital();

        System.out.println("There are different types of buildings...");
        System.out.println("------BUSINESS BUILDINGS-----");
        System.out.println(bank.building());
        System.out.println(hospital.building());

        EducationalBuilding library = new Library();

        // why cant I access the interface methods from here??
        EducationalBuilding uni = new University();

        System.out.println("-------EDUCATIONAL BUILDINGS-----");
        System.out.println(library.building());
        System.out.println(uni.building());

        // why can I only access the interface methods here??
        University university = new University();

        System.out.println("Educational buildings have....");
        System.out.println(university.book());
        System.out.println(university.student());
    }
}
