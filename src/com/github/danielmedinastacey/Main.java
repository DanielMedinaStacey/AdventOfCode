package com.github.danielmedinastacey;


import java.io.File;
import java.io.IOException;
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
                DayOne dayone = null;
                try {
                    dayone = new DayOne(command.nextLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Solution A: "+dayone.getSolution());
                System.out.println("Solution B: "+dayone.getSolutionB());
                break;
            default:
                System.out.println("Goodbye");
                break;
        }

    }


}
