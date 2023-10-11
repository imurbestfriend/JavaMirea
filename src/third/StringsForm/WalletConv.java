package third.StringsForm;

public class WalletConv {
    public static int dolConv(int number) {
        int dolResult = number * 97;
        return dolResult;
    }

    public static int eurConv(int number) {
        int eurResult = number * 101;
        return eurResult;
    }
    public static void main(String[] args) {
        System.out.println(eurConv(5));
        System.out.println(dolConv(5));
    }
}
