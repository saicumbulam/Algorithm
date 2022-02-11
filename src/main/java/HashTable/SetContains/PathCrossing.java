package HashTable.SetContains;

import java.util.HashSet;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        if(path.length() == 0) return true;

        HashSet<String> set = new HashSet<>();
        set.add("0,0");
        int[] source = new int[]{0,0};

        for(int i = 0; i < path.length(); i++)
        {
            char c = path.charAt(i);

            if(c == 'N')
            {
                source[0] += 1;
            }
            else if(c == 'S')
            {
                source[0] -= 1;
            }
            else if(c == 'E')
            {
                source[1] += 1;
            }
            else if(c == 'W')
            {
                source[1] -= 1;
            }

            String item = String.valueOf(source[0]) +
                    "," +  String.valueOf(source[1]);

            if(set.contains(item))
            {
                return true;
            }
            set.add(item);
        }

        return false;
    }
}
