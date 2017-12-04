package com.github.danielmedinastacey;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Day {

    protected List<String> inputLines;

    public Day(String filename) throws IOException{
        readMultilineInput(filename);
    }

    protected void readMultilineInput(String filename) throws IOException{

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

            inputLines = reader
                    .lines()
                    .collect(Collectors.toList());

        }
    }

    public abstract int getSolution();
    public abstract int getSolutionB();
}
