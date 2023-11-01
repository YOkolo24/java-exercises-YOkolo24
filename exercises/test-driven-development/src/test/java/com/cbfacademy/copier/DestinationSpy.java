package com.cbfacademy.copier;

public class DestinationSpy implements Destination {
    
    private Integer numberOfCalls = 0;
    private String recordedCharacter;

    @Override
    public void setCharacter(final String character) {
        this.numberOfCalls = this.numberOfCalls + 1;
        this.recordedCharacter = character;
    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }

    String recordedCharacter() {
        return this.recordedCharacter;
    }
}
