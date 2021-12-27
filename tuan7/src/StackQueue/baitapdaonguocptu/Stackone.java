package StackQueue.baitapdaonguocptu;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stackone {
    public static void main(String[] args) {
        int [] stack2 = new int[5];
        stack2[0] = 1;
        stack2[1] = 2;
        stack2[2] = 3;
        stack2[3] = 4;
        stack2[4] = 5;
        System.out.println(Arrays.toString(stack2));
        Stack <Integer> stack1 = new Stack<>();
        System.out.println("chuỗi đảo ngược");
        for (int i = 0 ; i < stack2.length; i++){
            System.out.print(stack1.pop());
        }
    }

}
