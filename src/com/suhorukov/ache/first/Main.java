package com.suhorukov.ache.first;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by demo3 on 21.06.14.
 */
public class Main {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int rightAnswer = generator.nextInt(101);
        int i;
        for(i = 0; i < 7; ++i) {
            System.out.print("attempt number " + i + ": enter your guess: ");
            try {
                int guess = scanner.nextInt();
                System.out.println(guess);
                if(rightAnswer == guess) {
                    System.out.println("Congradulation!");
                    break;
                }
                else if(rightAnswer > guess){
                    System.out.println("more...");
                }
                else {
                    System.out.println("less...");
                }
            }
            catch(InputMismatchException nfe) {
                System.out.println("not a number");
                scanner.nextLine();
            }
        }
        if(i == 7){
            System.out.println("Boring! You stupid...");
        }
    }
}
