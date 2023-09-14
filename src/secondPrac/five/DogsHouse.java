package secondPrac.five;
import java.util.ArrayList;


public class DogsHouse {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        addDogToArray(dogs, "John", 3);
        addDogToArray(dogs, "Jane", 2);
        addDogToArray(dogs, "Alice", 1);

        // Выводим содержимое массива
        for (Dog person : dogs) {
            System.out.println(person);
        }

    }
    public static void addDogToArray(ArrayList<Dog> array, String name, int age) {
        // Создаем новый объект Dog
        Dog dog = new Dog(name, age);

        // Добавляем его в массив
        array.add(dog);

    }
}
