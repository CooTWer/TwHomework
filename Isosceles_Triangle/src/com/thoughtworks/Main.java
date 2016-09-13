package com.thoughtworks;

public class Main {
    public static void main(String args[]){
        int round = Integer.parseInt(args[0]);
        int startPosition;
        int starNumber;
        for (int i=0; i<round; i++){
            startPosition = round - i - 1;
            starNumber = i*2+1;
            while (startPosition!=0){
                System.out.print(' ');
                startPosition--;
            }
            while (starNumber!=0){
                System.out.print('*');
                starNumber--;
            }
            System.out.print('\n');
        }
    }
}
