package lab2;

import java.util.Scanner;

public class Task4 {
    public static void runTask4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Расчет стоимости билетов ===");
        System.out.print("Введите ряд и кол-во: ");
        int r = sc.nextInt();
        int n = sc.nextInt();
        int p;

        if (r <= 10) p = 30;
        else if (r <= 15) p = 45;
        else p = 60;

        System.out.println("Стоимость: " + (p * n) + " коп.");
    }
}