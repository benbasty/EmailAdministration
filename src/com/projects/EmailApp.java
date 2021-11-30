package com.projects;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the email administration system based on OOP");
        Email em1 = new Email("Ben","Acartas");
        System.out.println(em1.showInfo());
    }
}
