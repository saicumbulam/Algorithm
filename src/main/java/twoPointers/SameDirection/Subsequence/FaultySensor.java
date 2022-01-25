package twoPointers.SameDirection.Subsequence;

public class FaultySensor {
    public int badSensor(int[] o, int[] t) {
        boolean one = canShift(o, t); //can o be shfited to t?
        boolean two = canShift(t, o); //can t be shifted to o?
        if (one == two) return -1;    //both true or both false, then we can't tell
        return one? 1 : 2;
    }

    private static boolean canShift(int[] first, int[] second){ //return true if o can be shifted to t
        int i = 0, j = 0;
        while(j < first.length){
            if (first[i] != second[j]) j++;
            else {i++; j++;}
        }

        return i == first.length - 1;
        //there should be only 1 mismatch, so i has to be at o.length - 1
    }
}
