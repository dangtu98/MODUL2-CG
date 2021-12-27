package StackQueue.TH1;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack <String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("1.1 Size of stack after push operations:" + stack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    private static void stackOfInteger(){
        MyGenericStack <Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfInteger();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
