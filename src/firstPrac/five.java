package firstPrac;

public class five {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки.");
        } else {

            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
}