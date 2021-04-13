package org.example;

import java.util.Scanner;

public class SwitchExample {

    public static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {

        char c = SCANNER.nextLine().charAt(0);

        final char selection1 = 'a';
        final char selection2 = 'A';

        switch (c){

            case selection1:
                System.out.println("You entered menu selection " + selection1);
                break;
            case selection2:
                System.out.println("You entered menu selection " + selection2);
                break;
            default:
                System.out.println("Terminating program...");

        }


    }
}
