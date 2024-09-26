package quiz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solve(int[][] map) {
        int count = 0;
        int[] current = {0, 0};
        int[] goal = {4, 4};
        Queue<int[]> queue = new LinkedList<int[]>(Arrays.asList(map));
        while (!Arrays.equals(current, goal)) {
            int[] a = queue.peek();
            if (current[0] != map.length - 1) {
                if (current[1] == map[0].length - 1 || a[current[1] + 1] == 0) {
                    queue.poll();
                    current[0]++;
                } else current[1]++;
            } else {
                if (current[1] == map[0].length - 1 || a[current[1] + 1] == 0) {
                    queue.add(map[current[0] - 1]);
                    current[0]--;
                } else current[1]++;
            }
            count++;
        }
        return count;
    }
}
