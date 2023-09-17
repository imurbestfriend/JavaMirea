package Test;

import java.util.Arrays;
import java.util.Comparator;



public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30)
        };



        Arrays.sort(people, Comparator.comparingInt(Person::getAge));
        System.out.println("Сортировка по возрасту:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
