package com.github.danielmedinastacey;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DayFour extends Day {


    public DayFour(String filename) throws IOException {
        super(filename);
    }
    @Override
    public int getSolution(){
        if (inputLines == null){
            throw new IllegalStateException("Need to call 'readInput(String filename)' first.");
        }

        int valid = 0;
        for(String line : inputLines){
            String[] words = line.split(" ");
            int numberOfWords = words.length;
            int numberOfUniqueWords = Arrays.stream(words).collect(Collectors.toSet()).size();

            if(numberOfUniqueWords == numberOfWords) valid++;

        }


        return valid;
    }

    @Override
    public int getSolutionB() {
        if (inputLines == null){
            throw new IllegalStateException("Need to call 'readInput(String filename)' first.");
        }

        int valid = 0;
        for(String line : inputLines){
            String[] words = line.split(" ");
            Set<String> nonAnagramWords = new HashSet<>();


            for(int i = 0; i<words.length;i++){
                char[] word = words[i].toCharArray();
                Arrays.sort(word);

                nonAnagramWords.add(Arrays.toString(word));
            }
            int numberOfWords = words.length;
            int numberOfUniqueWords = nonAnagramWords.size();

            if(numberOfUniqueWords == numberOfWords) valid++;



        }


        return valid;
    }
}
