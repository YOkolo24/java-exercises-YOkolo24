package com.cbfacademy.copier;

public class Copier {

    private final Source source;
    private final Destination destination;

    public Copier (Source source, Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy() {
        while (true) {
           final String character = this.source.getCharacter(); 
           if (character.equals("\n")) break;
           this.destination.setCharacter(character);
        }
    }
}
