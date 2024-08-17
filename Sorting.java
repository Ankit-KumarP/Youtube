// 16/08/2024, 14:05 |
package Youtube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// sortMe
class SortMe implements Comparator<int[]> {

    public int compare(int[] arr1, int[] arr2) {

        int value1 = arr1[0] - arr2[1];
        int value2 = arr1[1] - arr2[1];

        if (value1 == 0)
            return value2;
        return value1;

    }

}

// sortMe2
class sortMe2 implements Comparator<List<Integer>> {

    public int compare(List<Integer> list1, List<Integer> list2) {

        int value1 = list1.get(0) - list2.get(0);
        int value2 = list1.get(1) - list2.get(1);

        if (value1 == 0)
            return value2;
        return value1;
    }

}

// SortMap
class SortMap implements Comparator <Map.Entry<Integer, Integer>> {

    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        int value = m2.getValue() - m1.getValue();
        int key = m2.getKey() - m1.getKey();

        if (value == 0)
            return key;
        return value;
    }
}

public class Sorting {
    public static void main(String[] args) {

        // 2D ARRAY

        // Arrays.sort(arr);
        // Collections.sort(list);

        // for(int i : arr){
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.println(list);

        // int[][] arr2 = {
        // { 78, 9, 87 },
        // { 1, 5, 7 },
        // { 1, 4, 5 }

        // };

        // System.out.println("BEFORE SORTING");
        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr2[i].length; j++) {
        // System.out.print(arr2[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Arrays.sort(arr2, new SortMe());

        // System.out.println("AFTER SORTING");
        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr2[i].length; j++) {
        // System.out.print(arr2[i][j] + " ");
        // }
        // System.out.println();
        // }

        // 2D LIST

        // List<List<Integer>> list2 = new ArrayList<>();
        // List<Integer> temp1 = new ArrayList<>();
        // List<Integer> temp2 = new ArrayList<>();
        // List<Integer> temp3 = new ArrayList<>();
        // temp1.add(90);
        // temp1.add(6);
        // temp1.add(9);

        // temp2.add(10);
        // temp2.add(6);
        // temp2.add(9);

        // temp3.add(0);
        // temp3.add(61);
        // temp3.add(93);

        // list2.add(temp1);
        // list2.add(temp2);
        // list2.add(temp3);

        // System.out.println("BEFORE SORTING");
        // System.out.println(list2);

        // System.out.println("AFTER SORTING");
        // Collections.sort(list2, new sortMe2());
        // System.out.println(list2);

        // HASHMAP
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 6);
        hm.put(3, 7);
        hm.put(6, 1);
        hm.put(4, 20);
        hm.put(2, 34);


        List <Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

        System.out.println("BEFORE SORTING");
        System.out.println(list);

        System.out.println("AFTER SORTING");
        Collections.sort(list, new SortMap());
        System.out.println(list);

    }

}
