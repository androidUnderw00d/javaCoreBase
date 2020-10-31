package lesson6;

public class Dog extends Animal {

    public Dog(int run, double jump, int swim) {
        super(run, jump, swim);
    }

    public void printInfo() {
        super.printInfo();
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance < run && runDistance > 0) {
            System.out.print("Пес пробежал: " + runDistance + " :");
            return true;
        }
        System.out.print("Пес не смог пробежать: " + runDistance + " :");
        return false;
    }

    @Override
    public boolean jump(double jumpDistance) {
        if (jumpDistance < run && jumpDistance > 0) {
            System.out.print("Пес прыгнул: " + jumpDistance + " :");
            return true;
        }
        System.out.print("Пес не смог прыгнуть: " + jumpDistance + " :");
        return false;
    }

    @Override
    public boolean swim(int swimDistance){
        if (swimDistance < this.swim && swimDistance > 0) {
            System.out.print("Пес проплыл: " + swimDistance + " :");
            return true;
        }
        System.out.print("Пес не смог проплыть: " + swimDistance + " :");
        return false;
    }
}
