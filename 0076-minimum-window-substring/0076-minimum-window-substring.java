class Solution {
    public String minWindow(String s, String t) {

        int need[] = new int[256];
        int window[] = new int[256];

        int low = 0;
        int count = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            need[ch]++;
        }

        for(int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            window[ch]++;

            if(window[ch] <= need[ch]) {
                count++;
            }

            while(count == t.length()) {

                if(high - low + 1 < minlen) {
                    minlen = high - low + 1;
                    start = low;
                }

                char lowchar = s.charAt(low);

                window[lowchar]--;

                if(window[lowchar] < need[lowchar]) {
                    count--;
                }

                low++;  
            }
        }

        if(minlen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minlen);
    }
}