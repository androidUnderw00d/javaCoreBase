package lesson7;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat("Борис Николаевич", 5);
        Plate plate = new Plate (5);

        cat.creatingCats(4);
        System.out.println();

        plate.addFood(4);
        plate.printInfo();
        cat.eat(plate);
        plate.printInfo();
        cat.catInfo();
    }
}
