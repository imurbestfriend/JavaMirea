package third.four;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = 0;
        boolean flag = false;

        while (!flag) {
            System.out.print("Введите размер массива: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                flag = true;
            } else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }
        int[] array = new int[size];
        int[] evenArray = new int[size];
        for(int i = 0;i < size; i++){
            array[i] = random.nextInt(100);
        }
        for(int i = 0; i < array.length; i++){
           if (array[i] % 2 == 0){
               evenArray[i] = array[i];
           }
           else {

           }
        }
        for (int num : evenArray) {
            System.out.println(num + " ");
        }

    }
}
