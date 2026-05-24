package printF;

public class Main {
    public static void main(String[] args) {

        // printf() = method used to format output

        String name = "Alex";
        char firstLetter = 'A';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // %s inserts a string
        System.out.printf("Hello %s\n", name);

        // %c inserts a character
        System.out.printf("Your name starts with a(n) %c\n", firstLetter);

        // %d inserts an integer
        System.out.printf("You are %d years old\n", age);

        // %f inserts a double
        // you can set precision with the double
        // %[flags][width][.precisiont][specifier-character]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numebrs are enclosed in () (kind of like accounting)
        // space = display a minus if negative, space if positive

        // 0 = zero padding, we need to do 04 for padding 4 zeros
        // number = right justified padding
        // negative number = left justified padding

        System.out.printf("You are %.1f inches tall\n", height);

        // %b inserts a bool
        System.out.printf("Employed: %b\n", isEmployed);

        // inserting two variables into printf()
        System.out.printf("%s is %d years old\n\n", name, age);
    }
}
