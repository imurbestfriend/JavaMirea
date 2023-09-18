package secondPrac.four;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Shop implements ShopMet {

    public static void addStringToList(List<String> numbers, String str){ // Функция для добавления элемента в список
        numbers.add(str);
    }
    public static void removeItem(List<String> numbers, String str) {  //Функция для удаления элемента из списка
        numbers.remove(str);
    }

    public static List<Integer> findOccurrences(List<String> list, String target) { // Поиск элемента в списке
        List<Integer> array = new ArrayList<>(); // Создаем список, в который будем вносить повторения

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                array.add(i);
            }
        }
        return array;
    }


    public static List<String> getList() { // Заполняем список элементами
        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (scanner.hasNextLine()) { // Останавливаем ввод путем ввода пустой строкой
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            // Заполняем список введенными элементами
            numbers.add(input);

        }
        scanner.close();
        return numbers;
    }

    public static void main(String[] args) {
        List<String> numbers = getList();
        addStringToList(numbers, "lenovo");
        removeItem(numbers,"mac");

        String target = "acer";

        List<Integer> array = findOccurrences(numbers, target);
        System.out.println(target + "index" + array);


        for (int i = 0; i < numbers.size(); i++) { // Вывод списка на экран
            System.out.println(numbers.get(i));
        }
    }

}


