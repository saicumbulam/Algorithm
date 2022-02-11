package HashTable.IndexCapture;

import java.util.HashMap;

public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(B[i],i);
        }
        for(int i=0;i<n;i++){
            res[i] = map.get(A[i]);
        }
        return res;
    }
}
