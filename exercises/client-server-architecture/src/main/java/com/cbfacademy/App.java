package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class App {
    public static void main(String[] args) throws Exception {

        //identify website to connect to and open connection
        URL cbfAcademyWebsite = new URL("https://academy.codingblackfemales.com/"); 
        URLConnection cbfAcademyWebsiteConnection = cbfAcademyWebsite.openConnection();
        cbfAcademyWebsiteConnection.connect();
       
        //use InputStreamReader & BufferedReader to read website and print content line by line
        try (InputStreamReader reader = new InputStreamReader(cbfAcademyWebsiteConnection.getInputStream());
            BufferedReader websiteReader = new BufferedReader(reader)) {
                String readText;
                while ((readText = websiteReader.readLine()) != null) {
                    System.out.println(readText);
                }

        // Exception handling
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
