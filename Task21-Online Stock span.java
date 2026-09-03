import java.util.Stack;

class StockSpanner {
    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }
}

OUTPUT:
Accepted

Runtime: 0 ms

Case 1

Input:
["StockSpanner","next","next","next","next","next","next","next"]

[[],[100],[80],[60],[70],[60],[75],[85]]

Output:
[null,1,1,1,2,1,4,6]

Expected:
[null,1,1,1,2,1,4,6]