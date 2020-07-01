package animal;

public class Cat extends Animal {
    public String whatAmI(){
        return "- that's a cat";
    }

    @Override
    public String animal() {
        return super.animal() + whatAmI();
    }
}
