package HashTable.SetContains;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> startPoints = new HashSet<>();
        for (List<String> each: paths)
            startPoints.add(each.get(0));

        for (List<String> each: paths) {
            var destination = each.get(1);
            if (!startPoints.contains(destination)) return destination;
        }

        return null;
    }
}
