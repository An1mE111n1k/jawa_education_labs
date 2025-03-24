import java.util.Scanner;

public class Lab_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();
        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double b = c * Math.sqrt(y + Math.pow(x,2) * (Math.cos(x) - Math.abs(c - y)));

        System.out.println("Значение b: " + b);
        scanner.close();
    }
}
