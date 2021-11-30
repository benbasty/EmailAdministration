package com.projects;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "ABCcompany.com";



    // constructor to receive the first and the last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Creating email for: " + this.firstName + " " + this.lastName);

        // call a method asking for the department - return a department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.companySuffix;
        System.out.println("Your email is: " + email);
    }

    // ask for a department
    private String setDepartment() {
        System.out.println("Enter the department name. \n1. For sales \n2. For Development \n3. For Accounting \n0. For none");
        Scanner scanner = new Scanner(System.in);
        int department = scanner.nextInt();
        if (department == 1) {
            return "Sales";
        } else if (department == 2) {
            return "Development";
        } else if (department == 3) {
            return "Accounting";
        } else {
            return "";
        }

    }

    // generate a random capacity
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailBox Capacity: " + mailboxCapacity + " mb";
    }
}
