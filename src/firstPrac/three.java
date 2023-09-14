package firstPrac;


public class three {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = i;
            sum += i;
        }
        double average = (double) sum / 10;
        System.out.println(sum);
        System.out.println(average);

    }
}
