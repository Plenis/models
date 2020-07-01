package animal;

public class Dog extends Animal implements DogSpec {

    int boneCount;

    public String whatAmI(){
        return "- that's a dog";
    }

    @Override
    public String animal() {
        return super.animal() + whatAmI();
    }

    @Override
    public String bark() {
        return "Woof woof!!";
    }

    @Override
    public String eatBone() {
        return "Eating a bone...";
    }

    @Override
    public String howMuch(int bone) {
        return "Eating " + bone + " bones :) ";
    }
}
