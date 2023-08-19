package com.cbfacademy;

public class FileExtension extends CustomException{
    
    public FileExtension(String message) {
        super(message);
    }
    
    public int check(String filename) throws CustomException {
        
        if(filename == null || filename.isEmpty()) {
            throw new CustomException("Filename cannot be null or empty.");

        } else if (filename.endsWith(".java")) {
          return 1;  
            
        } else {
          return 0;
        }

    }
}
