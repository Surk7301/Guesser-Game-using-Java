package Guesser_game;

import java.util.Scanner;
import java.util.*;

class Guesser
{
    int guessNum;

    int guessingNumber()
    {
        System.out.println("Guesser! Kindly guess the number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;

    }
}
class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! Kindly guess the Number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();

    }
    void collectNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if (numFromGuesser==numFromPlayer2 && numFromGuesser == numFromPlayer3)
            {
                System.out.println("All Players won the game");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Both Player1 and Player2 won the game ");
            } else if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Both Player1 and Player3 won the game");

            }
            else
            {
                System.out.println("Player1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2)
        {
            if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Both Player2 and Player3 won the game");
            }
            else
            {
                System.out.println("Player2 won the game");
            }

        } else if (numFromGuesser == numFromPlayer3)
        {
            System.out.println("Player3 won the game");
        }
        else
        {
            System.out.println("You peoples lost the game");
        }

    }
}



 public class LaunchGame {
     public static void main(String[] args) {
         System.out.println("Game started...");
         Umpire u = new Umpire();
         u.collectNumFromGuesser();
         u.collectNumFromPlayers();
         u.compare();
     }
}
