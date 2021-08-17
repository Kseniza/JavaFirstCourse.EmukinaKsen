package lesson6;

public class Dog extends Animals{

    public Dog(String name) {
        super(name);

    }

    @Override
    public int lengthRun() {
        return 150;
    }

    @Override
    public int limitOfRun() {
        return 500;
    }

    @Override
    public int limitOfSwim() {
        return 10;
    }

    @Override
    public int lengthSwim() {
        return 5;
    }
}
