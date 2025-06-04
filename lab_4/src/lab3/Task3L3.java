package lab3;

import java.util.Scanner;

public class Task3L3 {
    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x (|x| > 1):");
        double x = sc.nextDouble();
        System.out.println("Введите точность eps:");
        double eps = sc.nextDouble();

        double y = 0;
        double term;
        int n = 0;

        do {
            double numerator = 1;
            for (int i = 0; i < 2*n+1; i++) {
                numerator *= (x-1)/(x+1);
            }
            term = 2 * numerator / (2*n + 1);
            y += term;
            n++;
        } while (Math.abs(term) >= eps);

        System.out.println("Приближенное значение ln(x): " + y);
    }
}