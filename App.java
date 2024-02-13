/*
 */

package com.mycompany.simplequizegame;
/**
 *
 * @author Lenovo-User
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Simple Quiz Game!");
        System.out.println("Answer the following questions:");

        // Question 1
        System.out.println("\nQuestion 1: What is the Mother of Jesus?");
        System.out.println("a) Mary");
        System.out.println("b) Deborah");
        System.out.println("c) Elizabeth");
        System.out.print("Your answer: ");
        String answer1 = scanner.next().toLowerCase();
        if (answer1.equals("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Mary.");
        }

        // Question 2
        System.out.println("\nQuestion 2: How many books are in the bible ?");
        System.out.println("a) Thirty_five");
        System.out.println("b) Sixty six");
        System.out.println("c) Fifty five");
        System.out.print("Your answer: ");
        String answer2 = scanner.next().toLowerCase();
        if (answer2.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Sixty six.");
        }

        
        // Question 3
        System.out.println("\nQuestion 3: Who wrote the book of philimon?");
        System.out.println("a) Timothy");
        System.out.println("b) Paul");
        System.out.println("c) Luke");
        System.out.print("Your answer: ");
        String answer3 = scanner.next().toLowerCase();
        if (answer3.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Paul.");
        }
        // Question 4
        System.out.println("\nQuestion 4: Who Killed Goliath?");
        System.out.println("a) Samuel");
        System.out.println("b) David");
        System.out.println("c) Jabez");
        System.out.print("Your answer: b");
        String answer4 = scanner.next().toLowerCase();
        if (answer4.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is David.");
        }
        // Question 5
        System.out.println("\nQuestion 5: Who wrote the book of Leviticus?");
        System.out.println("a) Noah");
        System.out.println("b) David");
        System.out.println("c) Moses");
        System.out.print("Your answer: c");
        String answer5 = scanner.next().toLowerCase();
        if (answer5.equals("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is Moses.");
        }
        // Display final score
        System.out.println("\nYour final score is: " + score + " out of 5.");

        scanner.close();
    }
}
    

