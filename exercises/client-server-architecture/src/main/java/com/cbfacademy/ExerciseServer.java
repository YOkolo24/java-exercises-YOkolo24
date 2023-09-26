package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class ExerciseServer extends Exception {
    
    ServerSocket newServer = new ServerSocket(4040);
    Socket newServerChannel = newServer.accept(); 
    
        try (InputStreamReader reader = new InputStreamReader(newServerChannel.getInputStream());
            BufferedReader localHostReader = new BufferedReader(reader)) {
                
                String readText;
                while ((readText = localHostReader.readLine()) != null) {
                    System.out.println(readText);
                } 
        } catch (Exception e) {
       System.out.println(e.getMessage());
    }
    
       
}