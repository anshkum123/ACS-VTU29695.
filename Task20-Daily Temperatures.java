import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }

            stack.push(i);
        }

        return answer;
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1
Case 2
Case 3

Input:
temperatures = [73,74,75,71,69,72,76,73]

Output:
[1,1,4,2,1,1,0,0]

Expected:
[1,1,4,2,1,1,0,0]