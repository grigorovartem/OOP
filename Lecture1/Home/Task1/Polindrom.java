package Lecture1.Home.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        searchPalindrom(scanner);
    }

    private static void searchPalindrom(Scanner scanner) {
        List<String> nums = new ArrayList<>();
        while (scanner.hasNext()){
            nums.add(scanner.nextLine());
            printPalindrom(nums);
        }
    }

    private static void printPalindrom(List<String> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).equals(new StringBuilder(nums.get(i)).reverse().toString())){
                System.out.println(nums.get(i));
            }
        }

    }
}
