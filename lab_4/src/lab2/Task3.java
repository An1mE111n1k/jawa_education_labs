package lab2;

import java.util.Scanner;

public class Task3 {
    public static void runTask3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Вычисление функции y(x) ===");
        System.out.print("Введите x: ");
        double x = sc.nextDouble();

        double a = 7.1, b = 6.2, y;

        if (x < -2) {
            y = x*x*x + 2*a;
        } else if (x <= 5) {
            y = Math.log(Math.abs(Math.cos(b*x)));
        } else {
            y = x*x * Math.exp(x);
        }

        System.out.printf("y = %.3f\n", y);
    }
}