package HashTable.SetContains;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        int[] arr = new int[26];

        for(int i = 0; i < ransomNote.length(); i++)
        {
            char c = ransomNote.charAt(i);
            arr[c - 'a']++;
        }

        for(int i = 0; i < magazine.length(); i++)
        {
            char c = magazine.charAt(i);
            arr[c - 'a']--;
        }



        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0) return false;
        }

        return true;
    }
}
