import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        boolean isSpecial = (x >= 10 && x < 30) || (x > 40 && x < 70);
        System.out.println("isSpecial = " + isSpecial);
        scanner.close();
    }
}
