import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(5);
        stack1.push(3);
        stack1.push(7);
        stack1.push(2);
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
        for(int i=0; i<stack1.size(); i++){
            int stack1pop = stack1.pop();
            int stack2peak = stack2.peek();
            int min = Math.min(stack1pop, stack2peak);
            if(min<stack2.peek()) {
                stack2.push(stack2.push(stack1pop));
            }
        }
        System.out.println();
        System.out.println(stack2.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
    }
}
