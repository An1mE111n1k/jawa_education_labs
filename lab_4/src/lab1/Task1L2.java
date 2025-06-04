package lab1;

import java.util.Scanner;

public class Task1L2 {
    public static void task2l1(){
        Scanner scanner = new Scanner(System.in);

        // Ввод значений переменных
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        System.out.print("Введите значение z: ");
        double z = scanner.nextDouble();

        // Вычисление выражения
        double term1 = x;
        double term2 = Math.sqrt(x * x + Math.exp(y));
        double numerator = z * z * Math.pow(Math.sin(y), 2);
        double denominator = y + z * z * (y - x);
        double term3 = numerator / denominator;

        double f = term1 + term2 - term3;

        // Вывод результата
        System.out.println("\nРезультат вычисления функции:");
        System.out.printf("f = %.6f\n", f);

        // Дополнительный вывод для проверки
        System.out.println("\nПромежуточные значения:");
        System.out.printf("x = %.3f\n", x);
        System.out.printf("√(x² + eʸ) = %.6f\n", term2);
        System.out.printf("Числитель дроби = %.6f\n", numerator);
        System.out.printf("Знаменатель дроби = %.6f\n", denominator);
        System.out.printf("Дробь = %.6f\n", term3);
    }
}
