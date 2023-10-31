package com.cbfacademy.copier;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The copier should")
public class CopierTests {
    
    @Test
    @DisplayName("Copy a character from the source to the destination")
    
    void copyCharacterFromSourceToDestination() {
        final SourceSpy source = new SourceSpy();
        final DestinationSpy destination = new DestinationSpy(); 
        final Copier copier = new Copier(source, destination);

        copier.copy();

        assertTrue(source.wasCalled());
        assertTrue(destination.wasCalled());
    }
}
