public class stack_implement {
    int size;
    int[] stack;
    int top;
    public stack_implement(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void Push(int value) {
        if (top < size - 1) {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }
    public void pop() {
        if (top >= 0) {
            int poppedValue = stack[top--];
            System.out.println("Popped: " + poppedValue);
        }
    }
    public static void main(String[] args) {
        stack_implement stack = new stack_implement(5);
        stack.Push(5);
        stack.Push(10);
        stack.pop();
    }
}

