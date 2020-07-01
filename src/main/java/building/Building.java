package building;

public class Building {

    public String  building(){
        return null;
    }
    public static void main(String[] args) {
        BusinessBuilding bank = new Bank();
        BusinessBuilding hospital = new Hospital();

        System.out.println("------BUSINESS BUILDINGS-----");
        System.out.println(bank.building());
        System.out.println(hospital.building());

        EducationalBuilding library = new Library();
        EducationalBuilding uni = new University();

        System.out.println("-------EDUCATIONAL BUILDINGS-----");
        System.out.println(library.building());
        System.out.println(uni.building());

        University university = new University();

        System.out.println(university.book());
        System.out.println(university.student());
    }
}
