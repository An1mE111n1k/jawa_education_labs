package lab1;

public class Task1L1 {
    public static void task1l1(){
        // Заданные константы
        final double a = 6.32;
        final double b = 3.704;
        final double x = 7.15;

        // Вычисление значения функции
        double numerator = a * x;
        double denominator = Math.sqrt(b * b + 2 * a * a - b * x);
        double y = numerator / denominator;

        // Вывод результата
        System.out.println("Результат вычисления функции:");
        System.out.println("y = " + y);
        System.out.printf("y = %.4f (с округлением до 4 знаков после запятой)\n", y);

        // Дополнительный вывод для проверки промежуточных значений
        System.out.println("\nПромежуточные значения:");
        System.out.println("Числитель (a*x) = " + numerator);
        System.out.println("Значение под корнем = " + (b*b + 2*a*a - b*x));
        System.out.println("Знаменатель (корень) = " + denominator);
    }
}
