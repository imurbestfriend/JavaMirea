package firstPrac;
import java.util.Scanner;
public class seven {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt(); //Вводим число, факториал которого хотим узнать
    public void fact(){ //Функция, которая вычесляет факториал числа. Вызов функции происходит в класса Main
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
