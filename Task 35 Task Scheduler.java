import java.util.*;

class Solution {

    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency of each task
        for (char c : tasks) {
            freq[c - 'A']++;
        }

        // Sort frequencies
        Arrays.sort(freq);

        // Highest frequency
        int maxFreq = freq[25];

        // Count how many tasks have the highest frequency
        int maxCount = 0;

        for (int f : freq) {
            if (f == maxFreq) {
                maxCount++;
            }
        }

        // Calculate minimum intervals
        return Math.max(
            tasks.length,
            (maxFreq - 1) * (n + 1) + maxCount
        );
    }
}