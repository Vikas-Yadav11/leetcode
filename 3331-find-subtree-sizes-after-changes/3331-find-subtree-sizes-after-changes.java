



import java.util.*;

class Solution {
    List<Integer>[] adj;
    int[] last = new int[26];
    int[] ans;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        adj = new ArrayList[n];
        ans = new int[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }

        Arrays.fill(last, -1);

        int[] newParent = parent.clone();

        dfs1(0, newParent, s);

        for (int i = 0; i < n; i++) {
            adj[i].clear();
        }

        for (int i = 1; i < n; i++) {
            adj[newParent[i]].add(i);
        }

        dfs2(0);

        return ans;
    }

    void dfs1(int node, int[] newParent, String s) {
        int c = s.charAt(node) - 'a';

        int old = last[c];
        last[c] = node;

        if (node != 0 && old != -1) {
            newParent[node] = old;
        }

        for (int child : adj[node]) {
            dfs1(child, newParent, s);
        }

        last[c] = old;
    }

    int dfs2(int node) {
        int count = 1;

        for (int child : adj[node]) {
            count += dfs2(child);
        }

        ans[node] = count;
        return count;
    }
}
