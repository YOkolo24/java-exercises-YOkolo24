package com.cbfacademy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {  
    
    // Create program that loads file and prints each value to the file.
    Properties example = new Properties();
    try {
        FileInputStream input = new FileInputStream("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\homework\\input-output\\src\\main\\resources\\example.properties");
            example.load(input);
            example.forEach((key, value) -> System.out.println(key + " = " + value));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    // Create a program that creates new .properties file with specific properties

	Properties properties = new Properties();
	try {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\cbfacademy\\java-exercises-YOkolo24\\homework\\input-output\\src\\main\\resources\\configuration.properties");

		properties.setProperty("db.url", "localhost");
		properties.setProperty("db.port", "5353");
        properties.setProperty("db.user", "cbfacademy");
        properties.setProperty("db.password", "password");

		properties.store(fileOutputStream, "File properties");
        fileOutputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }
	}
}



    

