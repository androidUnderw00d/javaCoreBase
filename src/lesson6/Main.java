package lesson6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Animal tiger = new Tiger(2000, 9, 200);
        Animal dog = new Dog( 500, 3, 10);
        Animal cat = new Cat(200, 2);

        Random random = new Random();

        System.out.println(tiger.run(random.nextInt(3000)));

        System.out.println(dog.swim(random.nextInt(12)));

        System.out.println(tiger.swim(random.nextInt(400)));

        System.out.println(cat.swim(3));

    }
}
