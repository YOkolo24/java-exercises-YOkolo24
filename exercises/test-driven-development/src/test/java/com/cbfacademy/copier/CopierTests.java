package com.cbfacademy.copier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The copier should")
public class CopierTests {
    
    @Test
    @DisplayName("copy a character from the source to the destination")
    
    void copyCharacterFromSourceToDestination() {
        final SourceFake source = new SourceFake();
        final DestinationSpy destination = new DestinationSpy(); 
        final Copier copier = new Copier(source, destination);

        copier.copy();

        final List<String> characters = List.of("a", "b", "c");
        assertEquals(characters, destination.recordedCharacters());
    }
}
