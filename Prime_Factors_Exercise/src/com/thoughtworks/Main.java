package com.thoughtworks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    static List<Integer> numberList = new ArrayList<>();
    static boolean overFlag = false;

    public static void generate(int number){
        boolean flag = false;
        for (int i=2; i<10 && !overFlag; i++){
            if(number%i == 0 && number != i){
                flag = true;
                numberList.add(i);
                generate(number/i);
            }
        }
        if (!flag){
            if(!numberList.isEmpty()){
                numberList.add(number);
                overFlag = true;
            }
        }
    }

    public static void main(String args[]){
        int number = Integer.parseInt(args[0]);
        generate(number);
        Collections.sort(numberList);
        System.out.print(numberList);
    }
}
