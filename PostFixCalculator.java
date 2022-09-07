import java.util.Scanner;

public class PostFixCalculator {
    public static void main(String[] args) {
        //Accessing stack.
        StackInt stack = new StackInt(100);  
        String string;
        Scanner scnr = new Scanner(System.in);

        //In a do while loop, checking the string and performing actions on the stack.
        do {
            string = scnr.nextLine();
            if (string.charAt(0) == '+' || string.charAt(0) == '-' || string.charAt(0) == '/' || string.charAt(0) == '*') {
                if (!stack.isEmpty()) {
                     //For addition
                    if (string.charAt(0) == '+') {         
                        int n1 = stack.pop();
                        int n2 = stack.pop();
                        stack.push(n1 + n2);
                    //For subtraction
                    } else if (string.charAt(0) == '-') {   
                        int n1 = stack.pop();
                        int n2 = stack.pop();
                        stack.push(n1 - n2);
                    //For multiplication
                    } else if (string.charAt(0) == '*') {   
                        int n1 = stack.pop();
                        int n2 = stack.pop();
                        stack.push(n1 * n2);
                     //For division
                    } else if (string.charAt(0) == '/') {   
                        int n1 = stack.pop();
                        int n2 = stack.pop();
                        stack.push(n1 / n2);
                    }
                } 
                else {
                    System.out.println("Invalid input!");  
                }
            } 
            else if (Character.isDigit(string.charAt(0))) {
                stack.push(Integer.parseInt(string));
            }
        } 
        
        while (string.charAt(0) != '=');    //Loop breaks when '=' is encountered.

        int result = stack.pop();                  //Storing result in a variable.
        scnr.close();          

        if (stack.isEmpty()) {
            System.out.println(result);
            return;
        }

        System.out.println("Too few operators.");
    }
}