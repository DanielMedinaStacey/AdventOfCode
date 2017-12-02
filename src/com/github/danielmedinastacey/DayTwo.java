package com.github.danielmedinastacey;

import java.io.*;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;



class DayTwo {

    private List<String> inputLines;

    public DayTwo(String filename) throws IOException{
        readInput(filename);
    }

    private void readInput(String filename) throws IOException{

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

            inputLines = reader
                    .lines()
                    .collect(Collectors.toList());

        }
    }


    public int solution(){

        if (inputLines == null){
            throw new IllegalStateException("Need to call 'readInput(String filename)' first.");
        }

        int sum = 0;
        for(String line : inputLines){

            IntSummaryStatistics lineStats = Arrays.stream(line.split("\t"))
                    .mapToInt(Integer::parseInt)
                    .summaryStatistics();

            sum += lineStats.getMax() - lineStats.getMin();
        }
        return sum;

    }

    public int solutionB(){

        if (inputLines == null){
            throw new IllegalStateException("Need to call 'readInput(String filename)' first.");
        }

        int sum = 0;
        for(String line : inputLines){

            int[] row = Arrays.stream(line.split("\t"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            ROW_LOOP:
            for(int i = 0, L=row.length; i<L;i++){

                for(int j = i+1; j < L; j++){

                    if(areDivisible(row[i],row[j])){

                        sum += Math.max(row[i]/row[j], row[j]/row[i]);
                        break ROW_LOOP;
                    }
                }
            }

        }
        return sum;

    }

    private boolean areDivisible(int A, int B){
        return ( A%B == 0 || B%A == 0);
    }
}
