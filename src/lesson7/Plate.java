package lesson7;

public class Plate {

    private int capasity;
    private int food;

    public int getFood() {
        return food;
    }

    public int setFood(int food) {
        this.food = food;
        return food;
    }

    public Plate(int capasity) {
        this.capasity = capasity;
    }

    public void addFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate{" + "capasity=" + capasity + ", food=" + food + '}';
    }

    public void printInfo() {

        System.out.println(this);
    }

    public void decreaseFood(int appetite) {
        this.food -= appetite;
        }
}
