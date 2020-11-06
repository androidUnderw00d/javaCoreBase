package lesson6;

public class Cat extends Animal {

    public static final int MAXSWIM = 0;

    public Cat(int run, double jump) {
        super(run, jump, MAXSWIM);
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance < run && runDistance > 0) {
            System.out.print("Кот пробежал: " + runDistance + " :");
            return true;
        }
        System.out.print("Кот не смог пробежать: " + runDistance + " :");
        return false;
    }

    @Override
    public boolean jump(double jumpDistance) {
        if (jumpDistance < run && jumpDistance > 0) {
            System.out.print("Кот прыгнул: " + jumpDistance + " :");
            return true;
        }
        System.out.print("Кот не смог прыгнуть: " + jumpDistance + " :");
        return false;
    }

    @Override
    public boolean swim(int swimDistance) {
        System.out.print("Коты не любят плавать: ");
        return false;
    }
}
