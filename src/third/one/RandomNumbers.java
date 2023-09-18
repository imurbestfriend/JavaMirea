package third.one;
import java.util.Random;
import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for(int num : array){
            System.out.print(num + " ");
        }
        Arrays.sort(array);
        System.out.println(" ");
        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
