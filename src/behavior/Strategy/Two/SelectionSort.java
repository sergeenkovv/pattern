package behavior.Strategy.Two;

import java.util.Arrays;

class SelectionSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("дo:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                int tmp = arr[i];
                if (arr[i] < arr[barier]) {
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr)  + "\n");
    }
}