package com.company;

import java.util.Scanner;

public class DigitAdder {

    public static void main(String[] args) {
	// write your code here
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a number : ");
      int number = scan.nextInt();
      someStuff(number);
    }
    public static void someStuff(int x){
        if (x < 100){
            System.out.println("Please enter a valid value!");
        }
        else if(x>999){
            System.out.println("Please enter a valid number!");
        }
    else {
        int thirdDigit =  x/100 ;
        int counter = x%100;
        int secondDigit = counter/10;
        counter = counter%10;
        int firstDigit = counter;
            System.out.println("Your value is: "+(thirdDigit+secondDigit+firstDigit));

        }
    }

}
