package secondPrac.ten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Count is : " + wordCount);

        scanner.close();
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}