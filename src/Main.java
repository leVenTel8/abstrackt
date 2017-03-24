import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();


        List<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(dog);
        animals.add(dog1);
        animals.add(dog2);

        for(Animal animal : animals) {
            long s = 10;

            System.out.println(animal.grow(s));
        }

        cat.go();
        cat.jump();
        System.out.println("Я кошка и я выросла до: "+cat.grow(5));
        System.out.println("");

        dog.go();
        dog.jump();
        System.out.println("Я собкака и я выросла до: "+dog.grow(7));

    }


}
