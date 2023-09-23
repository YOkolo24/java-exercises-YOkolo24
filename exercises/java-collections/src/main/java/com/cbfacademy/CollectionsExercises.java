package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // create an empty linked list
        LinkedList<Integer> listOfIntegers = new LinkedList<>();
        //add 4 as the first element of the list
        listOfIntegers.add(4);
        //  - then add 5, 6, 8, 2, 9 to the the list
        listOfIntegers.add(5);
        listOfIntegers.add(6);
        listOfIntegers.add(8);
        listOfIntegers.add(2);
        listOfIntegers.add(9);
        //  - add another 2 as the last element of the list
        listOfIntegers.add(2);
        //  - add 4 as the 3rd element of the list
        listOfIntegers.set(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(listOfIntegers.element());
        //  - return the list
        return listOfIntegers;
    }

    public Stack<Integer> useStack() {
        // create an empty stack
        Stack<Integer> newStack = new Stack<>();
        //  - add 5, 6, 8, 9 to the the stack
        newStack.add(5);
        newStack.add(6);
        newStack.add(8);
        newStack.add(9);
        //  - print the first element of the stack on the screen
        System.out.println(newStack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.println(newStack.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.println(newStack.pop());
        //  - invoke the push(4) method on the stack
        newStack.push(4);
        //  - return the stack
        return newStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // create an empty arrayDeque
        ArrayDeque<Integer> newArrayDeque = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the stack
        newArrayDeque.add(5);
        newArrayDeque.add(6);
        newArrayDeque.add(8);
        newArrayDeque.add(9);
        //  - print the first element of the queue on the screen
        System.out.println(newArrayDeque.getFirst());
        //  - print the last element of the queue on the screen
        System.out.println(newArrayDeque.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.println(newArrayDeque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.println(newArrayDeque.element());
        //  - return the queue
        return newArrayDeque;
    }

    public HashMap<Integer, String> useHashMap() {
        // create an empty hash map
        HashMap<Integer, String> codingLanguages = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        codingLanguages.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        codingLanguages.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        codingLanguages.put(3, "Python");
        //  - add {4, Java} entry to the map
        codingLanguages.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        codingLanguages.put(5, "Javascript");
        //  - add {6, Rust} entry to the map
        codingLanguages.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.println(codingLanguages.toString());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.println(codingLanguages.containsValue("English"));
        //  - return the map
        return codingLanguages;
    }
    
    public String getName() {
        return "Collections Exercises";
    }
}
