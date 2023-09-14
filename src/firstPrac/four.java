package firstPrac;
import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int q = 0;
        int sum = 0;
        /*while (q < 5){
            arr[q] = scanner.nextInt();
            sum +=q;
            q++;
        }*/
        do {
            array[q] = scanner.nextInt();
            sum +=q;
            q++;
        } while (q < 5);

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        int min = array[0];
        int max = array[array.length-1];
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);

    }
}
