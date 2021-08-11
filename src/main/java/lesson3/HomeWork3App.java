package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3App {
    public static void main(String args[])  {
            int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == 0) {
                arr[i] = 1; }
            else {
                arr[i] = 0;      }

            }
        System.out.println(Arrays.toString(arr));


        int[] arry = new int[100];
        for (int i=0; i < arry.length; i++) {
            arry[i] = i+1;
        }
        System.out.println(Arrays.toString(arry));

        int[] arranger = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arranger.length; i++) {
            if ( arranger[i] < 6) {
                arranger[i] = ((arranger[i])*2); }
                  }
        System.out.println(Arrays.toString(arranger));

        int[][] mdarr = new int[5][5];
        for (int i = 0; i < mdarr.length; i++) {
            for (int j = 0; j < mdarr[i].length; j++) {
                if (mdarr[i]==mdarr[j]) {
                 mdarr[i][j]=1; }
                System.out.print(mdarr[i][j]);
            }
            System.out.println();
        }

    }

}



