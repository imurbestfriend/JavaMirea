package firstPrac;

public class five {
    public static void main(String[] args) {
        // Проверка наличия аргументов командной строки
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки.");
        } else {
            // Используем цикл for для перебора всех аргументов и выводим их на экран
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
}