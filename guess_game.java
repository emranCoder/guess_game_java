package com.emranCoder;
import java.util.Random;
import java.util.Scanner;

class Game{
    private int userInput,guessNumber=0;
    private final int cpu;
    Scanner sc = new Scanner(System.in);

    public Game()
    {
        Random rn = new Random();
        cpu = rn.nextInt(100);
        start();
    }
    private void getInput()
    {
        userInput = sc.nextInt();
        guessNumber++;
    }
    private void isCorrectNumber(int x)
    {
        if(x>cpu)
        {
            System.out.println("Make it Small!");
            start();
        } else if(x<cpu) {
            System.out.println("Make it bigger!");
            start();
        }else
        {
            System.out.println("# You got it right!");
            System.out.println("Your Point is: "+ --guessNumber);
        }
    }
    private void start()
    {
        getInput();

        if(0>=userInput || userInput<=100)
        {
            isCorrectNumber(userInput);
        }else
        {
            start();
        }

    }


}

public class guess_game {
    public static void main(String[] args) {

        System.out.println("Guess The Number: ");
        Game obj = new Game();

    }
}
