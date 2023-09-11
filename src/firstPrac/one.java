package firstPrac;

public class one {
        short summ = 0;
        short size = 10;
        short[] array = new short[size];
        public void arr(){
            for (short i = 0; i < array.length; i++) {
                array[i] = i;
                summ += i;
            }
            for (short i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
            double average = (double) summ / array.length;
            System.out.println(summ);
            System.out.println(average);
        }

}
