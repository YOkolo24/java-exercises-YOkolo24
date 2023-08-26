package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        
        //Read the .txt file and print to screen using nio*
        String filePath = "C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
    
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
        System.out.println("File reading exception: " + e.getMessage());
        }

        //Read source file (.txt), create new file and copy source file to new file
        Path sourcePath = Paths.get("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise.txt");
        Path newFile = Paths.get("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise3.txt");

        try (OutputStream os = new FileOutputStream(newFile.toFile())) {
            Files.copy(sourcePath, os);
        } catch (IOException ex) {
        System.out.println("File reading exception: " + ex.getMessage());
        }

        //Read the file and copy file contents in reverse
        String filePath1 = "C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise.txt";
        Path filePath2 = Paths.get("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise.txt");
        String filePath3 = "C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\exercises\\input-output\\src\\main\\resources\\exercise4.txt";
            try {
            BufferedReader input = new BufferedReader(new FileReader(filePath1));

                List<String> lines = Files.readAllLines(filePath2);
                
                input.close();

                Collections.reverse(lines);

                PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(filePath3)));
                for(Iterator i = lines.iterator(); i.hasNext();) {
                    output.println((String) i.next());
                }
                
                output.close(); 

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

}


