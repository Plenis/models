package animal;

public class Animal {
    public String animal(){
        return "I am an animal - ";
    }

    public static void main(String[] args) {
        System.out.println("~~~WELCOME TO THE ANIMAL HIERARCHY~~~");
        System.out.println("----------------------------------------------");
        Animal animal =  new Animal();
        Cat cat = new PersianCat();

        System.out.println(animal.animal());
        System.out.println("-------if you are an animal that is a CAT you can be--------");
        System.out.println(cat.whatAmI());

        Cat cat1 = new BengalCat();
        System.out.println(cat1.whatAmI());


        Cat cat2 = new Munchkin();
        System.out.println(cat2.whatAmI());

        System.out.println("-------if you are an animal that is a DOG you can be--------");

        Dog dog = new Husky();
        Dog dog1 = new Pitbull();
        Dog dog2 = new Bulldog();

        System.out.println(dog.whatAmI());
        System.out.println(dog1.whatAmI());
        System.out.println(dog2.whatAmI());

        System.out.println("-------if you are a DOG you can--------");

        System.out.println(dog.bark());
        System.out.println(dog.eatBone());
        System.out.println(dog.howMuch(4));

    }
}
