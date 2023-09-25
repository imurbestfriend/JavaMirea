package third.three;
import java.util.Random;
public class RandomList {
    public static void main(String[] args) {
        Random random = new Random();
        int ArraySize = 5;
        int[] array = new int[ArraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

       // int[] array = {1,2,3};
        for (int number : array) {
            System.out.println(number);
        }
        System.out.println("-----");
        boolean isIncreasing = isFunctionIncrease(array);
        System.out.println(isIncreasing);

    }
    public static boolean isFunctionIncrease(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                return false;
            }
        }
        return true;
    }
}
