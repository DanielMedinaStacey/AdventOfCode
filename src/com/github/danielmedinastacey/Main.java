package com.github.danielmedinastacey;


import java.io.File;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner command = new Scanner(System.in);

        int selection;
        System.out.println("Which puzzle? ");
        selection = Integer.parseInt(command.nextLine());
        switch(selection) {
            case 1:
                System.out.println("Filename? ");
                DayOne dayone = new DayOne(new File(command.nextLine()));
                System.out.println("Solution A: "+dayone.getSolution());
                System.out.println("Solution B: "+dayone.getSolutionB());
                break;
            default:
                System.out.println("Goodbye");
                break;
        }

    }


}
