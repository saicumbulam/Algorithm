package Interval;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    class Element
    {
        int start;
        int end;

        public Element(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
    }

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<Element> listA = new ArrayList<>();
        for (int i = 0; i < A.length; i++)
        {
            listA.add(new Element(A[i][0], A[i][1]));
        }

        List<Element> listB = new ArrayList<>();
        for (int i = 0; i < B.length; i++)
        {
            listB.add(new Element(B[i][0], B[i][1]));
        }

        List<Element> resultList = Calculate(listA, listB);

        int[][] result = new int[resultList.size()][2];
        for (int idx = 0; idx < resultList.size(); idx++) {
            result[idx][0] = resultList.get(idx).start;
            result[idx][1] = resultList.get(idx).end;
        }
        return result;
    }

    public List<Element> Calculate(List<Element> A, List<Element> B)
    {
        int i = 0, j = 0;
        int m = A.size(), n = B.size();

        List<Element> resultList = new ArrayList<>();
        while (i < m && j < n) {
            Element aVal = A.get(i), bVal = B.get(j);

            if (aVal.start <= bVal.end && bVal.start <= aVal.end) {
                // First check "criss cross" intersection
                resultList.add(new Element(Math.max(aVal.start, bVal.start),
                        Math.min(aVal.end, bVal.end)));
            }
            if (aVal.end <= bVal.end) i++; //Next A
            else j++; // Next B
        }

        return resultList;
    }
}
