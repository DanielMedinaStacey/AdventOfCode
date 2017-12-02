package com.github.danielmedinastacey;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class DayOne {


    private final ArrayList<Integer> digits = new ArrayList<>();

    public DayOne(String inputFile) throws IOException{
        try (FileReader inputStream = new FileReader(inputFile)){
            int digit;
            while ((digit = Character.getNumericValue(inputStream.read())) != -1) {
                digits.add(digit);
            }
        }

    }

    public int getSolution(){
        int sum = 0;
        for(int i = 0, length = digits.size(); i < length; i++) {
            int j = i > 0 ? i-1 : length-1;
            if(digits.get(i).intValue() == digits.get(j).intValue()){
                sum+=digits.get(i);
            }
        }
        return sum;
    }

    public int getSolutionB(){
        int sum = 0;
        for(int i = 0, length = digits.size(); i < length; i++) {

            int j = getOpposite(i, length);

            if(digits.get(i).intValue() == digits.get(j).intValue()){
                sum+=digits.get(i);
            }
        }
        return sum;
    }

    private int getOpposite(int n, int length){
        int half = length/2;
        return n < half ? n+half : n-half;

    }


}
