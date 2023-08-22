package com.cbfacademy;


public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        double operand1 = 25.0d;
        double operand2 = 13.0d;
        
        ArithmeticExercises exercises = new ArithmeticExercises();

        System.out.println(exercises.AddDouble(operand1, operand2));
        System.out.println(exercises.SubtractDouble(operand1, operand2));
        System.out.println(exercises.MultiplyDouble(operand1, operand2));
        System.out.println(exercises.DivideDouble(operand1, operand2));

        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++);
        System.out.println(++number2);

    }
    

}
