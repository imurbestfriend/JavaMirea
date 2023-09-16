package secondPrac.three;
import secondPrac.five.Dog;

import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
        ArrayList<Point> array = new ArrayList<Point>();
        addPointToArray(array,3,6);
        addPointToArray(array,4,9);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
    public static void addPointToArray(ArrayList<Point> array, int x, int y) {

        Point point = new Point(x, y);

        // Добавляем его в массив
        array.add(point);

    }
}
