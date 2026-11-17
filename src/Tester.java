package src;

import java.util.ArrayDeque;
import java.util.Deque;
import  java.util.*;
class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
        //Implement your logic here and change the return statement accordingly
        if (inputStack.size() < 3) {
            return inputStack; // No change needed
        }

        // Store bottom 3 elements
        List<Character> bottomThree = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bottomThree.add(((LinkedList<Character>) inputStack).removeFirst());
        }

        // Add them to top (end of deque)
        for (Character ch : bottomThree) {
            inputStack.addLast(ch);
        }

        return inputStack;
    }

    public static void main(String[] args) {

        Deque<Character> inputStack = new ArrayDeque<Character>();
        inputStack.push('E');
        inputStack.push('D');
        inputStack.push('C');
        inputStack.push('B');
        inputStack.push('A');

        Deque<Character> resultStack = updateStack(inputStack);

        System.out.println("The alphabets in updated stack are:");
        for(Character alphabet: resultStack)
            System.out.println(alphabet);
    }
}