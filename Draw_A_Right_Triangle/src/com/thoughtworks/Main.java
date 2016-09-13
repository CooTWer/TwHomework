package com.thoughtworks;

public class Main {
    public static void main(String args[]){
        int round = Integer.parseInt(args[0]);
        for (int i=0; i<round; i++){
            for (int j=0; j<i+1;j++){
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
