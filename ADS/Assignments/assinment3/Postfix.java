/*. Evaluate a postfix expression using a stack.
•	Test Case 1:
Input: "5 3 + 2 *"
Output: 16
•	Test Case 2:
Input: "4 5 * 6 /"
Output: 3
 */
//Create a stack to store operands (or values).
//Scan the given expression from left to right and do the following for every scanned element.
//If the element is a number, push it into the stack.
//If the element is an operator, pop operands for the operator from the stack. Evaluate the operator and push the result back to the stack.
//When the expression is ended, the number in the stack is the final answer.
import java.util.Stack;

public class Postfix {
    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

    
        String[] tokens = exp.split(" ");

        
        for (String token : tokens) {
            
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token)); 
            }
            
            else {
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 

                
                switch (token.charAt(0)) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop(); 
    }

    public static void main(String[] args) {
        
        String exp1 = "5 3 + 2 *";
        System.out.println("Postfix evaluation of '" + exp1 + "': " + evaluatePostfix(exp1));

        
        String exp2 = "4 5 * 6 /"; 
        System.out.println("Postfix evaluation of '" + exp2 + "': " + evaluatePostfix(exp2));
    }
}
//Time Complexity: O(N) 
//Auxiliary Space: O(N)