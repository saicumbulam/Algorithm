package HashTable.Freqency;

public class FindTownJudge {
    public int findJudge(int N, int[][] trust) {

        if (trust.length < N - 1) {
            return -1;
        }

        int[] count = new int[N + 1];

        for (int[] relation : trust) {
            count[relation[0]]--;
            count[relation[1]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (count[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
