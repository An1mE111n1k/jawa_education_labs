package lab3;

import java.util.Scanner;

public class Task2L3 {
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность положительных чисел (отрицательное для завершения):");
        int prev = sc.nextInt();
        int current;
        int count = 0;

        while ((current = sc.nextInt()) >= 0) {
            // Проверка prev на простое число
            boolean isPrevPrime = true;
            if (prev <= 1) {
                isPrevPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(prev); i++) {
                    if (prev % i == 0) {
                        isPrevPrime = false;
                        break;
                    }
                }
            }

            // Проверка current на простое число
            boolean isCurrentPrime = true;
            if (current <= 1) {
                isCurrentPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(current); i++) {
                    if (current % i == 0) {
                        isCurrentPrime = false;
                        break;
                    }
                }
            }

            if (isPrevPrime && isCurrentPrime) {
                count++;
            }
            prev = current;
        }

        System.out.println("Количество пар подряд идущих простых чисел: " + count);
    }
}