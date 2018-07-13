package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

      int[] array = {5, 4, 9, 1 ,7 ,3};

      sortedArray(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sortedArray (int[] array) {
        int tmp = 0;
            int i = 0;
            while (i < array.length - 1) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    sortedArray(array);
                }
                i++;

        }
    }

}
