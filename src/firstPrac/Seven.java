package firstPrac;
import java.util.Scanner;
import java.math.BigInteger;

public class Seven {


    public void fact(){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= x; i++){
            res = res * i;

        }
        System.out.println(res);
    }
}
