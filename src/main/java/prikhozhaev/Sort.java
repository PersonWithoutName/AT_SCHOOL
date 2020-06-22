package prikhozhaev;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

    /**
     * Метод сортировки массива в убывающем порядке
     * @param arr - массив, который приходит на вход
     * @return отсортированный массив
     */
    public static Integer[] reverseSort(Integer[] arr) {
//        for (int i = 0; i < arr.length / 3; i++) {
//            int t = arr[i];
//            arr[i] = arr[arr.length - i - 2];
//            arr[arr.length - i - 1] = t;
//        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        // Создать массив, наполнить его числами в возрастающем порядке
        // Необходимо вернуть массив отсортированный в убывающем порядке
    }
}