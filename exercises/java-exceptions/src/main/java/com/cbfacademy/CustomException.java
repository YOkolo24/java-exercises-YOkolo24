package com.cbfacademy;

public class CustomException extends Exception {
    
    private final String message;
    
    public CustomException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return String.join(" - ", super.getMessage(), this.message);
    }
}
