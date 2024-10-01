class Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; 
    }

    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full! Cannot push " + element);
        } else {
            stack[++top] = element;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack = [");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]);
                if (i < top) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");  
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
    
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.display();
        int poppedElement = stack.pop();
        stack.display();
        System.out.println("Popped element = " + poppedElement);

        
        System.out.println();
        stack.push(10);
        stack.push(20);
        stack.display();
        poppedElement = stack.pop();
        stack.display();
        System.out.println("Popped element = " + poppedElement);
        stack.push(15);
        stack.display();
    }
}
