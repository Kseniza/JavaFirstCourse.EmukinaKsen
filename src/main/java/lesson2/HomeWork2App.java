package lesson2;

public class HomeWork2App {
    public static void main(String[] args) {
        isSummaIn(1, 4);
        checkNumPositive(-2);
    }

    public static void isSummaIn(int a, int b) {
        int c = (a + b);
        switch (c) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            {
                System.out.println("True");
                break;}
            default:
                System.out.println("False");
            }
        }
    public static void checkNumPositive(int a) {
        if (a >= 0)
            System.out.println("Число положительное");
        else {
            System.out.println("Число отрицательное");
        }

}

