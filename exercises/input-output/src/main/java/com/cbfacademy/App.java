package com.cbfacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
       // System.out.println("Hello World!");

    String filePath = "C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
    try (
        FileInputStream file = new FileInputStream(filePath); 
        InputStreamReader streamReader = new InputStreamReader(file);
        LineNumberReader lineReader = new LineNumberReader(streamReader);
    ) {
        String readFile = lineReader.readLine();
        while (readFile != null) {
            System.out.printf("%d: %s%n", lineReader.getLineNumber(), readFile);
            readFile = lineReader.readLine();
        }
    } catch (IOException e) {
        System.out.println("File reading exception: " + e.getMessage());
    }
    
    String fileName = "C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise2.txt";
        try (
        FileInputStream file = new FileInputStream(filePath); 
        InputStreamReader streamReader = new InputStreamReader(file);
        LineNumberReader lineReader = new LineNumberReader(streamReader);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, false);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        PrintWriter writer = new PrintWriter(outputStreamWriter);
    ) {
        String readFile = lineReader.readLine();
        while (readFile != null) {
            writer.println(readFile);
            readFile = lineReader.readLine();
        }
    } catch (IOException e) {
        System.out.println("File reading exception: " + e.getMessage());
    }

    }
}

