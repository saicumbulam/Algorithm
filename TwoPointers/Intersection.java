package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public List<List<Integer>> calc(List<List<Integer>> a, List<List<Integer>> b) {
        // write your code here
        int i = 0, j = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        while (i < a.size() && j < b.size()) {
            if (a.get(i).get(1) >= b.get(j).get(0) &&
                    a.get(i).get(0) <= b.get(j).get(1)) {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                temp.add(j);
                result.add(temp);
            }
            if (a.get(i).get(1) < b.get(j).get(1)) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
