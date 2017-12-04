package com.github.danielmedinastacey;

import java.io.Console;
import java.io.IOException;



class Main {

    public static void main(String[] args){

        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }


        int selection = Integer.parseInt(console.readLine("Which puzzle?: "));
        switch(selection) {
            case 1:
                DayOne dayone = null;

                try {
                    dayone = new DayOne(console.readLine("Filename?: "));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                assert dayone != null;
                console.printf("Solution A: %d %n",dayone.getSolution());
                console.printf("Solution B: %d %n",dayone.getSolutionB());
                break;

            case 2:
                DayTwo dayTwo = null;
                try {
                    dayTwo = new DayTwo(console.readLine("Filename?:"));
                } catch (IOException e){
                    e.printStackTrace();
                }

                assert dayTwo != null;
                console.printf("Solution A: %d %n",dayTwo.solution());
                console.printf("Solution B: %d %n",dayTwo.solutionB());

            case 4:
                Day dayFour = null;
                try {
                    dayFour = new DayFour(console.readLine("Filename?:"));
                } catch (IOException e){
                    e.printStackTrace();
                }

                assert dayFour != null;
                console.printf("Solution A: %d %n",dayFour.getSolution());
                console.printf("Solution B: %d %n",dayFour.getSolutionB());

            default:
                System.out.println("Goodbye");
                break;
        }

    }


}
