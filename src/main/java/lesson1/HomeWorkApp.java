package lesson1;

public class HomeWorkApp{
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void checkSumSign() {
        int a = 30;
        int b = 20;
        int c = (a + b);
        if (c >= 0)
            System.out.println("Сумма положительная");
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 10;
        if (value <= 0)
            System.out.println("Красный");
        if (value <= 100)
            System.out.println("Желтый");
        else System.out.println("Зеленый");

    }

    public static void compareNumbers() {
        int a = 40;
        int b = 20;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}