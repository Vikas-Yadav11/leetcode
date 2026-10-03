class Solution {

    HashMap<Character, String> map = new HashMap<>();
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        StringBuilder diary = new StringBuilder();

        if (digits.length() == 0) {
            return ans;
        }

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        fun(digits, 0, diary);

        return ans;
    }

    void fun(String digits, int index, StringBuilder diary) {

        if (index == digits.length()) {
            ans.add(diary.toString());
            return;
        }

        String choice = map.get(digits.charAt(index));

        for (int i = 0; i < choice.length(); i++) {

            diary.append(choice.charAt(i));

            fun(digits, index + 1, diary);

            diary.deleteCharAt(diary.length() - 1);
        }
    }
}