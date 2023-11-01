package com.cbfacademy.copier;

public class SourceFake implements Source {
    
    private Integer numberOfCalls = 0;
    
    @Override
    public String getCharacter() {
      this.numberOfCalls = this.numberOfCalls + 1;
      return "a";
    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }
    
}
