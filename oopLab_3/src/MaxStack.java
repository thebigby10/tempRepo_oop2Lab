import java.util.Stack;

public class MaxStack {
    Stack<Integer >stack = new Stack<Integer >();
    Stack<Integer> max_elements = new Stack<Integer>();
    // int max_element = -1;
    public void push(int n){
        stack.push(n);
        if(max_elements.peek()<=n) max_elements.push(n);
    }
    public int pop(){
        if(!stack.isEmpty()){
            if(stack.peek()==max_elements.peek()){
                max_elements.pop();
                return max_elements.pop();
            }
        }
        return max_elements.pop();
    }
    public int max(){
        return max_elements.peek();
    }
    
}
