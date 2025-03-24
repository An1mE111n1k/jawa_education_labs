import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число х: ");
        double x = scanner.nextDouble();

        final double b = 2.73;
        final double a = 1.68;
        double y;

        if (x <= 1 ){
            y = Math.pow(x,3)+ 2*a;
        } else if (1 < x && x<= 3) {
            y = Math.pow(4*x+b,2);
        }else {
            y = 1/(Math.pow(x,2)+ Math.pow(a,2));

        }
        System.out.println("Ответ: " + y);
        scanner.close();

    }

}
