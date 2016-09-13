package com.thoughtworks;

import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Stack<String> lineStack = new Stack<String>();
        int round = Integer.parseInt(args[0]);
        int startPosition;
        int starNumber;
        String tempString = "";
        for (int i=0; i<round-1; i++){
            startPosition = round - i - 1;
            starNumber = i*2+1;
            while (startPosition!=0){
                System.out.print(' ');
                tempString += ' ';
                startPosition--;
            }
            while (starNumber!=0){
                System.out.print('*');
                tempString += '*';
                starNumber--;
            }
            lineStack.push(tempString);
            System.out.print('\n');
            tempString = "";
        }
        System.out.println("Tony");
        while (!lineStack.empty()){
            System.out.println(lineStack.pop());
        }
    }
}
