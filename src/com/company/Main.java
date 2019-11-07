package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Work var = new Work();
        String name;
        System.out.println("Enter your name: ");
        name = input.nextLine();
        String email;
        System.out.println("Enter your email: ");
        email = input.nextLine();

        String[] comp = new String[]{"company", "jobTitle", "startDate", "endDate", "JobDescription"};

        boolean answer = true;
        while (answer) {
            System.out.println("Enter your company: ");
            String company = input.nextLine();
            String jobTitle;
            System.out.println("Enter your jobTitle: ");
            jobTitle = input.nextLine();
            String startDate;
            System.out.println("Enter your startDate: ");
            startDate = input.nextLine();
            String endDate;
            System.out.println("Enter your endDate: ");
            endDate = input.nextLine();
            String jobDescription;
            System.out.println("Enter your jobDescription: ");
            jobDescription = input.nextLine();
            String jobs;
            System.out.println("Do you have more jobs to list down? (y/n) ");
            jobs = input.nextLine();

            if (jobs.equalsIgnoreCase("n")) {
                answer = false;
               String resume;

                System.out.print("The resume is: " + name + email + comp);

            }

        }

    }
}







