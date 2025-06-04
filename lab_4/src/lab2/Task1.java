package lab2;

import java.util.Scanner;

public class Task1 {
    public static void runTask1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Вычисление объема цилиндра ===");
        System.out.print("Введите r и h: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double v = Math.PI * r * r * h;
        System.out.printf("Объём: %.2f\n", v);
    }
}