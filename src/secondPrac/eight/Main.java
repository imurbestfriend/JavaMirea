package secondPrac.eight;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "pear", "grape"};
        int n = arr.length;


        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (String elem : arr) {
            System.out.println(elem + " ");
        }
    }
}
