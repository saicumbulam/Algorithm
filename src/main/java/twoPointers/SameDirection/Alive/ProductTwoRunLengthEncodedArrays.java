package twoPointers.SameDirection.Alive;

import java.util.ArrayList;
import java.util.List;

public class ProductTwoRunLengthEncodedArrays {
    public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
        List<List<Integer>> res = new ArrayList<>();
        int n = encoded1.length;

        int i = 0, j = 0;

        while (i < encoded1.length && j < encoded2.length) {
            int[] arr1 = encoded1[i];
            int[] arr2 = encoded2[j];

            int val = arr1[0] * arr2[0];
            int freq = Math.min(arr1[1], arr2[1]);

            if (res.size() == 0 || val != res.get(res.size()-1).get(0)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(val);
                temp.add(freq);
                res.add(temp);
            } else {
                List<Integer> temp = res.get(res.size() - 1);
                temp.set(1, temp.get(1) + freq);
            }

            arr1[1] -= freq;
            if (arr1[1] == 0) i++;
            arr2[1] -= freq;
            if (arr2[1] == 0) j++;
        }

        return res;
    }
}
