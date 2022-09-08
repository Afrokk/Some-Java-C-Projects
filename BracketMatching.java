import java.util.Scanner;

public class BracketMatching {

    public static void BracketMatcher(String bracketString) {

        int len = bracketString.length();
        StackChar stack = new StackChar(len); //Accessing stack.

        //In a for loop, checking each bracket one by one and performing actions on the stack.
        for (int i = 0; i < len; i++) {
            char readCh = bracketString.charAt(i);

            if (readCh == '(') {
                stack.push(readCh);
            } 
            else if (readCh == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } 
                else {
                    System.out.printf("Mismatched bracket at position %d.", i+1);
                }
            }
            else {
                System.out.println("Invalid input!");       //Exception
                return;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("All brackets matched!");
            return;
        }
    }
    public static void main(String[] args) {        //Main driver program.
        String brackets;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Bracket String: ");
        brackets = scnr.nextLine();
        BracketMatcher(brackets);
        scnr.close();
    }
}