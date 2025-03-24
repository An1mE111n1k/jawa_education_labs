import java.util.Scanner;

public class Lab_2_1 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ввод координат вершин треугольника
                System.out.println("Введите координаты первой вершины (x1, y1):");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();

                System.out.println("Введите координаты второй вершины (x2, y2):");
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();

                System.out.println("Введите координаты третьей вершины (x3, y3):");
                double x3 = scanner.nextDouble();
                double y3 = scanner.nextDouble();

                // Вычисление длин сторон треугольника
                double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Сторона a
                double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // Сторона b
                double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // Сторона c

                // Вычисление периметра
                double perimeter = a + b + c;

                // Вычисление площади по формуле Герона
                double s = perimeter / 2; // Полупериметр
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                // Вывод результатов
                System.out.printf("Периметр треугольника: %.2f%n", perimeter);
                System.out.printf("Площадь треугольника: %.2f%n", area);
            }
}
