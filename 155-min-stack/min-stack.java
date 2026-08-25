
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
     stack = new Stack<>();
     min = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()) 
        {
            stack.push(val);
            min.push(val);
            return;
        }
        else{
                stack.push(val);
                if(min.peek()>=val){
                    min.push(val);
                    return;
                }
        }
    }

    public void pop() {
        
        if(stack.isEmpty()) 
        {return ;}
        if(stack.peek().equals(min.peek()))
        min.pop();
        stack.pop();
        return;
    }

    public int top() {
        
        if(stack.isEmpty()) 
        {return -1;}
        return stack.peek();
    }

    public int getMin() {
        if(stack.isEmpty()) 
        {return -1;}
        return min.peek();
}
}