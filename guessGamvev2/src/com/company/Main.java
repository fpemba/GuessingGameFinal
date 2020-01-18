package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int numberUserGuessed;
        int answer;
        int MAX = 10;
        Random rand = new Random();
        answer = rand.nextInt(MAX) + 1;
        System.out.println("Guess a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);


        int count = 0;
        while (count < 3) {

            if (count == 1) {
                System.out.println("You have one more guess left!");
            }
            numberUserGuessed = scanner.nextInt();
            count++;
            if (numberUserGuessed == 0) {

                System.out.println("Guess a number between 1 and 10 again");
                numberUserGuessed = scanner.nextInt();
            }
            if (numberUserGuessed == -1) {
                System.out.println("Exiting game");
                break;
            }
            if (numberUserGuessed == answer) {
                System.out.println("You have guessed the correct answer!");
                break;
            }
            if(numberUserGuessed < answer){
                System.out.println("HINT: Guess a higher number");
            }
            if(numberUserGuessed > answer){
                System.out.println("HINT: Guess a lower number.");
            }
            if (count == 3) {
                System.out.println("Sorry, you ran out of turns & have lost");
                System.out.println("The correct answer was " + answer);
                break;
            }
        }
      
    }
}
