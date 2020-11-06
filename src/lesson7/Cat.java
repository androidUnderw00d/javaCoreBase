package lesson7;

import java.util.Arrays;
import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private int hungry;
    public static final int QUANTITY = 4;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void creatingCats(int QUANTITY) {
        Cat[] catsArray = new Cat[QUANTITY];
        String[] nameArray = {"Барсик", "Матроскин", "Борис Николаевич", "Компот"};
        Random random = new Random();
        for (int i = 0; i < QUANTITY; i++) {
            catsArray[i] = new Cat(nameArray[i], random.nextInt(4));
            System.out.println(catsArray[i]);
        }

    }

    public void eat(Plate plate) {
        System.out.println("Котик питается");

        if (plate.getFood() >= appetite) {
            doEat(plate);
            System.out.println("Кот доволен");
        } else {
            catHunger(plate);
            System.out.println("Мне нужна еда");
        }
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    private void catHunger(Plate plate) {
        decreaseAppetite(plate);
    }

    private int decreaseAppetite(Plate plate) {
        appetite = appetite - plate.getFood();
        plate.setFood(0);
        return hungry;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", appetite=" + appetite + '}';
    }

    public void catInfo() {
        System.out.println(this);
    }

}
