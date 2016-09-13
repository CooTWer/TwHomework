package com.thoughtworks;

public class Main {
    public static void main(String args[]) {
        int round = Integer.parseInt(args[0]);
        String result = "";
        for (int i = 0; i < round; i++) {
            result += '*';
        }
        System.out.println(result);
    }
}
