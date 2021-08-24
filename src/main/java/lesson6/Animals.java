package lesson6;


public abstract class Animals {

        protected String name;

    public Animals(String name) {
        this.name = name;
    }
    public Animals() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void run() {
        System.out.println(getName() + " бежит " + lengthRun() + " метров");
    }

    public void swim() {
        System.out.println(getName() + " плывет " + lengthSwim()+ " метров");
    }
    public abstract int lengthRun();
    public abstract int lengthSwim();
    public abstract int limitOfRun();
    public abstract int limitOfSwim();



}

