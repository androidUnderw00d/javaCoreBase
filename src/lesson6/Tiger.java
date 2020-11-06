package lesson6;

public class Tiger extends Animal {

    public Tiger(int run, double jump, int swim) {
        super(run, jump, swim);
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance < run && runDistance > 0) {
            System.out.print("Тигр пробежал: " + runDistance + " :");
            return true;
        }
        System.out.print("Тигр не смог пробежать: " + runDistance + " :");
        return false;
    }

    @Override
    public boolean jump(double jumpDistance) {
        if (jumpDistance < run && jumpDistance > 0) {
            System.out.print("Тигр прыгнул: " + jumpDistance + " :");
            return true;
        }
        System.out.print("Тигр не смог прыгнуть: " + jumpDistance + " :");
        return false;
    }

    @Override
    public boolean swim(int swimDistance){
        if (swimDistance < this.swim && swimDistance > 0) {
            System.out.print("Тигр проплыл: " + swimDistance + " :");
            return true;
        }
        System.out.print("Тигр не смог проплыть: " + swimDistance + " :");
        return false;
    }
}
