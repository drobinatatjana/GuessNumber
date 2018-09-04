package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;
        do {


            int myNum = rand.nextInt(100) + 1;
            System.out.println(myNum);

            boolean userLost = true;

            for (int i = 0; i < 3; i++) {
                int userNum = askNUM();

                if (myNum > userNum) {
                    System.out.println("your number is less");
                } else if (myNum < userNum) {
                    System.out.println("your number is bigger");
                } else {
                    System.out.println("bingo");
                    userLost = false;
                    break;
                }
            }
            if (userLost == true) {
                System.out.println("you are lost");
                /*comment*/
            }
            System.out.println("one more game? print yes or no");
            answer = askYN();
        }
        while (answer.equals("yes"));
        System.out.println("good buy!");
    }

    static String askYN() {
        String answer;
        do {
            answer = scan.next();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("you van enter only yes or no!");
                continue; // here it is not obligatory
            } else {
                break;
            }
        } while (true); // endless cycle

        return answer;
    }


    static int askNUM() {
        int answer;
        do {
            try {
                answer = scan.nextInt();
            } catch (InputMismatchException e) { // e - is variable
                System.out.println("This is not number");
                scan.next();
                continue;
            }
            if (answer > 100 || answer < 1) {
                System.out.println("you  enter incorrect number!");
                scan.next();
                continue; // here it is not obligatory
            } else {
                break;
            }
        } while (true); // endless cycle

        return answer;
    }
}

