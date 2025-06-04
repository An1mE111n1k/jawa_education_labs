package lab3;

import java.util.Scanner;

public class Task1L3Recursive {
    private static Scanner sc = new Scanner(System.in);

    public static void task1Recursive() {
        System.out.println("Введите последовательность целых чисел (0 для завершения):");
        processNumbers(false, 0);
    }

    private static void processNumbers(boolean zeroFound, int count) {
        int num = sc.nextInt();

        // Базовый случай - завершение ввода
        if (num == 0 && zeroFound) {
            System.out.println("Количество отрицательных совершенных чисел после первого нуля: " + count);
            return;
        }

        // Обработка чисел после первого нуля
        if (zeroFound && num < 0) {
            if (isPerfect(-num)) {
                processNumbers(zeroFound, count + 1);
                return;
            }
        }

        // Обнаружение первого нуля
        if (num == 0 && !zeroFound) {
            processNumbers(true, count);
            return;
        }

        // Продолжаем обработку
        processNumbers(zeroFound, count);
    }

    // Рекурсивная проверка на совершенное число
    private static boolean isPerfect(int num, int divisor, int sum) {
        if (divisor > num/2) {
            return sum == num;
        }

        if (num % divisor == 0) {
            return isPerfect(num, divisor + 1, sum + divisor);
        }

        return isPerfect(num, divisor + 1, sum);
    }

    private static boolean isPerfect(int num) {
        if (num <= 1) return false;
        return isPerfect(num, 2, 1);
    }
}