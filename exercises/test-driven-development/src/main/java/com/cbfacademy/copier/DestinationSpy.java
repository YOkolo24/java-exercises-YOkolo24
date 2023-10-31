package com.cbfacademy.copier;

public class DestinationSpy implements Destination {
    
    private Integer numberOfCalls = 0;

    @Override
    public void setCharacter(final String character) {
        this.numberOfCalls = this.numberOfCalls + 1;
    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }
}
