package Lecture1.Home.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {

        System.out.println("Input month number: ");

        Scanner scanner = new Scanner(System.in);

        try {
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                if (num <= 0 || num > 12) {
                    System.out.println("Input month number once again: ");
                } else {

                    switch (num) {
                        case 1:
                            System.out.println("January");
                            break;
                        case 2:
                            System.out.println("February");
                            break;
                        case 3:
                            System.out.println("March");
                            break;
                        case 4:
                            System.out.println("April");
                            break;
                        case 5:
                            System.out.println("May");
                            break;
                        case 6:
                            System.out.println("June");
                            break;
                        case 7:
                            System.out.println("July");
                            break;
                        case 8:
                            System.out.println("August");
                            break;
                        case 9:
                            System.out.println("September");
                            break;
                        case 10:
                            System.out.println("October");
                            break;
                        case 11:
                            System.out.println("November");
                            break;
                        default:
                            System.out.println("December");
                    }
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("It's not a number!");
        }
    }
}
