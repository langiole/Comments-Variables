class Example {
    public static void main(String args[]) {

        /*
            This is an example of a multi-line comment.
            Below are examples of a single-line comment.
        */

        // this is a single-line comment
        System.out.println("Hello World"); // another single-line comment

        // JAVA has different types of variables
        String s = "Hello World";   // stores text
        int i = 123;                // stores integers (whole numbers)
        double d = 1.23;            // stores decimals with 15-16 digits of precision
        float f = 1.23f;            // stores decimals with 6-7 digits of precision
        char c = 'H';               // stores single characters
        boolean b = true;           // stores either true or false

        // declare multiple variables of same type at once
        int x = 1, y = 2, z = 3;

        // use the '+' character to add variables to each other
        System.out.println(x + y + z);

        /*
            Rules about naming variables:
            - names can contain letters, digits, underscores, and dollar signs
            - names should being with a letter, but can begin with an underscore or dollar sign
            - names should begin with a lowercase letter
            - names are case sensitive (i.e. "myVar and "myvar" are different variables)
            - reserved words (i.e. int or String) cannot be used as names
        */
    }
}
