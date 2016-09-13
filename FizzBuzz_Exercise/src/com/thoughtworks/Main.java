package com.thoughtworks;


public class Main {
    public static void FizzBuzz() {
        int currentNumber = 1;
        while (currentNumber <= 100) {
            if (currentNumber % 3 != 0 && currentNumber % 5 != 0)
                System.out.println(currentNumber);
            else if (currentNumber % 3 == 0 && currentNumber % 5 != 0)
                System.out.println("Fizz");
            else if (currentNumber % 3 != 0 && currentNumber % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println("FizzBuzz");
            currentNumber++;
        }
    }

    public static void main(String args[]) {
        FizzBuzz();
    }
}
