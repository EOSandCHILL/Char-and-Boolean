public class Main {
    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myMyCopyright = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myMyCopyright);

        // System.out.println();

        /*char is a primitive data type whereas String
        is a class in java. char represents a single character
        whereas String can have zero or more characters.
        So String is an array of chars. We define char in
        java program using single quote (') whereas we can
        define String in Java using double quotes (“).

        A "char" occupies 2 bytes/16 bits of memory. Surprisingly it's
        not a single byte because you can store Unicode characters.

        Unicode is an information technology standard for the
        consistent encoding, representation, and handling of
        text expressed in most of the world's writing systems.*/

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        // A Boolean expression is a Java expression that returns a Boolean value: true or false.
    }
}