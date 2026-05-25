package stringMethods;

public class Main {
    public static void main(String[] args) {

        String name = "Alex Tiu";

        // methods use .
        // length method
        int length = name.length();

        System.out.println(length);

        // charat method
        char letter = name.charAt(0);

        System.out.println(letter);

        // find first occurrence of a letter
        int index = name.indexOf(" ");

        System.out.println(index);

        // find the last index
        int lastIndex = name.lastIndexOf(" ");

        System.out.println(lastIndex);

        // make everything upper case: name.toLowerCase();
        // make everything lower case: name.toUpperCase();
        // remove whitespace: name.trim();
        // replace character with another: name.replace("o", "a");
        // return boolean data types
        // name.isEmpty(); this is used for strings
        // name.contains(" "); this is used if there contains a space or whatever is in the parentheses
        // name.equals(""); if the two strings are the same. equals is NOT case sensitive
        // name.equalsIgnoreCase("");
    }
}
