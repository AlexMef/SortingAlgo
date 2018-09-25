import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayLong = new int[100000];
        for (int i = 0; i < arrayLong.length; i++){
            arrayLong[i] = random.nextInt(1000);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayLong.length; i++){
            for (int j = 1; j < arrayLong.length ; j++ ){
                if (arrayLong[j] < arrayLong[j-1]){
                    int temp = arrayLong[j];
                    arrayLong[j] = arrayLong[j-1];
                    arrayLong[j-1] = temp;
                }
            }
        }

        long stopTime = System.currentTimeMillis();
        System.out.println("Bubble sort " + (stopTime - startTime));

        int[] arrayLong2 = new int[1000];
        for (int i = 0; i < arrayLong2.length; i++) {
            arrayLong2[i] = random.nextInt(100000);
        }
        startTime = System.currentTimeMillis();
        Arrays.sort(arrayLong2);
        stopTime = System.currentTimeMillis();
        System.out.println("Quicksort " + (stopTime - startTime));

    }
}
