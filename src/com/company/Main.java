package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName = " ";
        String lastName = " ";
        String fullName;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();

        fullName = firstName + " " + lastName;

        System.out.println("Hello, my name is " + fullName + ".");
        int lettersInName = firstName.length()+lastName.length();
        System.out.println("There are " + lettersInName + " letters in my name.");
    }
}
