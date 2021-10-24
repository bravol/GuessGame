package code.guessGame;

import java.util.Random;
import java.util.Scanner;
       /* A CHALLENGE OF CREATING A GAME

        we are going to make a GAME
        the concept is Generate a randon number and ask the user to guess the number,
        continue asking until you receive the number
        after 5 times of guessing show a game over message

        Here is how it works;
        show a welcome message
        Ask the User's name and say hello to the user
        ask if we should start the game
        After receiving  a positive answer generate a random number and ask for the user's guess
        if the guess is correct, show congratulation message and quit game
        If the number is not correct, ask again until you receive the correct answer
        As a hint, beside the first time, every time you are asking for a number, tell the user to guess higher or lower
        If the User failed 5 times, show a game over message and quit the game
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the guess game");
        System.out.println("Please I would like to know your Surname");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("You are welcome "+ name);

        System.out.println("Please are you ready we start the game?");
        System.out.println("\t 1. yes");
        System.out.println("\t 2. No");
        int answering=scanner.nextInt();

        while (answering != 1){
            System.out.println("Start the game?");
            System.out.println("\t 1. yes");
            System.out.println("\t 2. No");
            answering=scanner.nextInt();

        }
        Random random =new Random();
        int x=random.nextInt(20)+1;

        System.out.println("Can you guess a number: ");
        int guess=scanner.nextInt();

        int triedTimes=0;
        boolean hasWon=false;
        boolean shouldFinishGame=false;

        while (!shouldFinishGame) {
            triedTimes++;

            if (triedTimes < 5) {
                if (guess == x) {
                    hasWon = true;
                    shouldFinishGame = true;

                } else if (guess > x) {
                    System.out.println("You have guessed higher value, guess lower");
                    guess = scanner.nextInt();
                } else {
                    System.out.println("You have guessed a lower value, guess higher");
                    guess = scanner.nextInt();
                }

            } else {
                shouldFinishGame = true;
            }
        }

            if(hasWon){
                System.out.println("Congratulations, have your money! You have won on your "+triedTimes+" guess");

            }else {
                System.out.println("Game Over! BAD LUCK BLOOD");
                System.out.println("The number was "+x+". You have missed a Million dollar");
                shouldFinishGame=true;
            }


    }

}
