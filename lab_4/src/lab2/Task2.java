package lab2;

import java.util.Scanner;

public class Task2 {
    public static void runTask2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Проверка условия для числа ===");
        System.out.print("Введите x: ");
        double x = sc.nextDouble();

        int a = (int)x;
        double b = x - a;
        int c = a % 10;
        int d = (int)(b * 10) % 10;

        boolean e = (c + d) % 2 == 0 || (a / 10) > d;
        System.out.println("Результат: " + e);
    }
}