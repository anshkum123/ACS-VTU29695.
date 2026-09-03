class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
                result.append(ch);
            } else if (ch == ')') {
                if (open > 0) {
                    open--;
                    result.append(ch);
                }
            } else {
                result.append(ch);
            }
        }

        for (int i = result.length() - 1; i >= 0 && open > 0; i--) {
            if (result.charAt(i) == '(') {
                result.deleteCharAt(i);
                open--;
            }
        }

        return result.toString();
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2
Case 3

Input:
s = "lee(t(c)o)de)"

Output:
"lee(t(c)o)de"

Expected:
"lee(t(c)o)de"