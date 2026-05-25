package ternaryOperators;

public class Main {
    public static void main(String[] args){
        
        // ternary operator syntax: variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
        String output = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(output);

        // another example

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(evenOrOdd);

        // more practice example
        int hours = 13;

        String timeOfDay = (hours >= 12) ? "AM" : "PM";

        System.out.println(timeOfDay);
    }
}
