class MinStack {
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();

    public MinStack() {
    }

    public void push(int val) {
        stack.add(val);

        if (minStack.isEmpty()) {
            minStack.add(val);
        } else {
            minStack.add(Math.min(val, minStack.get(minStack.size() - 1)));
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.get(minStack.size() - 1);
    }
}