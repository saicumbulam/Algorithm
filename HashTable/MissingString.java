package HashTable;
import java.util.*;

public class MissingString {
    public List<String> missingString(String str1, String str2) {
        // Write your code here
        List<String> res = new ArrayList<>();
        
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        Set<String> set = new HashSet<>();
        
        for (String str : arr2) {
            set.add(str);
        }
        
        for (String str : arr1) {
            if (!set.contains(str)) {
                res.add(str);
            }
        }
        
        return res;
    }
}
