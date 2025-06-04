package lab3;

import java.util.Scanner;

public class Task1L3 {
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность целых чисел (0 для завершения):");
        int num;
        boolean zeroFound = false;
        int count = 0;

        while ((num = sc.nextInt()) != 0) {
            if (zeroFound && num < 0) {
                // Проверка на совершенное число
                int absNum = -num;
                int sum = 1;
                for (int i = 2; i <= absNum/2; i++) {
                    if (absNum % i == 0) {
                        sum += i;
                    }
                }
                if (sum == absNum) {
                    count++;
                }
            }
            if (num == 0) {
                zeroFound = true;
            }
        }

        System.out.println("Количество отрицательных совершенных чисел после первого нуля: " + count);
    }
}