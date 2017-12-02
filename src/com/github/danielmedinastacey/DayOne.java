package com.github.danielmedinastacey;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DayOne {

    private BufferedInputStream bufferedInputStream;
    private File file;

    private ArrayList<Integer> digits = new ArrayList<>();

    private Scanner command = new Scanner(System.in);

    public DayOne(File file) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            int preChar;
            while (true) {
                preChar = bufferedInputStream.read();
                char truChar = (char) preChar;
                int digit = Character.getNumericValue(truChar);
                if(digit == -1) break;
                digits.add(digit);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public int getSolution(){
        int sum = 0;
        for(int i = 0, length = digits.size(); i < length; i++) {
            int j = i > 0 ? i-1 : length-1;



            if(digits.get(i) == digits.get(j)){
                sum+=digits.get(i);
            }
        }
        return sum;
    }

    public int getSolutionB(){
        int sum = 0;
        for(int i = 0, length = digits.size(); i < length; i++) {
            int j = getOpposite(i, length);
            System.out.println(digits.get(i) + " "+ j);
            if(digits.get(i) == digits.get(j)){
                sum+=digits.get(i);
            }
        }
        return sum;
    }

    private int getOpposite(int n, int length){
        int half = length/2;
        int m = n < half ? n+half : n-half;
        return m;

    }


}
