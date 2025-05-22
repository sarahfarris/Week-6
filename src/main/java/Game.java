import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game implements PlayableGame {
  int targetNr;
  Scanner scanner;
  ArrayList<Integer> guesses;

  public Game() {
    this.scanner = new Scanner(System.in);
    this.guesses = new ArrayList<>();
    Random random = new Random();
    this.targetNr = random.nextInt(100) + 1;
    System.out.println(targetNr);
  }

  @Override
  public void startGame() {
    System.out.println("Welcome to the guessing game!");
    System.out.println("The computer has picked a number. Try to guess.");

    boolean guessCorrectly = false;
    while (!guessCorrectly) {
      System.out.println("Enter your guess: ");
      int playerGuess = scanner.nextInt();
      if (playerGuess == targetNr) {
        guesses.add(playerGuess);
        System.out.println("You guessed correctly! Congrats!");
        System.out.println("It took " + guesses.size() + " guesses!");
        guessCorrectly = true;
      } else if (playerGuess > targetNr){
        System.out.println("Too high!");
        guesses.add(playerGuess);
      } else if (playerGuess < targetNr) {
        System.out.println("Too low!");
        guesses.add(playerGuess);
      }
    }
  }
}
