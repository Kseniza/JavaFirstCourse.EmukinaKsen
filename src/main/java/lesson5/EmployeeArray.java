package lesson5;

import java.util.Arrays;

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] EmployeeArray = new Employee[5];
        EmployeeArray[0] = new Employee("Petrov Petr Petrovich", "system manager", "callme@gg.rt", "85646", 18995, 35);
        EmployeeArray[1] = new Employee("Fedorov Fedor Fedorovich", "ceo", "goAndDo@gg.rt", "88888", 189950, 25);
        EmployeeArray[2] = new Employee("Retrov Konstantin Stepanovich", "driver", "letsgo@gg.rt", "81234", 18995, 45);
        EmployeeArray[3] = new Employee("Citnova Margarita Sergeevna", "tester", "whatIsIt@gg.rt", "81234", 28995, 42);
        EmployeeArray[4] = new Employee("Retrov Konstantin Stepanovich", "driver", "letsgo@gg.rt", "81234", 8995, 45);
        for (int i=0; i<5; i++) {
            if (EmployeeArray[i].getAge() > 40) {
                System.out.println(EmployeeArray[i].getName());
            }
        }
    }
}


