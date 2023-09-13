package firstPrac;
public class six {
    public static void main(String[] args) {
        int n = 10; // количество элементов ряда
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println(sum);
            System.out.println(" ");
        }
    }
}