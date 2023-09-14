package secondPrac.four;
import java.util.Scanner;
import java.util.ArrayList;
public class Shop implements ShopMet {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            // Делайте что-то с введенными значениями
            numbers.add(input);
        }

        scanner.close();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        }


    @Override
    public void removePC() {

    }
}
