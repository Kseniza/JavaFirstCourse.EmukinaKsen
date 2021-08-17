package lesson6;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Рыжий");
        cat.run();
        cat.swim();
        Dog dog = new Dog("Дружок");
        dog.run();
        dog.swim();

    }
}
