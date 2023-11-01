package com.cbfacademy.copier;

import java.util.ArrayList;
import java.util.List;

public class DestinationSpy implements Destination {
    
    private Integer numberOfCalls = 0;
    private final List<String> recordedCharacters = new ArrayList<>();

    @Override
    public void setCharacter(final String character) {
        this.recordedCharacters.add(character);
        this.numberOfCalls = this.numberOfCalls + 1;
        
    }
    List<String> recordedCharacters() {
        return this.recordedCharacters;
    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }

    
}
