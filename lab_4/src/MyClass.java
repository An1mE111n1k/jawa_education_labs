import lab2.*;
import lab1.*;
import lab2.Task1;
import lab2.Task2;
import lab2.Task3;
import lab3.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMainMenu();

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                switch (choice) {
                    case 1:
                        lab1Menu();
                        break;
                    case 2:
                        lab2Menu();
                        break;
                    case 3:
                        lab3Menu();
                        break;
                    case 0:
                        System.out.println("Программа завершена.");
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число от 0 до 3!");
                scanner.nextLine();
                choice = -1;
            }

        } while (choice != 0);
    }

    private static void displayMainMenu() {
        System.out.println("\n=== Главное меню ===");
        System.out.println("1. Лабораторная работа 1");
        System.out.println("2. Лабораторная работа 2");
        System.out.println("3. Лабораторная работа 3");
        System.out.println("0. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    private static void lab1Menu() {
        int choice;

        do {
            System.out.println("\nЛабораторная работа 1:");
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("0. Назад");
            System.out.print("Выберите задание: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Task1L1.task1l1();
                        break;
                    case 2:
                        Task1L2.task2l1();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число от 0 до 2!");
                scanner.nextLine();
                choice = -1;
            }

        } while (choice != 0);
    }

    private static void lab2Menu() {
        int choice;

        do {
            System.out.println("\nЛабораторная работа 2:");
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 4");
            System.out.println("0. Назад");
            System.out.print("Выберите задание: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Task1.runTask1();
                        break;
                    case 2:
                        Task2.runTask2();
                        break;
                    case 3:
                        Task3.runTask3();
                        break;
                    case 4:
                        Task4.runTask4();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число от 0 до 4!");
                scanner.nextLine();
                choice = -1;
            }

        } while (choice != 0);
    }

    private static void lab3Menu() {
        int choice;

        do {
            System.out.println("\nЛабораторная работа 3:");
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 1 (рекурсия)");
            System.out.println("0. Назад");
            System.out.print("Выберите задание: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Task1L3.task1();
                        break;
                    case 2:
                        Task2L3.task2();
                        break;
                    case 3:
                        Task3L3.task3();
                        break;
                    case 4:
                        Task1L3Recursive.task1Recursive();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число от 0 до 4!");
                scanner.nextLine();
                choice = -1;
            }

        } while (choice != 0);
    }
}
