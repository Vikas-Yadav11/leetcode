import java.util.*;

class Pair {
    int first;
    int second;

    Pair(int f, int s) {
        first = f;
        second = s;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.first != b.first)
                    return a.first - b.first;

                return Integer.compare(a.second, b.second);
            }
        );

        // Step 3: Add frequency and number
        for (int num : map.keySet()) {

            Pair p = new Pair(map.get(num), num);

            pq.add(p);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().second;
        }

        return ans;
    }
}