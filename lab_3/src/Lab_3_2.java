import java.util.Scanner;

public class Lab_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Integer prev = null;
        int current = 0;

        System.out.print("Введите целое число (0 для завершения): ");
        current = scanner.nextInt();

        while (current != 0) {
            System.out.print("Введите следующее целое число (0 для завершения): ");
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                break;
            }

            if (prev != null && current > prev && current > nextNumber) {
                count++;
            }

            prev = current;
            current = nextNumber;
        }

        System.out.println("Количество чисел, больших своих соседей: " + count);
        scanner.close();
    }
}
