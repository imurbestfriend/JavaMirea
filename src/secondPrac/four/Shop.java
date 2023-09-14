package secondPrac.four;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Shop implements ShopMet {




    public static void main(String[] args) {
        String[] numbers = generateArray(5);
    }

    public static String[] generateArray(int size) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[size]; // создание массива заданного размера

        // заполнение массива значениями
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLine();
        }

        return array; // возвращаем массив
    }












    @Override
    public void findPC() {

    }

    @Override
    public void addPC() {

    }

    @Override
    public void removePC() {

    }
}
