package org.example;

import java.util.Scanner;

public class SelectionIf {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How old are you? ");
        int age = Integer.parseInt(SCANNER.nextLine());

        if(age > 0){
            if(age > 17){
                System.out.println("Your are an adult");
            }else if(age > 12 && age < 18){
                System.out.println("You are a teenager");
            }else if(age < 13 && age > 3){
                System.out.println("You are a kid");
            }else {
                System.out.println("You are a baby");
            }
        }else {
            System.out.println("You are not even born");
        }
    }

}
