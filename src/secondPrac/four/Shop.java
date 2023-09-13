package secondPrac.four;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Shop implements ShopMet {
    Scanner scanner = new Scanner(System.in);
    short size = 5;
    String[] array = new String[size];


    List<String> abcd  = Arrays.asList(array);



    public void addItems(){
        for (short i = 0; i < size; i++) {
            array[i] = scanner.nextLine();
        }
        for (short i = 0; i < size; i++) {

        }

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
