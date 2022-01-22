package TwoPointers;
import java.util.*;

public class MergeTwoSortedIntervalLists {
    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
        List<Interval> results = new ArrayList<>();
        if(list1 == null || list2 == null) return results;

        Interval last = null, curr = null;
        int i = 0, j = 0;
        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i).start < list2.get(j).start)
            {
                curr = list1.get(i);
                i++;
            }
            else
            {
                curr = list2.get(j);
                j++;
            }
            last = merge(results, last, curr);
        }


        while(i < list1.size())
        {
            last = merge(results, last, list1.get(i));
            i++;
        }

        while(j < list2.size())
        {
            last = merge(results, last, list2.get(j));
            j++;
        }    

        if(last != null) results.add(last);
        return results;    
    }


    private Interval merge(List<Interval> results, Interval last, 
    Interval curr)
    {
        if(last == null) return curr;

        if(curr.start > last.end)
        {
            results.add(last);
            return curr;
        }

        last.end = Math.max(last.end, curr.end);
        return last;
    }
}
