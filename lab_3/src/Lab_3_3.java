import java.util.Scanner;

public class Lab_3_3 {
    public static int hammingSum(int n) {
        int hammingSum = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next2 = 2, next3 = 3, next5 = 5;

        int current = 1;

        for (int i = 0; i < n - 1; i++) {
            current = Math.min(next2, Math.min(next3, next5));
            hammingSum += current;

            if (current == next2) {
                i2++;
                next2 = 2 * (1 << i2);  
            }
            if (current == next3) {
                i3++;
                next3 = 3 * (int) Math.pow(3, i3);
            }
            if (current == next5) {
                i5++;
                next5 = 5 * (int) Math.pow(5, i5);
            }
        }

        return hammingSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int result = hammingSum(n);
        System.out.println(result);
        scanner.close();
    }
}
