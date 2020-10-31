package lesson6;

public abstract class Animal {

    protected int run;
    protected double jump;
    protected int swim;

    public Animal(int run, double jump, int swim) {
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public void printInfo() {
        System.out.println(this);
    }

    public abstract boolean run(int runDistance);
    public abstract boolean jump(double jumpDistance);
    public abstract boolean swim(int swimDistance);

}
