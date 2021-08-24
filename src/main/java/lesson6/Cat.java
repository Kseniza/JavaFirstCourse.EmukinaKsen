package lesson6;

public class Cat extends Animals{
    private String color;


    public Cat(String name, String color) {
        super(name);
        this.color = color;
            }
    public int lengthRun() {
        return 20;
    }

    public int limitOfRun() {
          return 200;
        }

    @Override
    public int limitOfSwim() {
        return 0;
    }


    @Override
    public void swim() {
        System.out.println(color + " " +getName()+" не плавает!");
    }

    @Override
    public int lengthSwim() {
        return 0;
    }
  }



