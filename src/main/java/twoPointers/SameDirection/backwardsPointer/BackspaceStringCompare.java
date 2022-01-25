package twoPointers.SameDirection.backwardsPointer;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String str1, String str2) {
        int index1 = str1.length()-1, index2 = str2.length()-1;
        int i1 = 0, i2 = 0;

        while (index1 >= 0 || index2 >= 0)
        {
            i1 = nextIndex(str1, index1);
            i2 = nextIndex(str2, index2);

            if (i1 < 0 && i2 < 0)
            {
                return true;
            }

            if (i1 < 0 || i2 < 0)
            {
                return false;
            }

            if (str1.charAt(i1) != str2.charAt(i2))
            {
                return false;
            }

            index1 = i1-1;
            index2 = i2-1;
        }

        return true;
    }

    private int nextIndex(String s, int index)
    {
        int count = 0;

        while(index >= 0)
        {
            if (s.charAt(index) == '#')
            {
                count++;
            }
            else if (count > 0)
            {
                count--;
            }
            else
            {
                break;
            }
            index--;
        }

        return index;
    }
}
