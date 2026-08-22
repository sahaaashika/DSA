class MinStack {
    Stack<Long> stack = new Stack<>();
    long min;

    public MinStack() {
    }

    public void push(int val) {
        long x = val;

        if (stack.isEmpty()) {
            stack.push(x);
            min = x;
        } 
        else if (x < min) {
            stack.push(2 * x - min);
            min = x;
        } 
        else {
            stack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long x = stack.pop();

        if (x < min) {
            min = 2 * min - x;
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;

        long x = stack.peek();

        if (x < min) {
            return (int) min;
        }

        return (int) x;
    }

    public int getMin() {
        if (stack.isEmpty()) return -1;

        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */