package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysApp {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите len: ");
            int len = sc.nextInt();
            System.out.println("Введите initialValue: ");
            int initialValue = sc.nextInt();
            int[] twoarry = new int[len];
            for (int i = 0; i < twoarry.length; i++)
                twoarry[i] = initialValue;
            System.out.println(Arrays.toString(twoarry));
        }

}



