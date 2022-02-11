package Design;

import java.util.ArrayList;
import java.util.List;

public class DesignOrderedStream {
    int ptr;
    String[] res;

    public DesignOrderedStream(int n) {
        ptr = 0;
        res = new String[n];
    }

    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>();

        res[id - 1] = value;
        while (ptr < res.length && res[ptr] != null) {
            list.add(res[ptr]);
            ptr++;
        }

        return list;
    }
}
