import java.util.Scanner;

public class Lab_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество углов: ");
        int ygol = scanner.nextInt();
        String figure;

        switch (ygol){
            case 3:
                figure = "Треугольник";
                break;
            case 4:
                figure = "Четырехугольник";
                break;
            case 5:
                figure = "Пятиугольник";
                break;
            case 6:
                figure = "Шестиугольник";
                break;
            case 7:
                figure = "Семиугольник";
                break;
            case 8:
                figure = "Восьмиугольник";
                break;
            default:
                if (ygol> 8) {
                    figure = "Многоугольник";
                } else if (ygol< 3) {
                    figure = "Такой фигуры нет";
                } else {
                    figure = "Неизвестная фигура";
                }
                break;
}
        System.out.println("Фигура с " + ygol + " углами: " + figure);
        scanner.close();
    }
}
