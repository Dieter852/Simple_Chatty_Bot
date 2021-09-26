
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction of Chatty Bot.
        System.out.println("Hello! My name is Jarvis.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, what may I call you?.");

        String userName = scanner.next();         //Input of the name of the user that will be printer out.

        System.out.println("What a great name you have, " + userName + "!");
        System.out.println("How about we guess your age.");
        System.out.println();
        System.out.println("Enter the remainders of your age that are divisible by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        // reading all remainders

        System.out.println("Your age is " + age +"; that is a great time to start programming!");
        System.out.println();
        System.out.println("Now I will prove to you that I can count to any number you choose.");

        int num = scanner.nextInt();
        int counter = 0;

        while (counter <= num) {
            System.out.println(counter + "!");
            counter++;
        }

        System.out.println();
        System.out.println("Now Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer = scanner.nextInt();
        while (answer != 2) {
            System.out.println("Sorry, that was incorrect please try again.");
            answer = scanner.nextInt();
        }
        System.out.println("Amazing!, that is correct. have a fantastic day!");

    }
}
