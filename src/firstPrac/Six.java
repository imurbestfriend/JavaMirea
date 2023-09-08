package firstPrac;
public class Six {
    public void garm(){
        double x;

        for(int i = 1; i < 10; i++){
            x = (double) 1 / i;
            String s = String.format("%.2f", x);
            System.out.println(s);

            System.out.println(" ");
        }
    }
}
