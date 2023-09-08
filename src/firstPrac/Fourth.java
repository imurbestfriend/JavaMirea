package firstPrac;
import java.util.Scanner;
public class Fourth {
    Scanner scanner = new Scanner(System.in);

    short size = 10;
    int[] arr = new int[size]; //меняем на short -> все ломается
    short i = 0;
    public int[] While(){
        while(i<10){
            arr[i] = scanner.nextInt();
            i++;
        }
        for(int j=0;j<10;j++){
            System.out.println(arr[j]);
        }
        return arr;
    }
    public void DOWhile(){
        do {
            arr[i] = scanner.nextInt();
            i++;
        }while (i<10);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        int max = arr[arr.length-1];
        int min = arr[0];
        for(int j=0;j<10;j++){
            System.out.println(arr[j]);
        }
        System.out.println("- - - - - - - - - -");
        System.out.println(max);
        System.out.println(min);
    }


}
