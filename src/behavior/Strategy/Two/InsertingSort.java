package behavior.Strategy.Two;

import java.util.Arrays;

class InsertingSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("no: \t" + Arrays.toString(arr));
        for (int barier = 1; barier < arr.length; barier++) {
            int index = barier;
            while (index - 1 > -0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr)  + "\n");
    }
}